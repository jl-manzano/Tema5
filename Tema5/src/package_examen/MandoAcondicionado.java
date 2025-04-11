package package_examen;

public class MandoAcondicionado extends MandoADistancia implements Velocidad {

	enum Modo {
		FRIO, CALOR
	}

	private Modo modo = Modo.FRIO;
	private int velocidad = 0;
	private int temp = 0;

	public MandoAcondicionado(String modelo, double anchura, double altura, double precio, boolean onOff, int velocidad,
			int temp, String modo) {
		super(modelo, anchura, altura, precio, onOff);
		
		switch (modo) {
		case "FRIO", "CALOR" -> {
			this.modo = Modo.valueOf(modo);
		}
		}
		
		if (velocidad >= 0) {
			this.velocidad = velocidad;
		}
		
		if (temp >= 0) {
			this.temp = temp;
		}
		
	}

	public Modo getModo() {
		return modo;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public int getTemp() {
		return temp;
	}

	public void setModo(String modo) {
		switch (modo) {
		case "FRIO", "CALOR" -> {
			this.modo = Modo.valueOf(modo);
		}
		}
	}

	public void setTemp(int temp) {
		if (temp >= 0) {
			this.temp = temp;
		}
	}

	@Override
	public boolean aumentarVelocidad() {
		boolean valido = false;

		if ((this.velocidad + 1) <= 5) {
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
		return super.toString() + "\nTemperatura: " + this.temp + " ºC \nVelocidad: " + this.velocidad + " \nModo: " + this.modo;
	}	

}
