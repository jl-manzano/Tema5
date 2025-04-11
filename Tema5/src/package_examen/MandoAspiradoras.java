package package_examen;

public class MandoAspiradoras extends MandoADistancia implements Velocidad {

	private int velocidad = 0;
	
	public MandoAspiradoras(String modelo, double anchura, double altura, double precio, boolean onOff, int velocidad) {
		super(modelo, anchura, altura, precio, onOff);
	}

	@Override
	public boolean aumentarVelocidad() {
		boolean valido = false;

		if ((this.velocidad + 1) <= 3) {
			this.velocidad += 1;
			valido = true;
		}
		return valido;
	}

	@Override
	public boolean reducirVelocidad() {
		boolean valido = false;

		if ((this.velocidad + 1) >= 0) {
			this.velocidad += 1;
			valido = true;
		}
		return valido;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nVelocidad: " + this.velocidad;
	}	

}
