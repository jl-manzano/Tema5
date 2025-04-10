package package16;

import java.util.Comparator;

public class SaldoOrdenDesc implements Comparator<CuentaBancaria> {

	@Override
	public int compare(CuentaBancaria o1, CuentaBancaria o2) {
		// TODO Auto-generated method stub
		return (int) (o2.getSaldo() - o1.getSaldo());
	}

}
