package package_examen;

public class MandoTelevision extends MandoADistancia implements Volumen {

	private int volumen;
	private int canal;
	
	  public MandoTelevision(String modelo, double anchura, double altura, double precio, boolean onOff, int volumen, int canal) {
		  super(modelo, anchura, altura, precio, onOff);
		  
			 if (volumen >= 0) {
				 this.volumen = volumen;
			 }
			 
			 if (canal >= 0) {
				 this.canal = canal;
			 }
		  
	}
	  
	public int getVolumen() {
		return volumen;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		 if (canal >= 0) {
			 this.canal = canal;
		 }
	}


	@Override
	public boolean aumentarVolumen() {
		boolean valido = false;
		
		if((this.volumen + 5) <= 100) {
			this.volumen += 5;
			valido = true;
		}
		return valido;
	}

	@Override
	public boolean reducirVolumen() {
		boolean valido = false;
		
		if((this.volumen - 5) >= 0) {
			this.volumen -= 5;
			valido = true;
		}
		return valido;	
	}

	@Override
	public String toString() {
		return super.toString() + "\nVolumen: " + this.volumen + "\nCanal: " + this.canal;
	}
	
}
