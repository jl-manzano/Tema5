package package10;

public class FichaMain {
	
	public static void main(String[] args) {
		Libro libro = new Libro(1, "Thinking in Java", "Bruce Eckel", "Prentice Hall");
		Revista revista = new Revista(2, "Java Magazine", 78, 2023);
		DVD dvd = new DVD(3, "Nuestro Planeta", "Alastair Fothergill", 2019, "DOCUMENTAL");
		
	    System.out.println(libro);
	    System.out.println("Tiempo de préstamo: " + libro.tiempoPrestamo() + " días\n");

	    System.out.println(revista);
	    System.out.println("Tiempo de préstamo: " + revista.tiempoPrestamo() + " días\n");

	    System.out.println(dvd);
	    System.out.println("Tiempo de préstamo: " + dvd.tiempoPrestamo() + " días\n");
	}
	
}
