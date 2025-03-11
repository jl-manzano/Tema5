package package1;

public class Hora {
	private int hora = 0;
	private int minuto = 0;

	public Hora(int hora, int minuto) {
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		}
		
		if (minuto >= 0 && minuto <= 60) {
			this.minuto = minuto;
		}
		
	}

	public void inc() {
		minuto++;

		if (minuto == 60) {
			minuto = 0;
			hora++;

			if (hora == 24) {
				hora = 0;
			}
		}
	}

	public boolean setHora(int hora) {
		boolean res = hora >= 0 && hora <= 23;

		if (res) {
			this.hora = hora;
		}

		return res;
	}

	public boolean setminuto(int minuto) {
		boolean res = minuto >= 0 && minuto <= 59;

		if (res) {
			this.minuto = minuto;
		}

		return res;
	}

	@Override
	public String toString() {
		String res = "";

		if (this.hora < 10) {
			res += "0" + hora + ":";
		} else {
			res += hora + ":";
		}

		if (this.minuto < 10) {
			res += "0" + minuto + ":";
		} else {
			res += minuto + ":";
		}

		return res;

	}

}
