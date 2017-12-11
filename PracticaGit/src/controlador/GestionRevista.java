package controlador;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import modelo.Revista;

public class GestionRevista {
	
	private List<Revista> revistas;
	//private String pathRevista="archivos/Revistas.txt";
	
	public GestionRevista(){
		revistas = new ArrayList<Revista>();
		//this.revista=revista;
		
	}
	
	public List<Revista> getRevista() {
		return revistas;
	}

	
	public void crearRevista(String nombre,String idioma,String numPag){
Revista rev =  new Revista();
rev.setNombre(nombre);
rev.setIdioma(idioma);
rev.setNumPag(numPag);
revistas.add(rev);

	}
	
	/*public void guardarRevista() throws IOException{
		
		FileWriter file = new FileWriter(pathRevista,true);
		
		BufferedWriter out = new BufferedWriter(file);
		String registro= "hola"+revista.getNombre()+","+revista.getIdioma()+","+revista.getNumPag();
		out.append(registro+"\n");
		out.close();
		file.close();
		System.out.println(registro);
		
		
		
	}*/

}
