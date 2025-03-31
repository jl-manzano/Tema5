package package9;

public class Camion extends Vehiculo {

	private int pesoMaximoAutorizado;
	private boolean mercanciaPeligrosa;
	
	public Camion(String marca, String modelo, String color, String matricula, int pesoMaximoAutorizado, boolean mercanciaPeligrosa) {
		super(marca, modelo, color, matricula);
		
		if (pesoMaximoAutorizado > 1000) {
			this.pesoMaximoAutorizado = pesoMaximoAutorizado;
		}
		
		this.mercanciaPeligrosa = mercanciaPeligrosa;
	}
	
	@Override
	public String toString() {
		String mercanciaPeligrosa = "No";
		if (this.mercanciaPeligrosa) {
			mercanciaPeligrosa = "Sí";
		}
		return super.toString() +
		"Peso maximo autorizado -> " + this.pesoMaximoAutorizado + "\n" + 
		"Transporta mercancias peligrosas -> " + mercanciaPeligrosa + "\n";
	}

}
