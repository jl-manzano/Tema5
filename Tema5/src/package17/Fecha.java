package package17;

public class Fecha {
	
	/**
	 * Dia del calendario
	 */
	private int dia = 0;
	
	/**
	 * Mes del calendario
	 */
	private int mes = 0;
	
	/**
	 * Año del calendario
	 */
	private int año = 0;
	
	/**
	 * Constructor que inicializa el dia, mes y año del calendario comprobando si sus valores son validos
	 * 
	 * @param dia Dia del calendario
	 * @param mes Mes del calendario
	 * @param año Año del calendario
	 * @throws ExcepcionDiaInvalido 
	 * @throws ExcepcionMesInvalido 
	 * @throws ExcepcionAñoInvalido 
	 */
	public Fecha(int dia, int mes, int año) throws ExcepcionDiaInvalido, ExcepcionMesInvalido, ExcepcionAñoInvalido {
		
		if(dia >= 0 && dia <= 31) {
			this.dia = dia;
		} else {
			throw new ExcepcionDiaInvalido();
		}
		
		if(mes >= 0 && mes <= 12) {
			this.mes = mes;
		} else {
			throw new ExcepcionMesInvalido();
		}
		
		if(año >= 0) {
			this.año = año;
		} else {
			throw new ExcepcionAñoInvalido();
		}
	}
	
	/**
	 * Funcion que devuelve el dia del calendario
	 * 
	 * @return Devuelve el dia 
	 */
	public int getDia() {
		return dia;
	}
	
	/**
	 * Funcion que modifica el dia del calendario si su valor es valido
	 * 
	 * @param dia Dia del calendario
	 * @throws ExcepcionDiaInvalido 
	 */
	public void setDia(int dia) throws ExcepcionDiaInvalido {
		if(dia >= 0 && dia <= 31) {
			this.dia = dia;
		} else {
			throw new ExcepcionDiaInvalido();
		}
	}
	
	/**
	 * Funcion que devuelve el mes del calendario
	 * 
	 * @return Devuelve el mes 
	 */
	public int getMes() {
		return mes;
	}
	
	/**
	 * Funcion que modifica el mes del calendario si su valor es valido
	 * 
	 * @param mes Mes del calendario
	 * @throws ExcepcionMesInvalido 
	 */
	public void setMes(int mes) throws ExcepcionMesInvalido {
		if(mes >= 0 && mes <= 12) {
			this.mes = mes;
		} else {
			throw new ExcepcionMesInvalido();
		}
	}
	
	/**
	 * Funcion que devuelve el año del calendario
	 * 
	 * @return Devuelve el año 
	 */
	public int getAño() {
		return año;
	}
	
	/**
	 * Funcion que modifica el año del calendario si su valor es valido
	 * 
	 * @param año Año del calendario
	 * @throws ExcepcionAñoInvalido 
	 */
	public void setAño(int año) throws ExcepcionAñoInvalido {
		if(año >= 0) {
			this.año = año;
		} else {
			throw new ExcepcionAñoInvalido();
		}
	}
	
	/**
	 * Funcion que calcula si el año es bisiesto o no y devuelve true
	 * si es bisiesto o false si no es bisiesto
	 * 
	 * @return Devuelve true si es bisiesto o false si no lo es
	 */
	public boolean esBisiesto() {
		return (this.año % 4 == 0 && this.año % 100 != 0) || this.año % 400 == 0;
	}
	
	/**
	 * Funcion que comprueba si la fecha es correcta y devuelve true si lo es o false si no lo es
	 * 
	 * @return Devuelve true si la fecha es correcta o false si no lo es
	 */
	public boolean fechaCorrecta() {
		
		boolean correcto = false;
		
		switch(this.mes) {
		case 1,3,5,7,8,10,12 ->{
			if(dia >= 0 && dia <= 31) {
				correcto = true;
			}
		}
		case 4,6,9,11 ->{
			if(dia >= 0 && dia <= 30) {
				correcto = true;
			}
		}
		case 2 ->{
			if (this.esBisiesto()) {
				if (this.dia > 0 && this.dia <= 29) {
					correcto = true;
				} else {
					if (this.dia > 0 && this.dia <= 28) {
						correcto = true;
					}
				}
			}
		}
		}
		
		return correcto;
	}
	
	/**
	 * Funcion que pasa al dia siguiente comprobando que la fecha se haya cambaido a una correcta
	 */
	public void diaSiguiente() {
		dia++;
		if(!fechaCorrecta()) {
			this.dia = 1;
			this.mes++;
			if(!fechaCorrecta()) {
				this.mes = 1;
				this.año++;
			}
		}
	}
	
	/**
	 * Funcion que muestra el año 
	 * 
	 * @return Devuelve el año
	 */
	@Override
	public String toString() {
		String cadena = "";
		
		if(dia < 10) {
			cadena += "0" + this.dia + "-";
		} else {
			cadena += this.dia + "-";
		}
		
		if(mes < 10) {
			cadena += "0" + this.mes + "-";
		} else {
			cadena += this.mes + "-";
		}
		
		return cadena += this.año;
	}
}