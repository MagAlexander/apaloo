package ListaDoblementeLigada;

/**
 * Clase que representa una lista ligada doble con nodos que guardan enteros.
 * @author Magali
 * @version 1.0
 */

public class ListaLigadaDoble {
    private Nodo inicio;
    private int tam;

    /**
     * Constructor de la clase ListaLigada.
     * Este constructor inicializa la lista ligada estableciendo el inicio como null.
     */
    public ListaLigadaDoble() {
        // Por buenas prácticas vamos a inicializar los atributos ya que si pasamos esto a otros lenguajes podrían no hacerlo.
        this.inicio = null;
        this.tam = 0;
    }

    /**
     * Verifica si la lista ligada está vacía.
     * @return true si la lista está vacía, false en caso contrario.
     */
    public boolean esVacia() {
        return inicio == null;
    }

    /* No tenemos una función esLlena() porque en una lista ligadano hay un límite fijo de capacidad. */

    /**
     * Obtiene el tamaño actual de la lista ligada.
     * @return El número de elementos en la lista.
     */
    public int getTam() {
        return tam;
    }
    
    /**
     * Inserta un nuevo nodo al inicio de la lista ligada.
     * @param valor El valor que se asignará al nuevo nodo.
     */
    public void agregarAlInicio(int valor) {
        Nodo nuevo = new Nodo(valor);       // Creamos un nuevo nodo con el valor proporcionado
        nuevo.setSiguiente(inicio);         // El apuntador "siguiente" del nuevo nodo apunta al inicio actual de la lista
        if (inicio != null) {
            inicio.setAnterior(nuevo);       // Si la lista no está vacía, el nodo anterior del inicio apunta al nuevo nodo
        }
        inicio = nuevo;                     // El inicio de la lista ahora debe apuntar al nuevo nodo
        tam++;                              // Incrementamos el tamaño de la lista
    }

    /**
     * Inserta un nuevo nodo al final de la lista ligada.
     * @param valor El valor que se asignará al nuevo nodo.
     * * Si la lista está vacía, el nuevo nodo se convierte en el inicio.
     * * Si la lista no está vacía, se recorre la lista hasta el último nodo y se agrega el nuevo nodo al final.
     */
    public void agregarAlFinal(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (esVacia()) {
            inicio = nuevo;
        } else {
            Nodo actual = inicio;                   // Creamos una variable auxiliar de tipo Nodo para recorrer la lista (Cuidado que no es un nodo en si sino un puntero al nodo). 
            while (actual.getSiguiente() != null) { // Recorremos la lista hasta el último nodo(donde el siguiente es null)
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);             // El apuntador "siguiente" del último nodo apunta al nuevo nodo
            nuevo.setAnterior(actual);               // El apuntador "anterior" del nuevo nodo apunta al último nodo
        }
        tam++;
    }

    /**
     * Inserta un nuevo nodo en una posición específica de la lista ligada.
     * @param valor El valor que se asignará al nuevo nodo.
     * @param posicion La posición en la que se insertará el nuevo nodo (0 para el inicio, 1 para el segundo, etc.).
     * * Si la posición es inválida (menor que 0 o mayor que el tamaño actual), no se realiza ninguna acción.
     * * Si la posición es 0, se llama al método agregarAlInicio.
     * * En cualquier otro caso, se recorre la lista hasta la posición indicada y se inserta el nuevo nodo.
     */
    public void agregarEn(int valor, int posicion) {
        if (posicion < 0 || posicion > tam) {
            System.out.println("Posición inválida.");
            return;
        }
        if (posicion == 0) {
            agregarAlInicio(valor);
            return;
        }
        Nodo nuevo = new Nodo(valor);               // Creamos un nuevo nodo con el valor proporcionado
        Nodo actual = inicio;                       // Creamos una variable auxiliar de tipo Nodo para recorrer la lista (Cuidado que no es un nodo en si sino un puntero al nodo).
        for (int i = 0; i < posicion - 1; i++) {    // Recorremos la lista hasta el nodo anterior al que queremos insertar
            actual = actual.getSiguiente();     
        }
        // Ahora actual apunta al nodo anterior a la posición indicada
        nuevo.setSiguiente(actual.getSiguiente());  // El apuntador "siguiente" del nuevo nodo apunta al nodo siguiente al actual
        nuevo.setAnterior(actual);                  // El apuntador "anterior" del nuevo nodo apunta al nodo actual
        if (actual.getSiguiente() != null) {    // Si el nodo actual tiene un siguiente, lo actualizamos
            actual.getSiguiente().setAnterior(nuevo); // El nodo siguiente al nuevo debe apuntar hacia atrás al nuevo nodo
        }
        actual.setSiguiente(nuevo);                 // El apuntador "siguiente" del nodo actual apunta al nuevo nodo
        tam++;
    }

