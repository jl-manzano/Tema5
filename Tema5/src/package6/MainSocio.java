package package6;

import java.util.ArrayList;
import java.util.Collections;

public class MainSocio {
	public static void main(String[] args) {
		// crear lista ArrayList para almacenar los Socios
		ArrayList<Socio> socios = new ArrayList<Socio>();
		
		// añadir 4 nuevos socios a la lista
		socios.add(new Socio(1, "Juan", 18));
		socios.add(new Socio(4, "Alonso", 42));
		socios.add(new Socio(2, "Pablo", 20));
		socios.add(new Socio(3, "Jose", 19));
		
		// listar con un for-each en pantalla la lista con todos los socios desordenada
		System.out.println("LISTA DESORDENADA");
		for(Socio socio : socios) {
			System.out.println(socio);
		}
		
		// ordenar la lista
		Collections.sort(socios);
		
		// listar con un for-each en pantalla la lista con todos los socios ordenada
		System.out.println("\nLISTA ORDENADA");
		for(Socio socio : socios) {
			System.out.println(socio);
		}
		
	}
}
