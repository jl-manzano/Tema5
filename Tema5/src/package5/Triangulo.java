package package5;

public class Triangulo extends Poligono {
	/**
	 * Atributo valor de lado1 del poligono
	 */
	private double lado1 = 1;
	
	/**
	 * Atributo valor de lado2 del poligono
	 */
	private double lado2 = 1;
	
	/**
	 * Atributo valor de lado3 del poligono
	 */
	private double lado3 = 1;

	/**
	 * Constructor vacío de la clase Triángulo
	 */
	public Triangulo() {
		super(3);
	}
	
	/**
	 * Constructor que inicializa los atributos de la clase Triangulo y comprueba si
	 * los datos introducidos son correctos
	 * @param lado1 del triángulo
	 * @param lado2 del triángulo
	 * @param lado3 del triángulo
	 */
	public Triangulo(double lado1, double lado2, double lado3) {
		
		super(3);
		
		if (lado1 >= 1) {
			this.lado1 = lado1;
		}
		
		if (lado2 >= 1) {
			this.lado2 = lado2;
		}
		
		if (lado3 >= 1) {
			this.lado3 = lado3;
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
	 * Getter que devuelve el valor del lado3
	 * @return Devuelve el valor del lado3
	 */
	public double getLado3() {
		return lado3;
	}

	/**
	 * Setter para establecer el valor del lado3
	 * @param lado3 del rectángulo
	 */
	public void setLado3(double lado3) {
		if (lado3 >= 1) {
			this.lado3 = lado3;
		}
	}

	/**
	 * Método toString para mostrar el tipo de polígono y el valor de cada uno de sus lados
	 */
	@Override
	public String toString() {
		return "Polígono: Triángulo\nLado 1: " + lado1 + "\nLado2: " + lado2 + "\nLado3: " + lado3;
	}

	@Override
	public double area() {
		double semiPerim = (lado1 + lado2 + lado3) / 2;
		return Math.sqrt(semiPerim * (semiPerim - lado1) * (semiPerim - lado2) * (semiPerim - lado3));
	}

}
