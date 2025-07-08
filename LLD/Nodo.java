package ListaDoblementeLigada;

/**
 * Clase que representa un nodo en una lista ligada doble.
 * Cada nodo contiene un valor entero y un puntero al siguiente nodo.
 * @author Magali
 * @version 1.0
 */

public class Nodo {
    private int valor;
    private Nodo siguiente;
    private Nodo anterior; // Nodo anterior para listas dobles

    /**
     * Constructor de la clase Nodo.
     * Este constructor inicializa el nodo con un valor específico y establece
     * sus referencias(apuntadores) al siguiente y anterior nodo como null.
     * @param valor El valor que se asignará al nodo.
     * 
     */ 
    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null; // Inicializa el nodo siguiente como null
        this.anterior = null;  // Inicializa el nodo anterior como null
    }

    // Métodos getter y setter
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}
