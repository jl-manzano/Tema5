package package_examen;

public class MandoMinicadena extends MandoADistancia implements Volumen {
	
	private int volumen = 0;
	
	public MandoMinicadena(String modelo, double anchura, double altura, double precio, boolean onOff, int volumen) {
		super(modelo, anchura, altura, precio, onOff);
		
		 if (volumen >= 0) {
			 this.volumen = volumen;
		 }
		
	}
	
	public int getVolumen() {
		return volumen;
	}

	@Override
	public boolean aumentarVolumen() {
		boolean valido = false;
		
		if((this.volumen + 10) <= 100) {
			this.volumen += 10;
			valido = true;
		}
		return valido;
	}

	@Override
	public boolean reducirVolumen() {
		boolean valido = false;
		
		if((this.volumen - 10) >= 0) {
			this.volumen -= 10;
			valido = true;
		}
		return valido;	
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nVolumen: " + this.volumen;
	}

}
