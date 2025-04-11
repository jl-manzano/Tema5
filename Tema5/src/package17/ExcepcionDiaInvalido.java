package package17;

public class ExcepcionDiaInvalido extends Exception {
	
	@Override
	public String toString() {
		return "Error. Día introducido fuera del rango permitido";
	}
	
	@Override
	public String getMessage() {
		return "Error. Día introducido fuera del rango permitido";
	}	
}
