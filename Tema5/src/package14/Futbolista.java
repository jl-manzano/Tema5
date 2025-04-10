package package14;

/**
 * Clase Futbolista destinada a crear un nuevo Futbolista
 */
public class Futbolista implements Comparable<Futbolista> {
	/**
	 * Atributo numCamiseta del futbolista
	 */
	private int numCamiseta;
	/**
	 * Atributo nombre del futbolista
	 */
	private String nombre;
	/**
	 * Atributo edad del futbolista
	 */
	private int edad;
	/**
	 * Atributo numGoles del futbolista
	 */
	private int numGoles;

	/**
	 * Constructor que inicializa los atributos de la clase Futbolista y comprueba
	 * si los datos introducidos son correctos
	 * 
	 * @param numCamiseta del futbolista
	 * @param nombre      del futbolista
	 * @param edad        del futbolista
	 * @param numGoles    del futbolista
	 */
	public Futbolista(int numCamiseta, String nombre, int edad, int numGoles) {
		if (numCamiseta >= 0) {
			this.numCamiseta = numCamiseta;
		}

		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}

		if (edad >= 0) {
			this.edad = edad;
		}

		if (numGoles >= 0) {
			this.numGoles = numGoles;
		}

	}
	
		public int getNumCamiseta() {
		return numCamiseta;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public int getNumGoles() {
		return numGoles;
	}

	/**
	 * Método compareTo para indicar la posición de cada uno de los futbolistas en
	 * la lista
	 * 
	 * @return Devuelve la posición del futbolista en la lista
	 */
	@Override
	public int compareTo(Futbolista o) {
		int res = 0;
		
		if (this.numCamiseta == o.numCamiseta) {
			res = this.nombre.compareTo(o.nombre);
		} else {
			res = numCamiseta - o.numCamiseta;
		}
		return res;
	}

	/**
	 * Método equals que compara si 2 futbolistas son iguales y devuelve 'true' si
	 * lo son y 'false' si no lo son
	 * @return Devuelve 'true' si son iguales; 'false' si no lo son
	 */
	@Override
	public boolean equals(Object obj) {

		boolean sonIguales = false;

		Futbolista f = (Futbolista) obj;

		if (numCamiseta == f.numCamiseta && nombre.equals(f.nombre)) {
			sonIguales = true;
		}

		return sonIguales;

	}

	/**
	 * Método toString para mostrar los datos de un Futbolista
	 * 
	 * @return Devuelve una cadena con los datos del futbolista
	 */
	@Override
	public String toString() {
		return "Futbolista: " + nombre + ", Dorsal: " + numCamiseta + ", Edad: " + edad + ", Goles: " + numGoles;
	}

}
