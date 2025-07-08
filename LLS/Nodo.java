package ListaLigada;

/**
 * Clase que representa un nodo en una lista ligada simple.
 * Cada nodo contiene un valor entero y un puntero al siguiente nodo.
 * @author Magali
 * @version 1.0
 */

public class Nodo {
    private int valor;
    private Nodo siguiente;

    /**
     * Constructor de la clase Nodo.
     * Este constructor inicializa el nodo con un valor específico y establece
     * su siguiente nodo como null.
     * @param valor El valor que se asignará al nodo.
     * 
     */ 
    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
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
}
