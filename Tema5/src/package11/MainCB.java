package package11;

public class MainCB {
	public static void main(String[] args) {
		// CUENTA AHORRO
		Titular jose = new Titular("20604048G", "José", "Manzano Borrego", "653615031");
		
		CuentaAhorro cuentaJose = new CuentaAhorro("2200", 7690, jose, 15, 5);
		
		System.out.println(cuentaJose);
		
		Titular david = new Titular("20604047A", "David", "Pavón García", "635436085");
		
		cuentaJose.agregarTitular(david);
		
		System.out.println(cuentaJose + "\n");
		
		cuentaJose.eliminarTitular(new Titular("20604047A"));
		
		System.out.println(cuentaJose);
		
		System.out.println(cuentaJose.calcularSaldoConInteres());
		
		cuentaJose.aplicarMtto();
		
		System.out.println("\n" + cuentaJose + "\n");
		
		// CUENTA CORRIENTE
		Titular pablo = new Titular("20604046W", "Pablo", "Bazán García", "635435894");
		
		CuentaCorriente cuentaPablo = new CuentaCorriente("2201", 4540, pablo, 3);

		System.out.println(cuentaPablo);
		
		cuentaPablo.realizarTransaccion(new Transaccion(8, 4, 2025, "Compra en Hacoo", -50));

		System.out.println(cuentaPablo);

		cuentaPablo.realizarTransaccion(new Transaccion(8, 4, 2025, "Bizum de Pavón", 50));

		System.out.println(cuentaPablo);
		
	}
}
