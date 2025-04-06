package package11;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class CuentaBancaria {
	private String numCuenta;
	private double saldo;
	private Set<Titular> titulares = new TreeSet<Titular>();

	public CuentaBancaria(String numCuenta, double saldo, Titular t) {
		if (numCuenta != null && !numCuenta.isBlank()) {
			this.numCuenta = numCuenta;
		}

		if (saldo >= 0) {
			this.saldo = saldo;
		}

		if (t != null) {
			agregarTitular(t);
		}

	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public Set<Titular> getTitulares() {
		return titulares;
	}
	
	public boolean ingresar(double cantidad) {

		boolean res = false;

		if (cantidad > 0) {
			saldo += cantidad;
			res = true;
		}

		return res;
	}

	public boolean retirar(double cantidad) {
		boolean res = false;
		if (cantidad > 0 && saldo > cantidad) {
			saldo -= cantidad;
			res = true;
		}

		return res;
	}

	public boolean agregarTitular(Titular t) {
		boolean res = false;

		if (this.titulares.size() < 3) {
			this.titulares.add(t);
			res = true;
		}

		return res;
	}

	public boolean eliminarTitular(Titular t) {
		return this.titulares.remove(t);
	}

	@Override
	public boolean equals(Object obj) {

		boolean sonIguales = false;

		CuentaBancaria otraCB = (CuentaBancaria) obj;

		if (this.numCuenta.equalsIgnoreCase(otraCB.numCuenta)) {
			sonIguales = true;
		}

		return sonIguales;
	}
	
    @Override
    public int hashCode() {
        return Objects.hash(numCuenta);
    }
	
	@Override
	public String toString() {

		String cuenta = "";

		cuenta += "Nº Cuenta: " + this.numCuenta + ", Saldo: " + this.saldo;

		return cuenta;
	}

}
