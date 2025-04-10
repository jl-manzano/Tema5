package package15;

import java.util.Comparator;

public class FichasOrdenAlfabetico implements Comparator<Ficha> {

	@Override
	public int compare(Ficha o1, Ficha o2) {
		// TODO Auto-generated method stub
		return o1.getTitulo().compareTo(o2.getTitulo());
	}

}
