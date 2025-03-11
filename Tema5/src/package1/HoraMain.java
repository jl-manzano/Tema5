package package1;

public class HoraMain {
	public static void main(String[] args) {
		HoraExacta hora = new HoraExacta(20, 20, 51);
		
		System.out.println(hora.toString());
		hora.inc();
		System.out.println(hora.setHora(23));
		System.out.println(hora.setminuto(59));
		System.out.println(hora.setSegundo(59));
		hora.inc();
		System.out.println(hora.toString());
		
	}
}
