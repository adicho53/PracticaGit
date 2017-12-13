package modelo;

public class Pais {
	private String nombreP;
	private String presidente;
	private String idioma;
	public Pais(String nombreP, String presidente, String idioma) {
		super();
		this.nombreP = nombreP;
		this.presidente = presidente;
		this.idioma = idioma;
	}
	public Pais() {
		super();
	
	}
	public String getNombreP() {
		return nombreP;
	}
	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}
	public String getPresidente() {
		return presidente;
	}
	public void setPresidente(String presidente) {
		this.presidente = presidente;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	@Override
	public String toString() {
		return "Pais [nombreP=" + nombreP + ", presidente=" + presidente + ", idioma=" + idioma + "]";
	}
	

}
