package package_examen;

import java.util.Objects;

public class MandoADistancia implements Comparable<MandoADistancia> {
	 private String modelo = "No especificado";
	 private double anchura = 0.1;
	 private double altura = 0.1;
	 private double precio = 0;
	 private boolean onOff = false;
	 
	 public MandoADistancia(String modelo, double anchura, double altura, double precio, boolean onOff) {
		 if (modelo != null && !modelo.isBlank()) {
			 this.modelo = modelo;
		 }
		 
		 if (anchura > 0) {
			 this.anchura = anchura;
		 }
		 
		 if (altura > 0) {
			 this.altura = altura;
		 }
		 
		 if (precio >= 0) {
			 this.precio = precio;
		 }
		 
	 }

	public String getModelo() {
		return modelo;
	}

	public double getAnchura() {
		return anchura;
	}

	public double getAltura() {
		return altura;
	}

	public double getPrecio() {
		return precio;
	}

	public boolean isOnOff() {
		return onOff;
	}

	public void setPrecio(double precio) {
		 if (precio >= 0) {
			 this.precio = precio;
		 }
	}
	
	public boolean encenderMando() {
		boolean valido = false;
		if (!this.onOff) {
			this.onOff = true;
			valido = true;
		}
		
		return valido;
	}
	
	public boolean apagarMando() {
		boolean valido = false;
		if (this.onOff) {
			this.onOff = false;
			valido = true;
		}
		
		return valido;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(modelo);
	}

	@Override
	public boolean equals(Object obj) {
		MandoADistancia other = (MandoADistancia) obj;
		return this.modelo.equalsIgnoreCase(other.modelo);
	}

	@Override
	public String toString() {
		 return "Modelo: " + modelo + "\nAnchura: " + anchura + "\nAltura: " + altura + "\nPrecio: " + precio + "\nEstado: " + (onOff ? "Encendido" : "Apagado");
	 }

	@Override
	public int compareTo(MandoADistancia o) {
		return this.modelo.compareTo(o.modelo);
	}
	 
}
