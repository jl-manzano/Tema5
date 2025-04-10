package package14;

import java.util.Comparator;

public class OrdenDecrecienteGoles implements Comparator<Futbolista> {

	@Override
	public int compare(Futbolista o1, Futbolista o2) {
		// TODO Auto-generated method stub
		return o2.getNumGoles() - o1.getNumGoles();
	}

}
