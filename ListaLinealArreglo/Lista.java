package Listas;

/*******
 Clase que representa una lista de enteros implementada con un arreglo.
 @author Magali
 @version 1.0
 *******/
public class Lista {
    private int[] datos;
    private int tam;

    /// @brief Constructor que crea una lista con una capacidad dada.
    /// @param capacidad La cantidad de elementos que puede almacenar la lista.
    /// @details Inicializa el arreglo de datos con la capacidad especificada y establece el tamaño
    /// a 0. Imprime un mensaje indicando que se creó la lista con el espacio especificado.
    /// @throws IllegalArgumentException Si la capacidad es menor o igual a 0.
    public Lista(int capacidad) throws IllegalArgumentException{
    
        if (capacidad <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor que 0.");
        }
        this.datos = new int[capacidad];
        this.tam = 0;
        System.out.println("Se creó una lista con espacio para "+capacidad+" elementos.");
    }

    /// @brief Constructor que crea una lista con una capacidad predeterminada de 10.
    public Lista() {
        this(10); // Llama al constructor con capacidad 10
    }

    /// @brief Agrega un elemento al final de la lista.
    /// @param valor El valor a agregar al final de la lista.
    public void agregarAlFinal(int valor) {
        if (esLlena()) {
            System.out.println("Lista llena.");
            return;
        }
        datos[tam++] = valor;
    }

    /// @brief Agrega un elemento al inicio de la lista.
    /// @param valor El valor a agregar al inicio de la lista.
    public void agregarAlInicio(int valor) {
        if (esLlena()) {
            System.out.println("Lista llena.");
            return;
        }
        for (int i = tam; i > 0; i--) {
            datos[i] = datos[i - 1];
        }
        datos[0] = valor;
        tam++;
    }

    /// @brief Agrega un elemento en el índice indicado.
    /// @param indice El índice donde se agregará el valor.
    /// @param valor El valor a agregar en el índice especificado.
    public void agregarEn(int indice, int valor) {
        if (esLlena()) {
            System.out.println("Lista llena.");
            return;
        }
        if (indice < 0 || indice > tam) {
            System.out.println("Índice inválido.");
            return;
        }
        for (int i = tam; i > indice; i--) {
            datos[i] = datos[i - 1];
        }
        datos[indice] = valor;
        tam++;
    }

    /// @brief Indica si la lista está vacía.
    /// @return true si la lista no contiene elementos, false en caso contrario.
    public boolean esVacia() {
        return tam == 0;
    }

    /// @brief Indica si la lista está llena.
    /// @return true si la lista ha alcanzado su capacidad máxima, false en caso contrario.
    public boolean esLlena() {
        return tam == datos.length;
    }

    /// @brief Elimina todos los elementos de la lista.
    /// @details Esta función simplemente establece el tamaño de la lista a 0, lo que efectivamente elimina todos los elementos.
    /// No se necesita recorrer el arreglo para eliminar los elementos, ya que el tamaño es lo que determina cuántos elementos hay en la lista.
    public void limpiar() {
        for (int i = 0; i < tam; i++) {
            datos[i] = 0; // Opcional: limpiar los datos, aunque no es necesario para el funcionamiento.
        }
        tam = 0;  // Establecer el tamaño a 0 para indicar que la lista está vacía.

    }
    
    /// @brief Elimina el elemento en el índice indicado.
    /// @param indice El índice del elemento a eliminar.
    public void eliminar(int indice){
        if(indice<0||indice >=tam) return;
        
        for (int i=indice; i<tam;i++){
            datos[i]=datos[i+1];
        }
        tam--;
    }

    /// @brief Elimina el dato al inicio de la lista.
    public void eliminarAlInicio(){
        if (esVacia()) {
            System.out.println("No es posible eliminar. Lista vacía.");
            return;
        }
        for (int i = 0; i < tam - 1; i++) {
            datos[i] = datos[i + 1];
        }
        tam--;
    }

    /// @brief Elimina el dato al final de la lista.
    public void eliminarAlFinal() {
        if (esVacia()) {
            System.out.println("No es posible eliminar. Lista vacía.");
            return;
        }
        datos[tam - 1] = 0; // Opcional: limpiar el último elemento, aunque no es necesario para el funcionamiento.
        tam--;
    }
    
    /// @brief Busca un elemento y devuelve el índice de la primera aparición.
    /// @param valor El valor a buscar en la lista.
    /// @return El índice del primer elemento que coincide con el valor buscado, o -1 si no se encuentra.
    public int buscar(int valor){
        for(int i =0;i<tam;i++){
            if(datos[i]== valor) return i;
        }
        return -1;
    }
    
    /// @brief Busca un elemento y devuelve el índice de la primera aparición.
    /// @param valor El valor a buscar en la lista.
    /// @return El índice del primer elemento que coincide con el valor buscado, o -1 si no se encuentra.
    public int devolver(int indice) throws IndexOutOfBoundsException {
        if (indice < 0 || indice >= tam) {
            //System.out.println("Índice inválido.");
            throw new IndexOutOfBoundsException("Índice fuera de los límites de la lista.");
            //return -1;
        }
        return datos[indice];
    }


    /// @brief Reemplaza el valor en una posición dada.
    /// @param indice El índice del elemento a reemplazar.
    /// @param nuevoValor El nuevo valor que se asignará al elemento en el índice especificado.
    public void reemplazar(int indice, int nuevoValor) {
        if (indice < 0 || indice >= tam) {
            System.out.println("Índice inválido.");
            return;
        }
        datos[indice] = nuevoValor;
    }

    /// @brief Muestra el contenido de la lista.
    public void mostrar() {
        System.out.print("[");
        for (int i = 0; i < tam; i++) {
            System.out.print(datos[i]);
            if (i < tam - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    @Override
    /// @brief Devuelve una representación en cadena de la lista.
    /// @return Una cadena que representa los elementos de la lista en formato de arreglo.
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < tam; i++) {
            sb.append(datos[i]);
            if (i < tam - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    /// @brief Devuelve la capacidad de la lista.
    /// @return La capacidad máxima de la lista.
    public int getCapacidad() {
        return datos.length;    
    }

    /// @brief Devuelve el tamaño actual de la lista.
    /// @return El número de elementos actualmente almacenados en la lista.
    public int getTam() {
        return tam; 
    }
}
