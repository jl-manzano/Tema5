package package_examen;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        // Crear una tabla de tamaño 10 para almacenar los mandos a distancia
        MandoADistancia[] mandos = new MandoADistancia[10];

        // Crear mandos a distancia de distintos tipos
        mandos[0] = new MandoTelevision("AZ", 21, 7, 50, true, 50, 5);
        mandos[1] = new MandoMinicadena("AC", 21, 7, 30, true, 20);
        mandos[2] = new MandoAcondicionado("AF", 15, 6, 60, true, 3, 22, "CALOR");
        mandos[3] = new MandoAspiradoras("AA", 15, 6, 40, false, 1);
        mandos[4] = new MandoTelevision("BX", 21, 7, 40, false, 10, 3);
        mandos[5] = new MandoMinicadena("BB", 21, 7, 20, true, 30);
        mandos[6] = new MandoAcondicionado("BF", 15, 6, 55, true, 4, 18, "FRIO");
        mandos[7] = new MandoAspiradoras("AD", 15, 6, 35, true, 2);
        mandos[8] = new MandoTelevision("CX", 21, 7, 60, true, 25, 7);
        mandos[9] = new MandoMinicadena("CX", 21, 7, 40, true, 50);

        // Ordenar los mandos por modelo
        Arrays.sort(mandos);

        // Recorrer la tabla de mandos a distancia y realizar las acciones correspondientes
        for (MandoADistancia mando : mandos) {
            // Encender el mando
            mando.encenderMando();
            System.out.println(mando);

            // Determinar el tipo de mando
            String tipoMando = mando.getClass().getSimpleName(); // Obtener el nombre de la clase del mando

            // Usar un switch para manejar los diferentes tipos de mando
            switch (tipoMando) {
                case "MandoTelevision" -> {
                    // Si es de televisión
                    System.out.println("Acciones para Mando de Televisión:");
                    switch (1) { // Número para encender
                        case 1 -> mando.encenderMando();
                    }
                    switch (2) {
                        case 1 -> ((MandoTelevision) mando).setCanal(10); // Cambiar el canal
                        case 2 -> ((MandoTelevision) mando).aumentarVolumen(); // Subir volumen
                        case 3 -> ((MandoTelevision) mando).reducirVolumen(); // Bajar volumen
                    }
                }

                case "MandoMinicadena" -> {
                    // Si es de minicadena
                    System.out.println("Acciones para Mando de Minicadena:");
                    switch (1) {
                        case 1 -> ((MandoMinicadena) mando).aumentarVolumen(); // Subir volumen
                        case 2 -> ((MandoMinicadena) mando).reducirVolumen(); // Bajar volumen
                    }
                }

                case "MandoAspiradoras" -> {
                    // Si es de aspiradora
                    System.out.println("Acciones para Mando de Aspiradora:");
                    switch (1) {
                        case 1 -> ((MandoAspiradoras) mando).aumentarVelocidad(); // Subir velocidad
                        case 2 -> ((MandoAspiradoras) mando).reducirVelocidad(); // Bajar velocidad
                    }
                }

                case "MandoAcondicionado" -> {
                    // Si es de aire acondicionado
                    System.out.println("Acciones para Mando de Aire Acondicionado:");
                    switch (1) {
                        case 1 -> ((MandoAcondicionado) mando).setModo("CALOR"); // Cambiar el modo
                        case 2 -> ((MandoAcondicionado) mando).setTemp(23); // Cambiar la temperatura
                        case 3 -> ((MandoAcondicionado) mando).aumentarVelocidad(); // Subir velocidad
                        case 4 -> ((MandoAcondicionado) mando).reducirVelocidad(); // Bajar velocidad
                    }
                }

                default -> System.out.println("Mando no reconocido");
            }

            // Mostrar el mando después de las acciones
            System.out.println(mando);
        }
    }
}

