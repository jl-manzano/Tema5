package package4;

import java.util.ArrayList;

public class ElectrodomesticoMain {
	public static void main(String[] args) {
		// Creamos una lista tipo ArrayList para almacenar los Electrodomésticos
		ArrayList<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();

		// Añadimos 3 artículos de tipo Electrodoméstico, Lavadora y Televisión a la
		// lista
		electrodomesticos.add(new Electrodomestico(300, 200, "blanco", 'B'));
		electrodomesticos.add(new Lavadora(500, 400, "negro", 'D', 10));
		electrodomesticos.add(new Television(299, 10, "negro", 'D', 25, false));

		// Variable para alamacenar el precio total de artículos de tipo
		// Electrodoméstico
		double precioElectrodomestico = 0;

		// Variable para alamacenar el precio total de artículos de tipo Lavadora
		double precioLavadora = 0;

		// Variable para alamacenar el precio total de artículos de tipo Televisión
		double precioTelevision = 0;

		// Bucle for-each -> recorrer lista
		for (Electrodomestico elec : electrodomesticos) {
			// Mostrar en pantalla el precio Base
			System.out.println("Precio Base: " + elec.getPrecioB());
			// Actualizar precio
			elec.precioFinal();
			// Mostrar artículo (toString)
			System.out.println(elec);

			// Verificar si el objeto es una instancia de Electrodomestico y acumular su
			// precio base
			if (elec instanceof Electrodomestico) {
				precioElectrodomestico += elec.getPrecioB();
			}

			// Verificar si el objeto es una instancia de Lavadora y acumular su precio base
			if (elec instanceof Lavadora) {
				precioLavadora += elec.getPrecioB();
			}

			// Verificar si el objeto es una instancia de Television y acumular su precio
			// base
			if (elec instanceof Television) {
				precioTelevision += elec.getPrecioB();
			}

		}

		// Mostrar en pantalla el total acumulado de artículos de tipo Electrodoméstico
		System.out.println("\nPrecio Electrodomésticos: " + precioElectrodomestico);
		// Mostrar en pantalla el total acumulado de artículos de tipo Lavadora
		System.out.println("Precio Lavadoras: " + precioLavadora);
		// Mostrar en pantalla el total acumulado de artículos de tipo Televisión
		System.out.println("Precio Televisión: " + precioTelevision);

	}
}
