package controlador;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.util.List;

import modelo.Articulo;
import modelo.Autor;
import modelo.Revista;

public class GestionRevista {

	private List<Revista> revistas;
	private List<Articulo> articulos;
	private List<Autor> autores;
	private String pathRevista = "archivos/Revistas.txt";

	public GestionRevista() {

		revistas = new ArrayList<Revista>();
		articulos = new ArrayList<Articulo>();
		autores = new ArrayList<Autor>();

	}

	public void agregarRevista(String nombre, String idioma, String titulo, String pagInicio, String pagFinal,
			String nombreA, String nacionalidad, String fecNac) throws Exception {

		Revista revis = new Revista();
		revis.setNombre(nombre);
		revis.setIdioma(idioma);
		revistas.add(revis);

		Articulo art = new Articulo();
		art.setTitulo(titulo);
		art.setPagInicio(pagInicio);
		art.setPagFinal(pagFinal);
		articulos.add(art);

		Autor aut = new Autor();
		aut.setNombre(nombreA);
		aut.setNacionalidad(nacionalidad);
		aut.setFecNac(fecNac);

		FileWriter file = new FileWriter(pathRevista, true);

		BufferedWriter out = new BufferedWriter(file);
		String registro = "Revista: " + revis.getNombre() + ", Idioma: " + revis.getIdioma() + "\n" + "Articulo: "
				+ art.getTitulo() + ", Inicio del articulo en la pagina: " + art.getPagInicio()
				+ ", Fin del articulo en la pagina: " + art.getPagFinal() + "\n" + "Autor: " + aut.getNombreA()
				+ ", Nacionalidad: " + aut.getNacionalidad() + ", Fecha de nacimiento: " + aut.getFecNac() + "\n"
				+ "========================================================" + "\n" + "\n";
		out.append(registro + "\n");
		out.close();
		file.close();
		System.out.println(registro);

	}
	
	public boolean validarRepeticion(String nombre,  String titulo,
			String nombreA) throws Exception{
		
		
		int n = 1;
		if (autores.size() > 0) {
			for (int i = 0; i < autores.size(); i++) {
				if (nombre.equals(revistas.get(i).getNombre()) && titulo.equals(articulos.get(i).getTitulo())
						&& nombreA.equals(autores.get(i).getNombreA())) {
					n++;
				}
			}
			if (n > 1) {
				throw new Exception("El articulo ya se encuentra registrando en esta revista con el mismo autor");
			}
		}
		return false;
				
		
	}

	public boolean validadTextosVacios(String nombre, String idioma, String titulo, String pagInicio, String pagFinal,
			String nombreA, String nacionalidad, String fecNac) {
		if (nombre.equals("") || idioma.equals("") || titulo.equals("") || pagInicio.equals("") || pagFinal.equals("")
				|| nombreA.equals("") || nacionalidad.equals("") || fecNac.equals("")) {
			return false;
		}

		return true;

	}

	public List<Revista> getRevistas() {
		return revistas;
	}

	public List<Articulo> getArticulos() {
		return articulos;
	}

	public List<Autor> getAutores() {
		return autores;
	}

}
