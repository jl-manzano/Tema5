package package4;

public class Television extends Electrodomestico {
	private int resolucion = 20;
	private boolean sintonizadorTDT = false;
	
	public Television(double precioB, int peso) {
		super(precioB, peso);
	}
	
	public Television(double precio, double peso, ColorE color, ConsumoE consumo, int resolucion, boolean sintonizadorTDT) {
		super(precio, peso, color, consumo);
		if (resolucion >= 20) {
			this.resolucion = resolucion;
		}
		
		this.sintonizadorTDT = sintonizadorTDT;
		
	}
	
	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	
	public void precioFinal() {
		super.precioFinal();
		if(resolucion > 40) {
			setPrecioB(getPrecioB() * 0.3);
		} 
		
		if (this.sintonizadorTDT) {
			setPrecioB(getPrecioB() + 50);
		}
	}

}
