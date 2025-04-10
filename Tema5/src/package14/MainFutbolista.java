package package14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainFutbolista {

	public static void main(String[] args) {
		// crear lista ArrayList para almacenar los Futvolistas
		ArrayList<Futbolista> futbolistas = new ArrayList<Futbolista>();

		// añadir 5 nuevos futbolistas a la lista
		futbolistas.add(new Futbolista(22, "Isco", 32, 22));
		futbolistas.add(new Futbolista(10, "Canales", 34, 30));
		futbolistas.add(new Futbolista(4, "Johnnhy Cardoso", 23, 4));
		futbolistas.add(new Futbolista(7, "Antony dos Santos", 25, 6));
		futbolistas.add(new Futbolista(10, "Ez Abde", 24, 3));

		// listar con un for-each en pantalla la lista con todos los futbolistas
		// desordenada
		System.out.println("LISTA DESORDENADA");
		for (Futbolista f : futbolistas) {
			System.out.println(f);
		}

		// comparator con clase anónima - edad orden ascendente
		Comparator<Futbolista> comp = new Comparator<Futbolista>() {

			@Override
			public int compare(Futbolista o1, Futbolista o2) {
				// TODO Auto-generated method stub
				return o1.getEdad() - o2.getEdad();
			}
		};

		// ordenar la lista con clase anónima - edades orden ascendente
		Collections.sort(futbolistas, comp);

		// listar con un for-each en pantalla la lista con todos los futbolistas
		// ordenada
		System.out.println("\nLISTA ORDENADA CON CLASE ANÓNIMA - EDADES ORDEN ASCENDENTE");
		for (Futbolista f : futbolistas) {
			System.out.println(f);
		}
		
		// comparator con lambda - edades orden ascendente
		Comparator<Futbolista> comp2 = (o1, o2) -> {
			return o1.getEdad() - o2.getEdad();
		};

		// ordenar la lista con lambda - edades
		Collections.sort(futbolistas, comp2);

		// listar con un for-each en pantalla la lista con todos los futbolistas
		// ordenada
		System.out.println("\nLISTA ORDENADA CON LAMBDA - EDADES ORDEN ASCENDENTE");
		for (Futbolista f : futbolistas) {
			System.out.println(f);
		}		

		// comparator con clase anónima - goles orden descendente
		Comparator<Futbolista> comp3 = new Comparator<Futbolista>() {

			@Override
			public int compare(Futbolista o1, Futbolista o2) {
				// TODO Auto-generated method stub
				return o2.getNumGoles() - o1.getNumGoles();
			}
		};

		// ordenar la lista con clase anónima - goles
		Collections.sort(futbolistas, comp3);

		// listar con un for-each en pantalla la lista con todos los futbolistas
		// ordenada
		System.out.println("\nLISTA ORDENADA CON CLASE ANÓNIMA - GOLES ORDEN DESCENDENTE");
		for (Futbolista f : futbolistas) {
			System.out.println(f);
		}

		// comparator con lambda - goles orden descendente
		Comparator<Futbolista> comp4 = (o1, o2) -> {
			return o2.getNumGoles() - o1.getNumGoles();
		};

		// ordenar la lista con lambda - goles
		Collections.sort(futbolistas, comp4);

		// listar con un for-each en pantalla la lista con todos los futbolistas
		// ordenada
		System.out.println("\nLISTA ORDENADA CON LAMBDA - GOLES ORDEN DESCENDENTE");
		for (Futbolista f : futbolistas) {
			System.out.println(f);
		}
		
		// version 2 edades
		// ordenar la lista con clase a parte - edades
		Collections.sort(futbolistas, new OrdenAscendenteEdades());

		// listar con un for-each en pantalla la lista con todos los futbolistas
		// ordenada
		System.out.println("\nLISTA ORDENADA CLASE A PARTE - EDADES ORDEN ASCENDENTE");
		for (Futbolista f : futbolistas) {
			System.out.println(f);
		}
		
		// version 2 goles
		// ordenar la lista con clase a parte - goles
		Collections.sort(futbolistas, new OrdenDecrecienteGoles());

		// listar con un for-each en pantalla la lista con todos los futbolistas
		// ordenada
		System.out.println("\nLISTA ORDENADA CLASE A PARTE - GOLES ORDEN DESCENDENTE");
		for (Futbolista f : futbolistas) {
			System.out.println(f);
		}
	}

}
