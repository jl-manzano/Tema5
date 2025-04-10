package package13;

/**
 * Clase Socio destinada a crear un nuevo Socio
 */
public class Socio implements Comparable<Socio> {
	/**
	 * Atributo id del socio
	 */
	private int id;
	/**
	 * Atributo nombre del socio
	 */
	private String nombre;
	/**
	 * Atributo edad del socio
	 */
	private int edad;

	/**
	 * Constructor que inicializa los atributos de la clase Socio y comprueba si los
	 * datos introducidos son correctos
	 * 
	 * @param id     del socio
	 * @param nombre del socio
	 * @param edad   del socio
	 */
	public Socio(int id, String nombre, int edad) {
		if (id >= 0) {
			this.id = id;
		}

		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}

		if (edad >= 0) {
			this.edad = edad;
		}

	}
	
	
	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	/**
	 * Método compareTo para indicar la posición de cada uno de los socios en la
	 * lista
	 * @return Devuelve la posición del socio en la lista
	 */
	@Override
	public int compareTo(Socio o) {
		return this.id - o.id;
	}

	/**
	 * Método toString para mostrar los datos de un Socio
	 * @return Devuelve una cadena con los datos del socio
	 */
	@Override
	public String toString() {
		return "Socio: " + id + ", Nombre: " + nombre + ", Edad: " + edad;
	}

}
