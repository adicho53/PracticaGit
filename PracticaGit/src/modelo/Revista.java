package modelo;

public class Revista {
	private String nombre;
	private String idioma;
	
	public Revista() {
		super();
		
	}

	public Revista(String nombre, String idioma) {
		super();
		this.nombre = nombre;
		this.idioma = idioma;
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

	@Override
	public String toString() {
		return "Revista [nombre=" + nombre + ", idioma=" + idioma + "]";
	}
	
	
	
	
	

}
