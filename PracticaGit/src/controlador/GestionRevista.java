package controlador;

import java.io.FileWriter;
import java.io.IOException;

import modelo.Revista;

public class GestionRevista {
	
	private Revista revista;
	private String pathRevista="archivos/Revistas.txt";
	
	public GestionRevista(){
		
	}
	
	public void guardarRevista() throws IOException{
		FileWriter file = new FileWriter(pathRevista);
		
		
		
	}

}
