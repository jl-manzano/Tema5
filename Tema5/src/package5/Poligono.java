package package5;

/**
 * Clase Poligono cuyo objetivo es calcular el área de varios polígonos
 * (triángulos y rectángulos)
 */
public abstract class Poligono {

	/**
	 * Atributo número de lados del poligono
	 */
	private int numeroLados = 3;

	/**
	 * Constructor que inicializa los atributos de la clase Polígono y comprueba si
	 * los datos introducidos son correctos
	 * 
	 * @param numeroLados del polígono
	 */
	public Poligono(int numeroLados) {
		if (numeroLados >= 3) {
			this.numeroLados = numeroLados;
		}
	}
	
	/**
	 * Getter que devuelve el nº de lados del Polígono
	 * @return Devuelve el nº de lados del polígono
	 */
	public int getNumeroLados() {
		return numeroLados;
	}

	/**
	 * Método toString para mostrar el número de lados de un polígono
	 * @return Devuelve el nº de lados del polígono
	 */
	@Override
	public String toString() {
		return "Polígono\n Número de lados: " + numeroLados;
	}
	
	/**
	 * Método area que calcula y devuelve el área
	 * @return Devuelve el área
	 */
	public abstract double area();



	
	

}
