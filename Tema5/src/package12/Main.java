package package12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
    	
    	// variable para almacenar resultado de ejecutar binarySearch
    	int res;
    	
    	// array de tipo integer
    	Integer[] numeros = new Integer[20];
    	
    	// clase random
    	Random rand = new Random();
    	
    	// comparator con clase anónima
    	Comparator<Integer> comp = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1;
			}
		};
		
		// bucle for -> generar 20 num aleatorios entre el 1 y 100 inclusive y almacenarlos en el array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rand.nextInt(1, 101);
		}
		
		// array desordenado
		System.out.println("ARRAY ORIGINAL:\n" + Arrays.toString(numeros));
		
		// orden por defecto - ascendente
		Arrays.sort(numeros);
		
		System.out.println("\nARRAY ORDENADO EN ORDEN ASCENDENTE:\n" + Arrays.toString(numeros));
		
		// orden descendente
		Arrays.sort(numeros, comp);
		
		System.out.println("\nARRAY ORDENADO EN ORDEN DESCENDENTE CON CLASE ANÓNIMA:\n" + Arrays.toString(numeros));
		
		// buscar el valor 5 en el array ordenado utilizando el comparador con clase anonima
		res = Arrays.binarySearch(numeros, 5, comp);
		
		// condicional if -> determinar si res - valor + (si se encuentra el num 5 en el array); valor - (si no)
		if (res >= 0) {
			System.out.println("\nEl número 5 se encuentra en el índice: " + res);
		} else {
			System.out.println("\nEl número 5 no se encuentra en el array");

		}
		
    	// comparator con lambda
    	Comparator<Integer> comp2 = (o1, o2) -> {
			return o2 - o1;
		};
		
		// version 2 - clase a parte
		Arrays.sort(numeros, new OrdenDecreciente());
		System.out.println("\nARRAY ORDENADO EN ORDEN DESCENDENTE CREADO EN CLASE A PARTE:\n" + Arrays.toString(numeros));

		// orden descendente
		Arrays.sort(numeros, comp2);
		
		System.out.println("\nARRAY ORDENADO EN ORDEN DESCENDENTE CON LAMBDA:\n" + Arrays.toString(numeros));
		
		// buscar el valor 5 en el array ordenado utilizando el comparador lambda
		res = Arrays.binarySearch(numeros, 5, comp2);
		
		// condicional if -> determinar si res - valor + (si se encuentra el num 5 en el array); valor - (si no)
		if (res >= 0) {
			System.out.println("\nEl número 5 se encuentra en el índice: " + res);
		} else {
			System.out.println("\nEl número 5 no se encuentra en el array");

		}
		
    }
}
