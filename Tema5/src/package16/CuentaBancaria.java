package package16;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class CuentaBancaria implements Comparable<CuentaBancaria> {
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
	    return titulares.size() > 1 && titulares.remove(t);
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

		String cuenta = "Nº Cuenta: " + this.numCuenta + "\nSaldo: " + this.saldo + "\nNº de Titulares: " + titulares.size() + "\n";

		for (Titular t : titulares) {
			cuenta += "\n" + t.toString();
		 
		}
		
		return cuenta;
	}

	@Override
	public int compareTo(CuentaBancaria o) {
		// TODO Auto-generated method stub
		return this.numCuenta.compareTo(o.numCuenta);
	}

}
