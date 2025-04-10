package package13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainSocio {
	public static void main(String[] args) {
		// crear lista ArrayList para almacenar los Socios
		ArrayList<Socio> socios = new ArrayList<Socio>();

		// añadir 4 nuevos socios a la lista
		socios.add(new Socio(1, "Juan", 18));
		socios.add(new Socio(4, "Alonso", 42));
		socios.add(new Socio(2, "Pablo", 20));
		socios.add(new Socio(3, "Jose", 19));

		// comparator con clase anónima - nombres
		Comparator<Socio> nombres = new Comparator<Socio>() {

			@Override
			public int compare(Socio o1, Socio o2) {
				// TODO Auto-generated method stub
				return o1.getNombre().compareTo(o2.getNombre());
			}
		};

		// listar con un for-each en pantalla la lista con todos los socios desordenada
		System.out.println("LISTA DESORDENADA");
		for (Socio socio : socios) {
			System.out.println(socio);
		}

		// ordenar la lista
		Collections.sort(socios, nombres);

		// listar con un for-each en pantalla la lista con todos los socios ordenada
		System.out.println("\nLISTA ORDENADA CON CLASE ANÓNIMA - ORDEN ALFABÉTICO");
		for (Socio socio : socios) {
			System.out.println(socio);
		}

		// comparator con lambda
		Comparator<Socio> nombres2 = (o1, o2) -> {
			return o1.getNombre().compareTo(o2.getNombre());
		};

		// ordenar la lista con lambda - nombres
		Collections.sort(socios, nombres2);

		// listar con un for-each en pantalla la lista con todos los socios ordenada
		System.out.println("\nLISTA ORDENADA CON LAMBDA - ORDEN ALFABÉTICO");
		for (Socio socio : socios) {
			System.out.println(socio);
		}
		
		// comparator con clase anónima - edades
		Comparator<Socio> edades = new Comparator<Socio>() {

			@Override
			public int compare(Socio o1, Socio o2) {
				// TODO Auto-generated method stub
				return o2.getEdad() - o1.getEdad();
			}
		};
		
		// ordenar la lista con clase anonima edades
		Collections.sort(socios, edades);

		// listar con un for-each en pantalla la lista con todos los socios ordenada
		System.out.println("\nLISTA ORDENADA CON CLASE ANÓNIMA - EDADES ORDEN DECRECIENTE");
		for (Socio socio : socios) {
			System.out.println(socio);
		}
		
		// comparatar con lambda - edades
		Comparator<Socio> edades2 = (o1, o2) -> {
			return o2.getEdad() - o1.getEdad();
		};
		
		// ordenar la lista con lambda - edades
		Collections.sort(socios, edades2);

		// listar con un for-each en pantalla la lista con todos los socios ordenada
		System.out.println("\nLISTA ORDENADA CON LAMBDA - EDADES ORDEN DECRECIENTE");
		for (Socio socio : socios) {
			System.out.println(socio);
		}
		
		// version 2 nombres - clase a parte
		Collections.sort(socios, new OrdenAlfabetico());

		// listar con un for-each en pantalla la lista con todos los socios ordenada
		System.out.println("\nLISTA ORDENADA CON CLASE A PARTE - ORDEN ALFABÉTICO");
		for (Socio socio : socios) {
			System.out.println(socio);
		}
		
		// version 2 edades - clase a parte
		Collections.sort(socios, new OrdenDecrecienteEdades());

		// listar con un for-each en pantalla la lista con todos los socios ordenada
		System.out.println("\nLISTA ORDENADA CON CLASE A PARTE - EDADES ORDEN DECRECIENTE");
		for (Socio socio : socios) {
			System.out.println(socio);
		}
			
	}
}
