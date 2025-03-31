package package9;

public class Motocicleta extends Vehiculo {
	
	private int cilindrada;
	private boolean requiereCarnet = false;
	
	public Motocicleta(String marca, String modelo, String color, String matricula, int cilindrada) {
		super(marca, modelo, color, matricula);
		
		if (cilindrada > 0) {
			this.cilindrada = cilindrada;
		}
		
		if (cilindrada >= 125) {
			this.requiereCarnet = true;
		}
	}
	
	@Override
	public String toString() {
		String requiereCarnet = "No";
		if (this.requiereCarnet) {
			requiereCarnet = "Sí";
		}
		return super.toString() +
		"Cilindrada -> " + this.cilindrada + "\n" + 
		"Requiere carnet -> " + requiereCarnet + "\n";
	}
}