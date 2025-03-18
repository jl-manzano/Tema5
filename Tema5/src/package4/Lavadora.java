package package4;

public class Lavadora extends Electrodomestico {
	private int carga = 5;

	public Lavadora(double precio, double peso) {
		super(precio, peso);
	}

	public Lavadora(double precioB, double peso, String color, char consumo, int carga) {
		super(precioB, peso, color, consumo);
		if (carga > 0) {
			this.carga = carga;
		}
	}
	
	public void precioFinal() {
		super.precioFinal();
		if (this.carga > 30) {
			setPrecioB(getPrecioB() + 50); 
		}
	}

	public void setCarga(int carga) {
		if (carga > 0) {
			this.carga = carga;
		}
	}

	public int getCarga() {
		return carga;
	}

}
