package controlador;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import modelo.Canton;
import modelo.Pais;
import modelo.Provincia;

public class GestionPais {

	private List<Pais> paises;
	private List<Provincia> provincias;
	private List<Canton> cantones;
	private String pathPais = "archivos/Paises.txt";

	public GestionPais() {

		paises = new ArrayList<Pais>();
		provincias = new ArrayList<Provincia>();
		cantones = new ArrayList<Canton>();

	}

	public void agregarPais(String nombreP, String idioma, String presidente, String nombreProvincia, String altura,
			String numHabitantes, String nombreCanton, String alcalde) {

		Pais pais = new Pais();
		pais.setNombreP(nombreP);
		pais.setIdioma(idioma);
		pais.setPresidente(presidente);
		paises.add(pais);

		Provincia pro = new Provincia();
		pro.setNombreProvincia(nombreProvincia);
		pro.setNumHabitantes(numHabitantes);
		pro.setAltura(altura);
		provincias.add(pro);

		Canton can = new Canton();
		can.setNombreCanton(nombreCanton);
		can.setAlcalde(alcalde);
		cantones.add(can);

		FileWriter file;
		try {
			file = new FileWriter(pathPais, true);
			BufferedWriter out = new BufferedWriter(file);
			String registro = "Pais: " + pais.getNombreP() + ", Idioma: " + pais.getIdioma() + ",Presidente: "
					+ pais.getPresidente() + "\n" + "" + "Provincia: " + pro.getNombreProvincia()
					+ ", Numero de Habitantes: " + pro.getNumHabitantes() + ", Altura: " + pro.getAltura() + "\n"
					+ "Canton: " + can.getNombreCanton() + ", Alcalde: " + can.getAlcalde() + "\n"
					+ "========================================================" + "\n" + "\n";
			out.append(registro + "\n");
			out.close();
			file.close();
			System.out.println(registro);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public boolean validadTextosVacios(String nombreP, String idioma, String presidente, String nombreProvincia,
			String altura, String numHabitantes, String nombreCanton, String alcalde) {
		if (nombreP.equals("") || idioma.equals("") || presidente.equals("") || nombreProvincia.equals("")
				|| altura.equals("") || numHabitantes.equals("") || nombreCanton.equals("") || alcalde.equals("")) {
			return false;
		}

		return true;

	}

	public List<Pais> getRevistas() {
		return paises;
	}

	public List<Provincia> getArticulos() {
		return provincias;
	}

	public List<Canton> getAutores() {
		return cantones;
	}

}
