package package8;

/**
 * Clase abstracta que representa a un animal doméstico.
 * Implementa la interfaz Animal y proporciona implementaciones comunes para
 * las acciones de dormir, comer y vacunar.
 */
public abstract class AnimalDomestico implements Animal {

    private String nombre;
    private String raza;
    private String color;
    private double peso;
    
    /**
     * Constructor para inicializar un animal doméstico.
     * 
     * @param nombre del animal.
     * @param razadel animal.
     * @param color del animal.
     * @param peso del animal.
     */
    public AnimalDomestico(String nombre, String raza, String color, double peso) {
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

    /**
     * Método que simula la vacunación de un animal doméstico.
     */
    public void vacunar() {
        System.out.println(nombre + " ha sido vacunad@.");
    }
    
    /**
     * Implementación del método comer de la interfaz Animal.
     * Imprime un mensaje indicando que el animal está comiendo.
     */
    @Override
    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }
    
    /**
     * Implementación del método dormir de la interfaz Animal.
     * Imprime un mensaje indicando que el animal está durmiendo.
     */
    @Override
    public void dormir() {
        System.out.println(nombre + " está durmiendo: Zzzz...");
    }
    
    /**
     * Método abstracto que debe ser implementado por las clases concretas.
     * Representa el ruido característico que hace el animal.
     */
    @Override
    public abstract void hacerRuido();
    
    /**
     * Método abstracto que debe ser implementado por las clases concretas.
     * Representa la acción de hacer caso del animal, devolviendo un valor booleano.
     * 
     * @return true si el animal hace caso, false en caso contrario.
     */
    public abstract boolean hacerCaso();

    /**
     * Método para obtener el nombre del animal.
     * 
     * @return El nombre del animal.
     */
    public String getNombre() {
        return nombre;
    }
}
