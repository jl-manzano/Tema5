package package10;

public abstract class Ficha {
	private int id;
	private String titulo;
	
	public Ficha(int id, String titulo) {
		if (id > 0) {
			this.id = id;
		}
		
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
		
	}
	
	public int getId() {
		return id;
	}
	

	public String getTitulo() {
		return titulo;
	}

	public abstract int tiempoPrestamo();
	
	@Override
	public boolean equals(Object obj) {
		Ficha ficha2 = (Ficha) obj;
		return this.id == ficha2.id;
	}
	
	@Override
	public String toString() {

		String ficha = "";

		ficha += "Nº Identificador: " + id + "\nTítulo: " + titulo;

		return ficha;
	}
	
}
