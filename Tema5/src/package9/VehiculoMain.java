package package9;

import java.util.Scanner;

public class VehiculoMain {

	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String respuesta;
		Vehiculo vehiculo;
		int velocidad;
		int marcha;
		
		System.out.println("BIENVENIDO a VehicleSimulation. Crea tu vehiculo!\n");
		vehiculo = creaVehiculo();
		
		System.out.println(vehiculo);
		
		do {
			System.out.println("¿Quieres arrancar el vehículo?");
			respuesta = reader.nextLine();
		} while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));
		
		if (respuesta.equalsIgnoreCase("si")) {
			vehiculo.arrancar();
			
			System.out.println("¿A qué velocidad quieres ir?");
			velocidad = reader.nextInt();
			
			km(velocidad);
			
			marcha = cambiaMarcha(velocidad);
			
			vehiculo.cambiarMarcha(marcha);
			
			vehiculo.cambiarVelocidad(velocidad);
			
			System.out.println(vehiculo.estado());
		}

	}
	
	private static Vehiculo creaVehiculo() {
		
		Vehiculo vehiculo = null;
		
		int opcion;
		String respuesta;
		
		System.out.println("¿Qué quieres crear?");
		System.out.println("1. Turismo");
		System.out.println("2. Camion");
		System.out.println("3. Motocicleta\n");
		
		System.out.println("Introduzca una opcion");
		opcion = reader.nextInt();
		reader.nextLine();
		
		String marca;
		String modelo;
		String color;
		String matricula;

		System.out.println("\nIntroduzca la marca");
		marca = reader.nextLine();
		
		System.out.println("Introduzca el modelo");
		modelo = reader.nextLine();
		
		System.out.println("Introduzca el color");
		color = reader.nextLine();
		
		System.out.println("Introduzca la matricula");
		matricula = reader.nextLine();
		
		switch (opcion) {
			case 1 -> { 
				
				int numeroPlazas;
				String uso;
				
				System.out.println("Introduzca el numero de plazas");
				numeroPlazas = reader.nextInt();
				reader.nextLine();
				
				System.out.println("Introduzca el uso del turismo: Profesional o Particular");
				uso = reader.nextLine().toUpperCase();
				
				vehiculo = new Turismo(marca, modelo, color, matricula, numeroPlazas, uso); 
			}
			case 2 -> {
				
				int pesoMaximoAutorizado;
				boolean mercanciaPeligrosa;
				
				System.out.println("Introduzca el peso maximo autorizado");
				pesoMaximoAutorizado = reader.nextInt();
				reader.nextLine();
				
				do {
					System.out.println("¿Transporta mercancias peligrosas? (Si/no)");
					respuesta = reader.nextLine().toUpperCase();
				} while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));
				
				if (respuesta.equalsIgnoreCase("si")) {
					mercanciaPeligrosa = true;
				} else {
					mercanciaPeligrosa = false;
				}
				
				vehiculo = new Camion(marca, modelo, color, matricula, pesoMaximoAutorizado, mercanciaPeligrosa);
			}
			case 3 -> {
				
				int cilindrada;
				
				System.out.println("Introduzca la cilindrada de la moto");
				cilindrada = reader.nextInt();
				reader.nextLine();
				
				vehiculo = new Motocicleta(marca, modelo, color, matricula, cilindrada);
			}
		}
		
		return vehiculo;
	}

	private static void km(int velocidad) {
		System.out.println("\n-------");
		for (int i = 0 ; i <= velocidad ; i++) {
			System.out.println("|"+i+"|");
		}
		System.out.println("-------");
	}

	private static int cambiaMarcha(int velocidad) {
		int marcha = 0;
		if (velocidad >= 1 && velocidad <= 30) {
			marcha = 1;
		} else if (velocidad > 30 && velocidad <= 50) {
			marcha = 2;
		} else if (velocidad > 50 && velocidad <= 70) {
			marcha = 3;
		} else if (velocidad > 70 && velocidad <= 100) {
			marcha = 4;
		} else if (velocidad > 100){
			marcha = 5;
		}
		return marcha;
	}
}