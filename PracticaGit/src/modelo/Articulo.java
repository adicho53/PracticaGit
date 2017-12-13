package modelo;

public class Articulo {
	private String titulo;
	private String pagInicio;
	private String pagFinal;
	public Articulo(String titulo, String pagInicio, String pagFinal) {
		super();
		this.titulo = titulo;
		this.pagInicio = pagInicio;
		this.pagFinal = pagFinal;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getPagInicio() {
		return pagInicio;
	}
	public void setPagInicio(String pagInicio) {
		this.pagInicio = pagInicio;
	}
	public String getPagFinal() {
		return pagFinal;
	}
	public void setPagFinal(String pagFinal) {
		this.pagFinal = pagFinal;
	}
	@Override
	public String toString() {
		return "Articulo [titulo=" + titulo + ", pagInicio=" + pagInicio + ", pagFinal=" + pagFinal + "]";
	}
	
	
	
}
