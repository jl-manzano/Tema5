package package16;

public class CuentaAhorro extends CuentaBancaria {

	private double cuotaMtto;
	private double interesAnual;
	
	public CuentaAhorro(String numCuenta, double saldo, Titular t, double cuotaMtto, double interesAnual) {
		super(numCuenta, saldo, t);
		
		if (cuotaMtto >= 0) {
			this.cuotaMtto = cuotaMtto;
		}
		
		if (interesAnual >= 0) {
			this.interesAnual = interesAnual;
		}
		
	}
	
    public double calcularSaldoConInteres() {
		return super.getSaldo() + (super.getSaldo() * (interesAnual / 100));
    }
    
	public boolean aplicarMtto() {
		return retirar(cuotaMtto);
	}

	public double getCuotaMtto() {
		return cuotaMtto;
	}

	public double getInteresAnual() {
		return interesAnual;
	}
	
	@Override
	public String toString() {
		return "\n" + super.toString() + "\nDatos Adicionales:\n" + "Cuota de Mantenimiento: " + cuotaMtto + "\nInteres Anual: " + interesAnual;
	}
	
}
