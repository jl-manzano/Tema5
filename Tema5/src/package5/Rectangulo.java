package package5;

public class Rectangulo extends Poligono {
	/**
	 * Atributo valor de lado1 del poligono
	 */
	private double lado1 = 1;
	
	/**
	 * Atributo valor de lado2 del poligono
	 */
	private double lado2 = 1;

	/**
	 * Constructor vacío de la clase Rectángulo
	 */
	public Rectangulo() {
		super(4);
	}
	
	/**
	 * Constructor que inicializa los atributos de la clase Rectángulo y comprueba si
	 * los datos introducidos son correctos
	 * @param lado1 del rectángulo
	 * @param lado2 del rectángulo
	 */
	public Rectangulo(double lado1, double lado2) {
		
		super(4);
		
		if (lado1 >= 1) {
			this.lado1 = lado1;
		}
		
		if (lado2 >= 1) {
			this.lado2 = lado2;
		}
		
	}
	
	
	/**
	 * Getter que devuelve el valor del lado1
	 * @return Devuelve el valor del lado1
	 */
	public double getLado1() {
		return lado1;
	}

	/**
	 * Setter para establecer el valor del lado1
	 * @param lado1 del rectángulo
	 */
	public void setLado1(double lado1) {
		if (lado1 >= 1) {
			this.lado1 = lado1;
		}
	}

	/**
	 * Getter que devuelve el valor del lado2
	 * @return Devuelve el valor del lado2
	 */
	public double getLado2() {
		return lado2;
	}

	/**
	 * Setter para establecer el valor del lado2
	 * @param lado2 del rectángulo
	 */
	public void setLado2(double lado2) {
		if (lado2 >= 1) {
			this.lado2 = lado2;
		}
	}

	/**
	 * Método toString para mostrar el tipo de polígono y el valor de cada uno de sus lados
	 */
	@Override
	public String toString() {
		return "Polígono: Rectángulo\nLado 1: " + lado1 + "\nLado2: " + lado2;
	}

	@Override
	public double area() {
		return lado1 * lado2;
	}

}
