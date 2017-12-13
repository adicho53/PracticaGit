package modelo;

public class Provincia {
	private String nombreProvincia;
	private int numHabitantes;
	private int altura;
	public Provincia(String nombreProvincia, int numHabitantes, int altura) {
		super();
		this.nombreProvincia = nombreProvincia;
		this.numHabitantes = numHabitantes;
		this.altura = altura;
	}
	public String getNombreProvincia() {
		return nombreProvincia;
	}
	public void setNombreProvincia(String nombreProvincia) {
		this.nombreProvincia = nombreProvincia;
	}
	public int getNumHabitantes() {
		return numHabitantes;
	}
	public void setNumHabitantes(int numHabitantes) {
		this.numHabitantes = numHabitantes;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Provincia [nombreProvincia=" + nombreProvincia + ", numHabitantes=" + numHabitantes + ", altura="
				+ altura + "]";
	}
	
	
	
}
