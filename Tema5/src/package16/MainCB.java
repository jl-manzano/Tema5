package package16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainCB {
	public static void main(String[] args) {

		// crear lista -> almacenar cuentas bancarias
		List<CuentaBancaria> cbs = new ArrayList<CuentaBancaria>();

		// crear lista -> almacenar titulares
		List<Titular> titulares = new ArrayList<Titular>();

		// CUENTA AHORRO
		Titular jose = new Titular("20604048G", "José", "Manzano Borrego", "653615031");

		titulares.add(jose);

		CuentaAhorro cuentaJose = new CuentaAhorro("2200", 7690, jose, 15, 5);

		cbs.add(cuentaJose);

		System.out.println(cuentaJose);

		Titular david = new Titular("20604047A", "David", "Pavón García", "635436085");

		titulares.add(david);

		cuentaJose.agregarTitular(david);

		System.out.println(cuentaJose + "\n");

		cuentaJose.eliminarTitular(new Titular("20604047A"));

		System.out.println(cuentaJose);

		System.out.println(cuentaJose.calcularSaldoConInteres());

		cuentaJose.aplicarMtto();

		System.out.println("\n" + cuentaJose + "\n");

		// CUENTA CORRIENTE
		Titular pablo = new Titular("20604046W", "Pablo", "Bazán García", "635435894");

		titulares.add(pablo);

		CuentaCorriente cuentaPablo = new CuentaCorriente("2201", 4540, pablo, 3);

		cbs.add(cuentaPablo);

		System.out.println(cuentaPablo);

		cuentaPablo.realizarTransaccion(new Transaccion(8, 4, 2025, "Compra en Hacoo", -50));

		System.out.println(cuentaPablo);

		cuentaPablo.realizarTransaccion(new Transaccion(8, 4, 2025, "Bizum de Pavón", 50));

		System.out.println(cuentaPablo);

		// ORDENAR CUENTAS BANCARIAS
		// listar con un for-each en pantalla la lista con todos las cuentas bancarias
		// desordenada
		System.out.println("LISTA DESORDENADA");
		for (CuentaBancaria cb : cbs) {
			System.out.println(cb);
		}

		// ordenar lista (comparable)
		Collections.sort(cbs);

		// mostrar lista ordenada
		System.out.println("\nLISTA ORDENADA:\n");

		for (CuentaBancaria c : cbs) {
			System.out.println(c + "\n");
		}

		// comparator con clase anónima - saldo orden descendente
		Comparator<CuentaBancaria> comp = new Comparator<CuentaBancaria>() {

			@Override
			public int compare(CuentaBancaria o1, CuentaBancaria o2) {
				// TODO Auto-generated method stub
				return (int) (o2.getSaldo() - o1.getSaldo());
			}
		};

		// ordenar la lista con clase anónima - saldo orden descendente
		Collections.sort(cbs, comp);

		// listar con un for-each en pantalla la lista con todos los cbs
		// ordenada
		System.out.println("\nLISTA ORDENADA CON CLASE ANÓNIMA - SALDO ORDEN DESCENDENTE");
		for (CuentaBancaria c : cbs) {
			System.out.println(c);
		}

		// comparator con lambda - saldo orden descendente
		Comparator<CuentaBancaria> comp2 = (o1, o2) -> {
			return (int) (o2.getSaldo() - o1.getSaldo());
		};

		// ordenar la lista con clase lambda - saldo orden descendente
		Collections.sort(cbs, comp2);

		// listar con un for-each en pantalla la lista con todos los cbs
		// ordenada
		System.out.println("\nLISTA ORDENADA CON LAMBDA - SALDO ORDEN DESCENDENTE");
		for (CuentaBancaria c : cbs) {
			System.out.println(c);
		}

		// ordenar la lista con clase a parte - saldo orden descendente
		Collections.sort(cbs, new SaldoOrdenDesc());

		// listar con un for-each en pantalla la lista con todos los cbs
		// ordenada
		System.out.println("\nLISTA ORDENADA CON CLASE A PARTE - SALDO ORDEN DESCENDENTE");
		for (CuentaBancaria c : cbs) {
			System.out.println(c);
		}

		// ORDENAR TITULARES
		// listar con un for-each en pantalla la lista con todos los titulares
		// desordenada
		System.out.println("LISTA DESORDENADA");
		for (Titular t : titulares) {
			System.out.println(t + "\n");
		}
		
		// ordenar lista (comparable)
		Collections.sort(titulares);

		// mostrar lista ordenada
		System.out.println("\nLISTA ORDENADA:\n");
		for (Titular t : titulares) {
			System.out.println(t + "\n");
		}

		// comparator con clase anónima - orden por apellido / nombre ascendente
		Comparator<Titular> comp3 = new Comparator<Titular>() {

			@Override
			public int compare(Titular o1, Titular o2) {
				// TODO Auto-generated method stub

				int res = 0;

				if (o1.getApellidos().equalsIgnoreCase(o2.getApellidos())) {
					res = o1.getNombre().compareTo(o2.getNombre());
				} else {
					res = o1.getApellidos().compareTo(o2.getApellidos());
				}

				return res;
			}
		};

		// ordenar la lista con clase anónima - orden por apellido / nombre ascendente
		Collections.sort(titulares, comp3);

		// listar con un for-each en pantalla la lista con todos los titulares
		// ordenada
		System.out.println("\nLISTA ORDENADA CON CLASE ANÓNIMA - ORDEN POR APELLIDO / NOMBRE ASCENDENTE");
		for (Titular t : titulares) {
			System.out.println(t + "\n");
		}

		// comparator con lambda - orden por apellido / nombre ascendente
		Comparator<Titular> comp4 = (o1, o2) -> {
			int res = 0;

			if (o1.getApellidos().equalsIgnoreCase(o2.getApellidos())) {
				res = o1.getNombre().compareTo(o2.getNombre());
			} else {
				res = o1.getApellidos().compareTo(o2.getApellidos());
			}

			return res;

		};

		// ordenar la lista con lambda - orden por apellido / nombre ascendente
		Collections.sort(titulares, comp4);

		// listar con un for-each en pantalla la lista con todos los titulares
		// ordenada
		System.out.println("\nLISTA ORDENADA CON CLASE ANÓNIMA - ORDEN POR APELLIDO / NOMBRE ASCENDENTE");
		for (Titular t : titulares) {
			System.out.println(t + "\n");
		}

		// ordenar la lista con clase a parte - saldo orden descendente
		Collections.sort(titulares, new OrdenPorApellidosONombreAsc());

		// listar con un for-each en pantalla la lista con todos los titulares
		// ordenada
		System.out.println("\nLISTA ORDENADA CON CLASE A PARTE - ORDEN POR APELLIDO / NOMBRE ASCENDENTE");
		for (Titular t : titulares) {
			System.out.println(t + "\n");
		}

	}

}
