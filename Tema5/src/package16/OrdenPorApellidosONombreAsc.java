package package16;

import java.util.Comparator;

public class OrdenPorApellidosONombreAsc implements Comparator<Titular> {

	@Override
	public int compare(Titular o1, Titular o2) {

		int res = 0;
		
		if(o1.getApellidos().equals(o2.getApellidos())) {
			res = o1.getNombre().compareTo(o2.getNombre());
		} else {
			res = o1.getApellidos().compareTo(o2.getApellidos());
		}
		
		return res;
	}

}
