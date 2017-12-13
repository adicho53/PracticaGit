package modelo;

public class Provincia {
	private String nombreProvincia;
	private String numHabitantes;
	private String altura;
	
	public Provincia() {
		super();
		
	}

	public Provincia(String nombreProvincia, String numHabitantes, String altura) {
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

	public String getNumHabitantes() {
		return numHabitantes;
	}

	public void setNumHabitantes(String numHabitantes) {
		this.numHabitantes = numHabitantes;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Provincia [nombreProvincia=" + nombreProvincia + ", numHabitantes=" + numHabitantes + ", altura="
				+ altura + "]";
	}
	
	
	
	
}
