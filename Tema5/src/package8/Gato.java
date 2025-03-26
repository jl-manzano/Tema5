package package8;

/**
 * Clase que representa a un gato, un tipo de animal doméstico.
 * Extiende la clase abstractaAnimalDomestico y proporciona implementaciones
 * para el comportamiento específico de un gato, como hacer ruido, hacer caso y toser una bola de pelo.
 */
public class Gato extends AnimalDomestico {

    /**
     * Constructor que inicializa un gato con sus propiedades.
     * 
     * @param nombre El nombre del gato.
     * @param raza La raza del gato.
     * @param color El color del gato.
     * @param peso El peso del gato.
     */
    public Gato(String nombre, String raza, String color, double peso) {
        super(nombre, raza, color, peso);
    }

    /**
     * Implementación del método hacerRuido de la interfaz Animal.
     * El gato emite un maullido.
     */
    @Override
    public void hacerRuido() {
        System.out.println(getNombre() + " maúlla: Miau, miau");
    }

    /**
     * Implementación del método hacerCaso de la clase AnimalDomestico.
     * El gato hace caso solo el 5% de las veces.
     * 
     * @return true si el gato hace caso, false en caso contrario.
     */
    @Override
    public boolean hacerCaso() {
        return Math.random() < 0.05;
    }
    
    /**
     * Método exclusivo para el comportamiento de los gatos.
     * Representa la acción de toser una bola de pelo.
     */
    public void toserBolaPelo() {
        System.out.println(getNombre() + " emite: Blergh");
    }
}
