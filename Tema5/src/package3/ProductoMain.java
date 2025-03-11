package package3;

public class ProductoMain {
	public static void main(String[] args) {
		Perecedero P = new Perecedero("pescado", 20.99, 1);
		NoPerecedero noP = new NoPerecedero("lentejas", 1.69, "legumbres");
		System.out.println(P.calcular(3));
		System.out.println(noP.calcular(2));
		P.setPrecio(16.99);
		noP.setPrecio(2.20);
		System.out.println(P.calcular(2));
		System.out.println(noP.calcular(3));
		System.out.println(P.toString());
		System.out.println(noP.toString());
	
	}
}
