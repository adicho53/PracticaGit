package modelo;

public class Canton {
	private String nombreCanton;
	private String alcalde;
	public Canton(String nombreCanton, String alcalde) {
		super();
		this.nombreCanton = nombreCanton;
		this.alcalde = alcalde;
	}
	public String getNombreCanton() {
		return nombreCanton;
	}
	public void setNombreCanton(String nombreCanton) {
		this.nombreCanton = nombreCanton;
	}
	public String getAlcalde() {
		return alcalde;
	}
	public void setAlcalde(String alcalde) {
		this.alcalde = alcalde;
	}
	@Override
	public String toString() {
		return "Canton [nombreCanton=" + nombreCanton + ", alcalde=" + alcalde + "]";
	}
	
	
	
}
