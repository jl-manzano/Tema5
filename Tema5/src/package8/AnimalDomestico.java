package package8;

public abstract class AnimalDomestico implements Animal {

	private String nombre;
	private String raza;
	private String color;
	private double peso;
	
	public AnimalDomestico (String nombre, String raza, String color, double peso) {
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
		
		if (raza != null && !raza.isEmpty()) {
			this.raza = raza;
		}
		
		if (color != null && !color.isEmpty()) {
			this.color = color;
		}
		
		if (peso >= 0) {
			this.peso = peso;
		}
		
	}

	public void vacunar() {

	}
	
	public abstract boolean hacerCaso();
	
	


	
}
