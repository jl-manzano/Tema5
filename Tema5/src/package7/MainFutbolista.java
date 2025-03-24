package package7;

import java.util.ArrayList;
import java.util.Collections;

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
		
		// listar con un for-each en pantalla la lista con todos los futbolistas desordenada
		System.out.println("LISTA DESORDENADA");
		for(Futbolista f : futbolistas) {
			System.out.println(f);
		}
		
		// ordenar la lista
		Collections.sort(futbolistas);
		
		// listar con un for-each en pantalla la lista con todos los futbolistas ordenada
		System.out.println("\nLISTA ORDENADA");
		for(Futbolista f : futbolistas) {
			System.out.println(f);
		}
	}
	

}
