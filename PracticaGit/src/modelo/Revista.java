package modelo;

public class Revista {
	private String nombre;
	private String idioma;
	private String  numPag;
	public Revista() {
		super();
		
	}
	
	public Revista(String nombre, String idioma, String numPag) {
		super();
		this.nombre = nombre;
		this.idioma = idioma;
		this.numPag = numPag;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getNumPag() {
		return numPag;
	}
	public void setNumPag(String numPag) {
		this.numPag = numPag;
	}
	
	

}
