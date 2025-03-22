package package5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PoligonoMain {
	// crear scanner
	static Scanner sc = new Scanner(System.in);

	// crear conjunto tipo HashSet para almacenar los poligonos
	static Set<Poligono> poligonos = new HashSet<Poligono>();

	public static void main(String[] args) {
		// variable que almacena la opción introducida por el usuario
		int opcion;
		// objeto de tipo Poligono
		Poligono poligono;
		// variable que almacena el lado1 del poligono
		double lado1;
		// variable que almacena el lado2 del poligono
		double lado2;
		// variable que almacena el lado3 del poligono
		double lado3;

		// bucle do-while para mostrar menu y ejecutar instrucciones (crear triángulo /
		// rectángulo y mostrar todos los polígonos)
		do {
			// mostrar menu
			menu();
			// leer opcion introducida por usuario
			opcion = sc.nextInt();
			// limpiar búffer
			sc.nextLine();

			// condicional switch que en base a la opcon introducida por el usuario
			// ejecutará las instrucciones correspondientes
			switch (opcion) {
			case 1 -> {
				// pedir 3 lados del triangulo
				lado1 = pedirLado();
				lado2 = pedirLado();
				lado3 = pedirLado();

				// crear poligono de tipo Triangulo
				poligono = new Triangulo(lado1, lado2, lado3);

				// añadir poligono al conjunto
				poligonos.add(poligono);
				
				System.out.println();
			}
			case 2 -> {
				// pedir 2 lados del rectángulo
				lado1 = pedirLado();
				lado2 = pedirLado();

				// crear poligono de tipo Rectángulo
				poligono = new Rectangulo(lado1, lado2);

				// añadir poligono al conjunto
				poligonos.add(poligono);
				
				System.out.println();
			}
			case 3 -> {
				// bucle for-each para listar todos los polígonos almacenados en ésta
				for (Poligono p : poligonos) {
					System.out.println(p);
					System.out.println("Area: " + p.area());
				}
				
				System.out.println();
			}
			case 4 -> {
				System.out.println("Saliendo ...");
			}
			default -> {
				System.err.println("Sin coincidencias\n");
			}
			}

		} while (opcion != 4);
	}

	static void menu() {
		System.out.println("Introduzca una opción: ");
		System.out.println("1. Introducir triángulo.");
		System.out.println("2. Introducir rectángulo.");
		System.out.println("3. Mostrar polígonos.");
		System.out.println("4. Salir\n");
	}

	public static double pedirLado() {
		double lado;
		System.out.println("\nIntroduzca el valor del lado del polígono: ");
		lado = sc.nextDouble();
		sc.nextLine();
		return lado;
	}

}
