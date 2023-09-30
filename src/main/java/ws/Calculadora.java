package ws;
import jakarta.jws.WebMethod;  
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

@WebService
public class Calculadora {

	@WebMethod(operationName = "Sumar")
	@WebResult(name = "ResultadoDeSuma")
	public Integer Sumar(int a, int b) {
		return a + b;
	}
	
	@WebMethod(operationName = "Resta")
	@WebResult(name = "ResultaDeResta")
	public Integer Resta(int a, int b) {
		return a - b;
	}
	
	@WebMethod(operationName = "Dividir")
	@WebResult(name = "ResultadoDeDividir")
	public String Dividir(int a, int b) {
		
		String resultado = "";
		
		if (b == 0 && a == 0) {
			resultado = "Ingresaste 0 como divisor y dividendo";
		} else if (a == 0) {
			resultado = "Ingresaste 0 como dividendo";
		} else if (b == 0){
			resultado = "Ingresaste 0 como divisor";
		} else if (a > 0 && b > 0) {
			Integer division = a / b;
			resultado = division.toString() + " ";
		}
		return resultado;
		
	}
	@WebMethod(operationName = "Multiplicar")
	@WebResult(name = "ResultadoDeMultiplicar")
	public Integer Multiplicacion(int a, int b) {
		return a * b;
	}
	
}
