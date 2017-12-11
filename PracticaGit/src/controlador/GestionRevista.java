package controlador;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import modelo.Revista;

public class GestionRevista {
	
	private Revista revista;
	private String pathRevista="archivos/Revistas.txt";
	
	public GestionRevista(){
		this.revista=revista;
		
	}
	
	public void guardarRevista() throws IOException{
		System.out.println(revista.getNombre()+"2222222");
		FileWriter file = new FileWriter(pathRevista,true);
		
		BufferedWriter out = new BufferedWriter(file);
		String registro= "hola"+revista.getNombre()+","+revista.getIdioma()+","+revista.getNumPag();
		out.append(registro+"\n");
		out.close();
		file.close();
		System.out.println(registro);
		
		
		
	}

}
