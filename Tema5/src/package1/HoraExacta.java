package package1;

public class HoraExacta extends Hora {

	private int segundo = 0;
	
	public HoraExacta(int hora, int minuto, int segundo) {
		
		super(hora, minuto);
		
		if (segundo >= 0 && segundo <= 59) {
			this.segundo = segundo;
		}
		
		
	}
	
	public void inc() {
		segundo++;

		if (segundo == 60) {
			segundo = 0;
			super.inc();		
		}
	}

	public boolean setSegundo(int segundo) {
		boolean res = segundo >= 0 && segundo <= 59;

		if (res) {
			this.segundo = segundo;
		}

		return res;	
	}
	
	@Override
	public String toString() {
		String res = "";

		res = super.toString();
		
		if (this.segundo < 10) {
			res += "0" + segundo;
		} else {
			res += segundo;
		}

		return res;

	}
	
}
