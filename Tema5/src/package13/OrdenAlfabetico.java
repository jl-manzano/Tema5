package package13;

import java.util.Comparator;

public class OrdenAlfabetico implements Comparator<Socio> {

	@Override
	public int compare(Socio o1, Socio o2) {
		// TODO Auto-generated method stub
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
