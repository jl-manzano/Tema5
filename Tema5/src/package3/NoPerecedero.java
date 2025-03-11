package package3;

public class NoPerecedero extends Producto {

	String tipo = "";

	public NoPerecedero(String nombre, double precio, String tipo) {

		super(nombre, precio);

		if (tipo != null && !tipo.isBlank()) {
			this.tipo = tipo;
		}

	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if (tipo != null && !tipo.isBlank()) {
			this.tipo = tipo;
		}
	}
	
	public String toString() {
		return super.toString() + " Tipo: " + this.tipo;
	}
	
	public double calcular(int cantProd) {
		return super.calcular(cantProd);
	}

}
