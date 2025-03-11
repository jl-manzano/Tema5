package package3;

public class Perecedero extends Producto {
	private int diasACaducar = 1;

	public Perecedero(String nombre, double precio, int diasACaducar) {

		super(nombre, precio);

		if (diasACaducar >= 1) {
			this.diasACaducar = diasACaducar;
		}

	}

	public int getDiasACaducar() {
		return diasACaducar;
	}

	public void setDiasACaducar(int diasACaducar) {
		if (diasACaducar >= 1) {
			this.diasACaducar = diasACaducar;
		}
	}

	@Override
	public String toString() {
		return super.toString() + " caduca en " + diasACaducar + " días.";
	}

	public double calcular(int cantProd) {
		double res = 0;
		switch (this.diasACaducar) {
		case 1 -> res = cantProd * (this.getPrecio() / 4);
		case 2 -> res = cantProd * (this.getPrecio() / 3);
		case 3 -> res = cantProd * (this.getPrecio() / 2);
		default -> super.calcular(cantProd);
		}
		
		return res;
	}

}
