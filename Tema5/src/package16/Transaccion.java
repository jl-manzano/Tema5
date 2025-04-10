package package16;

public class Transaccion {
	private int dia;
	private int mes;
	private int año;
	private String concepto;
	private double importe;
	
	public Transaccion(int dia, int mes, int año, String concepto, double importe) {
		if (dia > 0) {
			this.dia = dia;
		}
		
		if (mes > 0) {
			this.mes = mes;
		}
		
		if (año > 0) {
			this.año = año;
		}
		
		if (año > 0) {
			this.año = año;
		}
		
		if (concepto != null && !concepto.isBlank()) {
			this.concepto = concepto;
		}
	
		this.importe = importe;
		
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAño() {
		return año;
	}

	public String getConcepto() {
		return concepto;
	}

	public double getImporte() {
		return importe;
	}
	
	@Override
	public String toString() {
		return "\nTransacción: " + concepto + "\n" +
		       "Fecha: " + dia + "/" + mes + "/" + año + "\n" +
		       "Importe: " + importe;
	}
	
}
