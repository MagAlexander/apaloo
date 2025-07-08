package PilaLigadaSimple;

/**
 * Clase que representa una pila ligada simple con nodos que guardan enteros.
 * @author Magali
 * @version 1.0
 */

public class PilaLigadaSimple {
    private Nodo tope;
    private int tam;

    /**
     * Constructor de la clase Pila.
     * Este constructor inicializa la pila estableciendo el tope como null.
     */
    public PilaLigadaSimple() {
        this.tope = null;
        this.tam = 0;
    }


    /**
     * Verifica si la pila está vacía.
     * @return true si la pila está vacía, false en caso contrario.
     */
    public boolean esVacia() {
        return tope == null;
    }

    /* No tenemos una función esLlena() porque en una pila ligada no hay un límite fijo de capacidad. */

    /**
     * Obtiene el tamaño actual de la pila.
     * @return El número de elementos en la pila.
     */
    public int getTam() {
        return tam;
    }
    
    /**
     * Inserta un nuevo nodo al final de la cola.
     * @param valor El valor que se asignará al nuevo nodo.
     * * Si la cola está vacía, el nuevo nodo se convierte en el inicio y el fin.
     * * Si la cola no está vacía, se agrega el nuevo nodo al final y se actualiza el puntero del fin.
     */
    public void apilar(int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.setSiguiente(tope);
        tope = nuevo;
        tam++;
    }


    /**
     * Elimina el primer nodo de la pila.
     * Si la pila está vacía, no hace nada.
     * Si la pila tiene un solo nodo, lo elimina y establece el tope como null.
     * Si la pila tiene más de un nodo, simplemente mueve el tope al siguiente nodo.
     */
    public void desapilar() {
        if (esVacia()) {
            System.out.println("La pila está vacía.");
            return;
        }
        tope = tope.getSiguiente();
        tam--;
        System.out.println("Nodo eliminado en el tope de la pila.");
    }

    /**
     * Obtiene el valor del nodo al frente de la pila.
     * @return El valor del nodo al frente, o -1 si la pila está vacía.
    */
    public int getFrente() {
        if (esVacia()) {
            System.out.println("La pila está vacía.");
            return -1;  // Valor que indica que la pila está vacía
        }
        return tope.getValor();
    }

    /* Busca un elemento en la pila */
    public int buscar(int valor) {
        Nodo actual = tope;
        int posicion = 0;
        while (actual != null) {
            if (actual.getValor() == valor) {
                return posicion;
            }
            actual = actual.getSiguiente();
            posicion++;
        }
        return -1;  // Valor no encontrado
    }

    /* Convierte la lista ligada a una representación en cadena */
    @Override
    public String toString() {
        if(esVacia()) {
            return "[]";
        }
        String cadena = "[";
        Nodo actual = tope;   // Creamos una variable auxiliar de tipo Nodo para recorrer la lista (Cuidado que no es un nodo en si sino un puntero al nodo).

        while (actual.getSiguiente() != null) {     // Recorremos la lista hasta el penúltimo nodo
            cadena += actual.getValor() + ",";      // Agregamos el valor del nodo actual a la cadena
            actual = actual.getSiguiente();
        }
        cadena += actual.getValor() + "]";          // Agregamos el valor del último nodo a la cadena y cerramos el corchete

        return cadena;                              // Devolvemos la cadena que representa la lista ligada
    }
}
