package package11;

public class Titular {
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
	
	
		 
	 
}
