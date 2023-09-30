package ws;
import jakarta.jws.WebMethod;  
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

@WebService
public class Dado {

	@WebMethod
	public Integer tirarDado () {
		return (int) (Math.random() * 6 + 1);
	}
	
	@WebMethod(operationName = "TirarMasDeUnDado")
	@WebResult(name = "Resultado")
	public String tirarDadoCaras(@WebParam(name= "CantidadDeCaras")int cantCaras) {
	
		String resultado = "";	
		
		if (cantCaras <= 20 && cantCaras > 0 && cantCaras != 0) {
			Integer tirada = (int) (Math.random() * cantCaras + 1);
			resultado = "Se tiro un dado de " + cantCaras + " caras y salio " + tirada.toString();
		} else {
			resultado = "No existe un dado con " + cantCaras + " caras";
		}
		return resultado;
	}
	
	@WebMethod(operationName = "TirarParaGenerala")
	@WebResult(name = "ResultadoGenerala")
	public String tirarGenerala(@WebParam(name = "cantidadDeDados")int cantidadDeDados) {
	
		String resultado = "";
		
		if (cantidadDeDados > 0 && cantidadDeDados < 6) {
			for (int i = 0; i < cantidadDeDados; i++) {
				resultado += tirarDado().toString() + " ";
			}
		} else {
			resultado = "En la generala se puede tirar entre 1 y 5 dados";
		}
		
		return resultado;
	}
	
}
