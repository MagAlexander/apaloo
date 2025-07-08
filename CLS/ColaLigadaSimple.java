package ColaLigadaSimple;

/**
 * Clase que representa una cola ligada simple con nodos que guardan enteros.
 * @author Magali
 * @version 1.0
 */

public class ColaLigadaSimple {
    private Nodo inicio;
    private Nodo fin;
    private int tam;

    /**
     * Constructor de la clase Cola.
     * Este constructor inicializa la cola estableciendo el inicio y el fin como null.
     */
    public ColaLigadaSimple() {
        // Por buenas prácticas vamos a inicializar los atributos ya que si pasamos esto a otros lenguajes podrían no hacerlo.
        this.inicio = null;
        this.fin = null;
        this.tam = 0;
    }

    /**
     * Verifica si la cola está vacía.
     * @return true si la cola está vacía, false en caso contrario.
     */
    public boolean esVacia() {
        return inicio == null;
    }

    /* No tenemos una función esLlena() porque en una cola ligada no hay un límite fijo de capacidad. */

    /**
     * Obtiene el tamaño actual de la cola.
     * @return El número de elementos en la cola.
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
    public void encolar(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (esVacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
        tam++;
    }

    /**
     * Elimina el primer nodo de la cola.
     * Si la cola está vacía, no hace nada.
     * Si la cola tiene un solo nodo, lo elimina y establece el inicio y el fin como null.
     * Si la cola tiene más de un nodo, simplemente mueve el inicio al siguiente nodo.
     */
    public void desencolar() {
        if (esVacia()) {
            System.out.println("La cola está vacía.");
            return;
        }
        inicio = inicio.getSiguiente();
        tam--;
        System.out.println("Nodo eliminado al inicio.");
    }

    /**
     * Obtiene el valor del nodo al frente de la cola.
     * @return El valor del nodo al frente, o -1 si la cola está vacía.
    */
    public int getFrente() {
        if (esVacia()) {
            System.out.println("La cola está vacía.");
            return -1;  // Valor que indica que la cola está vacía
        }
        return inicio.getValor();
    }

    /* Busca un elemento en la cola */
    public int buscar(int valor) {
        Nodo actual = inicio;
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
        Nodo actual = inicio;   // Creamos una variable auxiliar de tipo Nodo para recorrer la lista (Cuidado que no es un nodo en si sino un puntero al nodo).
        
        while (actual.getSiguiente() != null) {     // Recorremos la lista hasta el penúltimo nodo
            cadena += actual.getValor() + ",";      // Agregamos el valor del nodo actual a la cadena
            actual = actual.getSiguiente();
        }
        cadena += actual.getValor() + "]";          // Agregamos el valor del último nodo a la cadena y cerramos el corchete

        return cadena;                              // Devolvemos la cadena que representa la lista ligada
    }
}
