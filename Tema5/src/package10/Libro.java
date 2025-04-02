package package10;

public class Libro extends Ficha {

	private String autor;
	private String editorial;
	
	public Libro(int id, String titulo, String autor, String editorial) {
		super(id, titulo);
		
		if (autor == null && !autor.isBlank()) {
			this.autor = autor;
		}
		
		if (editorial == null && !editorial.isBlank()) {
			this.editorial = editorial;
		}
	}
	

	public String getAutor() {
		return autor;
	}

	public String getEditorial() {
		return editorial;
	}

	@Override
	public int tiempoPrestamo() {
		return 15;
	}

}
