package package9;

public class Vehiculo {
	
	private String marca;
	private String modelo;
	private String color;
	private String matricula;
	
	private boolean OnOff = false;
	private int marcha = 0;
	private int velocidadActual = 0;

	
	public Vehiculo(String marca, String modelo, String color, String matricula) {
		if (marca != null && !marca.isBlank()) {
			this.marca = marca;
		}
		if (modelo != null && !modelo.isBlank()) {
			this.modelo = modelo;
		}
		if (color != null && !color.isBlank()) {
			this.color = color;
		}
		if (matricula != null && !matricula.isBlank()) {
			this.matricula = matricula;
		}
	}
	
	public void parar() {
		this.OnOff = false;
	}

	public void arrancar() {
		this.OnOff = true;
	}

	public void cambiarVelocidad(int velocidad) {
		this.velocidadActual = velocidad;
	}
	
	public void cambiarMarcha(int marcha) {
		this.marcha = marcha;
	}
	
	public String estado() {
		String onOff = "Apagado";
		if (this.OnOff) {
			onOff = "Encendido";
		}
		return "\n--- " + this.marca + " " + this.modelo + " ---" + "\n" +
		"On/Off -> " + onOff + "\n" +
		"Marcha -> " + this.marcha + "\n" +
		"Velocidad -> " + this.velocidadActual + "\n";
	}
	
	@Override
	public String toString() {
		return "\n--- " + this.marca + " ---" + "\n" + 
		"Modelo -> " + this.modelo + "\n" + 
		"Color -> " + this.color + "\n" + 
		"Matrícula -> " + this.matricula + "\n";
	}
	
}