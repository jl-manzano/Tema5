package package17;

import java.util.Scanner;

public class FechaPrincipal {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int dia;
		int mes;
		int año;
		boolean valida = false;

		/* Creamos un objeto fecha */
		Fecha fecha = null;

		do {
			try {
				System.out.println("FECHA\n-----\n");

				System.out.println("Introduce el día del mes: ");
				dia = sc.nextInt();

				System.out.println("\nIntroduce el mes del año: ");
				mes = sc.nextInt();

				System.out.println("\nIntroduce el año: ");
				año = sc.nextInt();

				fecha = new Fecha(dia, mes, año);

				valida = true;

			} catch (ExcepcionDiaInvalido | ExcepcionMesInvalido | ExcepcionAñoInvalido e) {
				System.out.println("\n" + e.getMessage());
			}

		} while (!valida);

		/* Mostramos la fecha */
		System.out.println(fecha.toString());

		/* Modificamos la fecha */
		valida = false;
		do {
			try {

				fecha.setDia(31);
				valida = true;
			} catch (ExcepcionDiaInvalido e) {
				System.out.println("\n" + e.getMessage());
			}
		} while (!valida);

		valida = false;
		do {
			try {
				fecha.setMes(4);
				valida = true;
			} catch (ExcepcionMesInvalido e) {
				System.out.println("\n" + e.getMessage());
			}
		} while (!valida);

		valida = false;
		do {
			try {
				fecha.setAño(2030);
				valida = true;
			} catch (ExcepcionAñoInvalido e) {
				System.out.println("\n" + e.getMessage());
			}
		} while (!valida);

		/* Pasamos al dia siguiente llamando a la funcion */
		fecha.diaSiguiente();

		/* Mostramos la fecha */
		System.out.println(fecha.toString());

		/* Comprobamos si el año es bisiesto o no */
		System.out.println(fecha.esBisiesto() ? "Es bisiesto" : "No es bisiesto");
	}
}
