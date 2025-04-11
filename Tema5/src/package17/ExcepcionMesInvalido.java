package package17;

public class ExcepcionMesInvalido extends Exception {
	@Override
	public String toString() {
		return "Error. Mes introducido fuera del rango permitido";
	}
	
	@Override
	public String getMessage() {
		return "Error. Mes introducido fuera del rango permitido";
	}
}
