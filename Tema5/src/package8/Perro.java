package package8;

/**
 * Clase que representa a un perro, un tipo de animal doméstico.
 * Extiende la clase abstracta {@link AnimalDomestico} y proporciona implementaciones
 * para el comportamiento específico de un perro, como hacer ruido, hacer caso y salir de paseo.
 */
public class Perro extends AnimalDomestico {

    /**
     * Constructor que inicializa un perro con sus propiedades.
     * 
     * @param nombre del perro.
     * @param raza del perro.
     * @param color del perro.
     * @param peso del perro.
     */
    public Perro(String nombre, String raza, String color, double peso) {
        super(nombre, raza, color, peso);
    }

    /**
     * Implementación del método hacerRuido de la interfaz Animal.
     * El perro emite un ladrido.
     */
    @Override
    public void hacerRuido() {
        System.out.println(getNombre() + " ladra: Guau, guau");
    }

    /**
     * Implementación del método hacerCaso de la clase AnimalDomestico.
     * El perro hace caso el 90% de las veces.
     * 
     * @return true si el perro hace caso, false en caso contrario.
     */
    @Override
    public boolean hacerCaso() {
        return Math.random() < 0.9;
    }

    /**
     * Método exclusivo para el comportamiento de los perros.
     * Representa la acción de sacar al perro a pasear.
     */
    public void sacarPaseo() {
        System.out.println(getNombre() + " sale de paseo.");
    }
}
