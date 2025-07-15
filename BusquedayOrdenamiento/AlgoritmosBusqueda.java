package BusquedayOrdenamiento;

// Clase que contiene los algoritmos de búsqueda
// Implementa los métodos de búsqueda lineal y binaria
// @author Magali
// @version 1.0

public class AlgoritmosBusqueda {
    /**
     * Algoritmo de búsqueda lineal.
     * Busca un elemento en un arreglo de forma secuencial.
     * @param arreglo El arreglo donde se busca el elemento.
     * @param clave El elemento a buscar.
     * @return El índice del elemento si se encuentra, -1 si no se encuentra.
     */
    public static int busquedaLineal(int[] arreglo, int clave) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == clave) {
                return i; // Retorna el índice del elemento encontrado
            }
        }
        return -1; // Retorna -1 si el elemento no se encuentra
    }


    /**
     * Algoritmo de búsqueda binaria.
     * Busca un elemento en un arreglo ordenado utilizando el método de división y conquista.
     * @param arreglo El arreglo ordenado donde se busca el elemento.
     * @param clave El elemento a buscar.
     * @return El índice del elemento si se encuentra, -1 si no se encuentra.
     */
    public static int busquedaBinaria(int[] arreglo, int clave) {
        int central, bajo, alto;
        // Inicializa los límites izquierdo y derecho
        bajo = 0;
        alto = arreglo.length - 1;

        while (bajo <= alto) {
            central = (bajo + alto) / 2; // Encuentra el punto medio del arreglo

            // Verifica si el elemento está presente en el medio
            if (arreglo[central] == clave) {
                return central; // Retorna el índice del elemento encontrado
            }else if (arreglo[central] < clave) {
                bajo = central + 1; // Si el elemento es mayor, ignora la mitad inferior
            } else {
                alto = central - 1; // Si el elemento es menor, ignora la mitad superior
            }
        }
        return -1; // Retorna -1 si el elemento no se encuentra
    }

    
}
