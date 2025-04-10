package package16;

import java.util.Objects;

public class Titular implements Comparable<Titular> {
	private String dni;
	private String nombre;
	private String apellidos;
	private String telefono;

	public Titular(String dni, String nombre, String apellidos, String telefono) {
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (apellidos != null && !apellidos.isBlank()) {
			this.apellidos = apellidos;
		}

		if (telefono != null && !telefono.isBlank()) {
			this.telefono = telefono;
		}
	}

	public Titular(String dni) {
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}

	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	public void setApellidos(String apellidos) {
		if (apellidos != null && !apellidos.isBlank()) {
			this.apellidos = apellidos;
		}
	}

	public void setTelefono(String telefono) {
		if (telefono != null && !telefono.isBlank()) {
			this.telefono = telefono;
		}
	}

	@Override
	public boolean equals(Object obj) {

		boolean sonIguales = false;

		Titular otro = (Titular) obj;

		if (this.dni.equalsIgnoreCase(otro.dni)) {
			sonIguales = true;
		}

		return sonIguales;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public int compareTo(Titular o) {
		return this.dni.compareTo(o.dni);
	}

	public String toString() {

		String titular = "Titular: " + nombre + "\nApellidos: " + apellidos + "\nDNI: " + dni + "\nTeléfono: "
				+ telefono;

		return titular;

	}

}
