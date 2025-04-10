package package15;

public class DVD extends Ficha {

	private String director;
	private int anyo;
	private Tipo tipo;
	enum Tipo {
		PELÍCULA, DOCUMENTAL, SERIE
	}
	
	public DVD(int id, String titulo, String director, int anyo, String tipo) {
		super(id, titulo);
		
		if (director != null && !director.isBlank()) {
			this.director = director;
		}
		
		if(anyo > 0) {
			this.anyo = anyo;
		}
		
		comprobarTipo(tipo.toUpperCase());
		
	}
	
	private void comprobarTipo(String tipo) {
		switch (tipo) {
		case "PELÍCULA", "DOCUMENTAL", "SERIE" -> this.tipo = Tipo.valueOf(tipo);
		}
	}
	
	@Override
	public int tiempoPrestamo() {
		return 5;
	}
	
	@Override
	public String toString() {

		String dvd = super.toString() + "\nDirector: " + director + "\nAño: " + anyo + "\nTipo: " + tipo;

		return dvd;
	}
	
}
