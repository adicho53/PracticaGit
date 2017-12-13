package modelo;

public class Autor {
private String nombre;
private String fecNac;
private String nacionalidad;
public Autor(String nombre, String fecNac, String nacionalidad) {
	super();
	this.nombre = nombre;
	this.fecNac = fecNac;
	this.nacionalidad = nacionalidad;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
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
	return "Autor [nombre=" + nombre + ", fecNac=" + fecNac + ", nacionalidad=" + nacionalidad + "]";
}


}
