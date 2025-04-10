package package16;

import java.util.ArrayList;
import java.util.List;

public class CuentaCorriente extends CuentaBancaria {

	private double porcentajeT;
	private List<Transaccion> transacciones = new ArrayList<Transaccion>();
	
	public CuentaCorriente(String numCuenta, double saldo, Titular t, double porcentajeT) {
		super(numCuenta, saldo, t);

		if (porcentajeT > 0) {
			this.porcentajeT = porcentajeT;
		}
				
	}
	
	public double getPorcentajeT() {
		return porcentajeT;
	}

	public List<Transaccion> getTransacciones() {
		return transacciones;
	}
	
	public void setPorcentajeT(double porcentajeT) {
		if (porcentajeT > 0) {
			this.porcentajeT = porcentajeT;
		}
	}

	public boolean realizarTransaccion(Transaccion t) {
		boolean res = false;
		double comision;
		
		if (t != null) {
			transacciones.add(t);
			comision = t.getImporte() * porcentajeT;
			
			if (t.getImporte() >= 0) {
				res = ingresar(t.getImporte() - comision);
			} else {
				if (getSaldo() + t.getImporte() - comision >= 0) {
					res = retirar(t.getImporte() - comision);
				}
			}
		}
		
		return res;
	}
	
	@Override
	public String toString() {
		
		String mensaje = "\n" + super.toString() + "\nDatos Adicionales:\n" + "Porcentaje por Transacción: " + porcentajeT + "\nNúmero de Transacciones: " + transacciones.size() + "\n";
		
			if(transacciones.size() > 0) {
				mensaje += "\nTransacciones:";
				for (Transaccion transaccion : transacciones) {
					mensaje += transaccion.toString() + "\n";
				};
			} else {
				mensaje += "\nAún no hay transacciones en la cuenta";
			}
		return mensaje;
	}

}
