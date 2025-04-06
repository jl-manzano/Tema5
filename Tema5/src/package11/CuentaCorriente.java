package package11;

import java.util.ArrayList;
import java.util.List;

public class CuentaCorriente extends CuentaBancaria {

	private double porcentajeT;
	private int numTransacciones = 0;
	private List<Transaccion> transacciones = new ArrayList<Transaccion>();
	
	public CuentaCorriente(String numCuenta, double saldo, Titular t, double porcentajeT, int numTransacciones) {
		super(numCuenta, saldo, t);

		if (porcentajeT > 0) {
			this.porcentajeT = porcentajeT;
		}
				
	}
	
	public double getPorcentajeT() {
		return porcentajeT;
	}

	public int getNumTransacciones() {
		return numTransacciones;
	}

	public List<Transaccion> getTransacciones() {
		return transacciones;
	}
	
	public boolean realizarTransaccion(Transaccion t) {
		boolean res = false;
		double comision;
		
		if (t != null) {
			transacciones.add(t);
			numTransacciones++;
			comision = t.getImporte() * porcentajeT;
			res = ingresar(t.getImporte() - comision);
		}
		
		return res;
	}

}
