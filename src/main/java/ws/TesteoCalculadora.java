package ws;

import jakarta.xml.ws.Endpoint;

public class TesteoCalculadora {

	public static void main(String[] args) {
	
		Endpoint.publish("http://localhost:8090/wssoap/Calculadora", new Calculadora());
		System.out.println("http://localhost:8090/wssoap/Calculadora");
		
	}

}
