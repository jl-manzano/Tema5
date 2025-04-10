package package15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FichaMain {
	
	public static void main(String[] args) {
		// conjunto tipo hashset -> evitar duplicados
		List<Ficha> fichas = new ArrayList<Ficha>();
		
		Libro libro = new Libro(1, "Thinking in Java", "Bruce Eckel", "Prentice Hall");
		Revista revista = new Revista(2, "Java Magazine", 78, 2023);
		DVD dvd = new DVD(3, "Nuestro Planeta", "Alastair Fothergill", 2019, "DOCUMENTAL");
		
		// añadir a conjunto fichas (libro, revista y dvd) creados
		fichas.add(libro);
		fichas.add(revista);
		fichas.add(dvd);
		
		// comparator con clase anonima - orden alfabético
		Comparator<Ficha> comp = new Comparator<Ficha>() {
			
			@Override
			public int compare(Ficha o1, Ficha o2) {
				// TODO Auto-generated method stub
				return o1.getTitulo().compareTo(o2.getTitulo());
			}
		};
		
		// mostrar lista desordenada
		System.out.println("LISTA DESORDENADA:\n");
		for(Ficha ficha : fichas) {
			System.out.println(ficha + "\n");
		}

		// ordenar lista (comparable)
		Collections.sort(fichas);
		
		// mostrar lista ordenada
		System.out.println("\nLISTA ORDENADA:\n");
		
		for(Ficha ficha : fichas) {
			System.out.println(ficha + "\n");
		}
		
		// ordenar conjunto con clase anónima - orden alfabético
		Collections.sort(fichas, comp);
		
		// mostrar lista ordenada con clase anónima - orden alfabético
		System.out.println("\nLISTA ORDENADA CLASE ANÓNIMA - ORDEN ALFABÉTICO:\n");
		
		for(Ficha ficha : fichas) {
			System.out.println(ficha + "\n");
		}
		
		// ordenar conjunto clase a parte - orden alfabético
		Collections.sort(fichas, new FichasOrdenAlfabetico());
		
		// mostrar lista ordenada clase a parte - orden alfabético
		System.out.println("\nLISTA ORDENADA CLASE A PARTE - ORDEN ALFABÉTICO:\n");
		for(Ficha ficha : fichas) {
			System.out.println(ficha + "\n");
		}
	
		// comparator con lambda - orden alfabético
		Comparator<Ficha> comp2 = (o1, o2) -> {
			return o1.getTitulo().compareTo(o2.getTitulo());
		};
		
		// ordenar conjunto con lambda - orden alfabético
		Collections.sort(fichas, comp2);
		
		// mostrar lista ordenada clase a parte - orden alfabético
		System.out.println("\nLISTA ORDENADA CON LAMBDA - ORDEN ALFABÉTICO:\n");
		
		for(Ficha ficha : fichas) {
			System.out.println(ficha + "\n");
		}
		
		System.out.println("FICHAS Y SU PRÉSTAMO");
		System.out.println(libro);
	    System.out.println("Tiempo de préstamo: " + libro.tiempoPrestamo() + " días\n");

	    System.out.println("\n" + revista);
	    System.out.println("Tiempo de préstamo: " + revista.tiempoPrestamo() + " días\n");

	    System.out.println("\n" + dvd);
	    System.out.println("Tiempo de préstamo: " + dvd.tiempoPrestamo() + " días\n");
	    
	    
	    
	}
	
}
