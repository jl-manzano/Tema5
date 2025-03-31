package package9;

public class Turismo extends Vehiculo {

	enum Uso {
		PROFESIONAL, PARTICULAR
	}
	
	private int numeroPlazas;
	private Uso uso = Uso.PROFESIONAL;
	
	public Turismo(String marca, String modelo, String color, String matricula, int numeroPlazas, String uso) {
		super(marca, modelo, color, matricula);
		
		if (numeroPlazas > 1 && numeroPlazas < 10) {
			this.numeroPlazas = numeroPlazas;
		}
		
		switch (uso) {
			case "PROFESIONAL", "PARTICULAR" -> { this.uso = Uso.valueOf(uso); }
		}
	}
	
	@Override
	public String toString() {
		return super.toString() +
		"Plazas -> " + this.numeroPlazas + "\n" + 
		"Uso -> " + this.uso + "\n";
	}
	
	

}