    /**
     * Elimina el primer nodo de la lista ligada.
        * Si la lista está vacía, no hace nada.
        * Si la lista tiene un solo nodo, lo elimina y establece el inicio como null.
        * Si la lista tiene más de un nodo, simplemente mueve el inicio al siguiente nodo.
     */
    public void eliminarAlInicio() {
        if (esVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }
        inicio = inicio.getSiguiente();
        tam--;
        System.out.println("Nodo eliminado al inicio.");
    }
    /**
    * Elimina el último nodo de la lista ligada.
        * Si la lista está vacía, no hace nada.
        * Si la lista tiene un solo nodo, lo elimina y establece el inicio como null.
        * Si la lista tiene más de un nodo, recorre la lista hasta el penúltimo nodo y elimina el último nodo.
     */
    public void eliminarAlFinal() {
        if (esVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }
        if (inicio.getSiguiente() == null) {    // Si solo hay un nodo en la lista
            inicio = null;
        } else {
            Nodo actual = inicio;
            while (actual.getSiguiente().getSiguiente() != null) {  // Recorremos la lista hasta el penúltimo nodo
                actual = actual.getSiguiente();
            }
            // Ahora actual apunta al penúltimo nodo
            actual.setSiguiente(null);          // El penúltimo nodo ahora apunta a null, eliminando el último nodo
        }
    
        // Decrementamos el tamaño de la lista
        tam--;
        System.out.println("Nodo eliminado al final.");
    }

    /**
     * Elimina un nodo en una posición específica de la lista ligada.
     * @param posicion La posición del nodo a eliminar (0 para el inicio, 1 para el segundo, etc.).
     * @return El valor del nodo eliminado, o -1 si la lista está vacía o la posición es inválida.
     */
    public void eliminarEn(int posicion) {
        if (esVacia()) {
            System.out.println("La lista está vacía.");
            return;
        }
        if (posicion < 0 || posicion >= tam) {
            System.out.println("Posición inválida.");
        }else if (posicion == tam - 1) {
            eliminarAlFinal();  // Si la posición es la última, llamamos al método eliminarAlFinal
            return;
        } else  if (posicion == 0) {
            eliminarAlInicio(); // Si la posición es la primera, llamamos al método eliminarAlInicio
            return;
        }else{
            Nodo actual = inicio;
            for (int i = 0; i < posicion - 1; i++) {    // Recorremos la lista hasta el nodo anterior al que queremos eliminar
                actual = actual.getSiguiente();     
            }
            // El nodo a eliminar es actual.getSiguiente()
            actual.getSiguiente().getSiguiente().setAnterior(actual); // El nodo siguiente al que vamos a eliminar debe apuntar hacia atrás al nodo actual
            actual.setSiguiente(actual.getSiguiente().getSiguiente());  // Saltamos el nodo a eliminar
            tam--;
            System.out.println("Nodo eliminado en la posición " + posicion + ".");
        }
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
