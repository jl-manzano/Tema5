package package11;

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
        return getSaldo() * (1 + interesAnual);
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
	
}
