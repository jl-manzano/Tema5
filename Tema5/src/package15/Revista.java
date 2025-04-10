package package15;

public class Revista extends Ficha {

	private int numRevista;
	private int anyoPublicacion;
	
	public Revista(int id, String titulo, int numRevista, int anyoPublicacion) {
		super(id, titulo);
		
		if (numRevista > 0) {
			this.numRevista = numRevista;
		}
		
		if(anyoPublicacion > 0) {
			this.anyoPublicacion = anyoPublicacion;
		}
		
	}

	public int getNumRevista() {
		return numRevista;
	}

	public int getAnyoPublicacion() {
		return anyoPublicacion;
	}

	@Override
	public int tiempoPrestamo() {
		return 10;
	}
	
	@Override
	public String toString() {

		String revista = super.toString() + "\nNúmero de revista: " + numRevista + "\nAño de Publicación: " + anyoPublicacion;

		return revista;
	}
	
	
}
