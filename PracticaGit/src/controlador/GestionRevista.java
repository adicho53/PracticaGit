package controlador;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.util.List;


import modelo.Revista;


public class GestionRevista {
	
	//private List<Articulo> articulos;
	//private List<Autor> autores;
	
	private List<Revista> revistas;
	private String pathRevista="archivos/Revistas.txt";
	
	
	public GestionRevista(){

		revistas = new ArrayList<Revista>();
		//this.revista=revista;
		
	}
	
	public void agregarRevista(String nombre, String idioma) throws Exception{
		
		Revista revis = new Revista();
		revis.setNombre(nombre);
		revis.setIdioma(idioma);
		
		
	
		FileWriter file = new FileWriter(pathRevista,true);
		
		BufferedWriter out = new BufferedWriter(file);
		String registro= "hola "+revis.getNombre()+","+revis.getIdioma();
		out.append(registro+"\n");
		out.close();
		file.close();
		System.out.println(registro);
		
		
		
	}

}
