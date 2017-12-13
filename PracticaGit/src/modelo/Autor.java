package modelo;

public class Autor {
private String nombreA;
private String fecNac;
private String nacionalidad;
public Autor(String nombreA, String fecNac, String nacionalidad) {
	super();
	this.nombreA = nombreA;
	this.fecNac = fecNac;
	this.nacionalidad = nacionalidad;
}
public Autor() {
	super();
	// TODO Auto-generated constructor stub
}
public String getNombreA() {
	return nombreA;
}
public void setNombre(String nombre) {
	this.nombreA = nombre;
}
public String getFecNac() {
	return fecNac;
}
public void setFecNac(String fecNac) {
	this.fecNac = fecNac;
}
public String getNacionalidad() {
	return nacionalidad;
}
public void setNacionalidad(String nacionalidad) {
	this.nacionalidad = nacionalidad;
}
@Override
public String toString() {
	return "Autor [nombre=" + nombreA + ", fecNac=" + fecNac + ", nacionalidad=" + nacionalidad + "]";
}


}
