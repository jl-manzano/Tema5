package package17;

public class ExcepcionAñoInvalido extends Exception {
	@Override
	public String toString() {
		return "Error. Año introducido debe ser mayor que 0";
	}
	
	@Override
	public String getMessage() {
		return "Error. Año introducido debe ser mayor que 0";
	}
}
