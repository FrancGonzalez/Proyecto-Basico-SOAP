package ws;

import jakarta.xml.ws.Endpoint;

public class TesteoDado {

	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:8090/wssoap/Dado", new Dado());
		System.out.println("http://localhost:8090/wssoap/Dado");
		
	}
	

}
