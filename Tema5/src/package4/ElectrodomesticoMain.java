package package4;

import java.util.ArrayList;

public class ElectrodomesticoMain {
	public static void main(String[] args) {
		ArrayList<Electrodomestico> lista = new ArrayList<Electrodomestico>();
		
		lista.add(new Electrodomestico(300, 200, "blanco", 'B'));
		lista.add(new Lavadora(500, 400, "negro", 'D', 10));
		lista.add(new Television(299, 10, "negro", 'D', 25, false));
		
		double precioElectrodomesticos = 0;
		double precioLavadoras = 0;
		
		for (Electrodomestico elec : lista) {
			elec.precioFinal();
            System.out.println(elec + ": " + elec.getPrecioB());
		
			if (elec instanceof Electrodomestico) {
				precioElectrodomesticos += elec.getPrecioB();
			}
			
			if (elec instanceof Lavadora) {
				precioLavadoras += elec.getPrecioB();
			}
		
		}
		
		System.out.println("\nPrecio Electrodomésticos: " + precioElectrodomesticos);
		System.out.println("Precio Lavadoras: " + precioLavadoras);
		
	}
}
