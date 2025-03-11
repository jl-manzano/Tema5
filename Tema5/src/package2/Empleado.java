package package2;

public class Empleado {
	private String nombre = "";

	public Empleado(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}
	
	@Override
	public String toString() {
		return "Empleado: " + nombre;
	}
 
}
