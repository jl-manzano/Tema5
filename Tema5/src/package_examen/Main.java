package package_examen;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		/*Creamos una tabla para almacenar los mandos*/
		MandoADistancia lista[] = new MandoADistancia[4];
		
		/*Creamos los mandos*/
		MandoADistancia m1 = new MandoTelevision("AZ", 21, 7, 50, true, 50, 20);
		MandoADistancia m2 = new MandoMinicadena("AC", 21, 7, 20, false, 20);
		MandoADistancia m3 = new MandoAcondicionado("AF", 15, 6, 50, true, 16, 1,  "FRIO");
		MandoADistancia m4 = new MandoAspiradoras("AA", 15, 6, 50, true, 1);
		
		/*Añadimos los mandos*/
		lista[0] = m1;
		lista[1] = m2;
		lista[2] = m3;
		lista[3] = m4;
		
		/*Ordenamos los mandos*/
		Arrays.sort(lista);
		
		//Recorremos la tabla
		for(MandoADistancia ej : lista) {
			/*Mando de television*/
			if (ej instanceof MandoTelevision) {
				System.out.println(ej);
				((MandoTelevision) ej).aumentarVolumen();
				((MandoTelevision) ej).reducirVolumen();
				System.out.println(ej + "\n");
			}
			/*Mando de minicadena*/
			if (ej instanceof MandoMinicadena) {
				System.out.println(ej);
				((MandoMinicadena) ej).aumentarVolumen();
				((MandoMinicadena) ej).reducirVolumen();
				System.out.println(ej);
			}
			/*Mando de aspiradora*/
			if (ej instanceof MandoAspiradoras) {
				System.out.println(ej);
				((MandoAspiradoras) ej).aumentarVelocidad();
				((MandoAspiradoras) ej).reducirVelocidad();
				System.out.println(ej);
			}
			/*Mando de aire acondicionado*/
			if (ej instanceof MandoAcondicionado) {
				System.out.println(ej);
				((MandoAcondicionado) ej).setModo("CALOR");
				((MandoAcondicionado) ej).setTemp(0);
				((MandoAcondicionado) ej).aumentarVelocidad();
				((MandoAcondicionado) ej).reducirVelocidad();
				System.out.println(ej);
				
			}
		}
	}
}
