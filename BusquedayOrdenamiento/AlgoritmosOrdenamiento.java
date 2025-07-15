package BusquedayOrdenamiento;

// Clase que contiene los algoritmos de ordenamiento
// Implementa los métodos de ordenamiento por burbuja, selección e inserción
// @author Magali
// @version 1.0

public class AlgoritmosOrdenamiento {
    
    /**
     * Algoritmo de ordenamiento por burbuja.
     * Ordena un arreglo de enteros utilizando el método de burbuja.
     * @param arreglo El arreglo a ordenar.
     */
    public static void burbuja(int[] arreglo) {
        int n, temp;
        n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiar
                    temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Algoritmo de ordenamiento por selección.
     * Ordena un arreglo de enteros utilizando el método de selección.
     * @param arreglo El arreglo a ordenar.
     */
    public static void seleccion(int[] arreglo) {
        int n, indiceMenor, aux;
        n = arreglo.length;
        for (int i = 0; i < n - 1; i++) { // Recorre el arreglo hasta el penúltimo elemento
            indiceMenor = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            // Intercambiar el elemento mínimo encontrado con el primer elemento
            if (indiceMenor != i) {
                aux = arreglo[indiceMenor];
                arreglo[indiceMenor] = arreglo[i];
                arreglo[i] = aux;
            }
        }
    }

    /**
     * Algoritmo de ordenamiento por inserción.
     * Ordena un arreglo de enteros utilizando el método de inserción.
     * @param arreglo El arreglo a ordenar.
     */
    public static void insercion(int[] arreglo) {
        int n, j, aux;
        n = arreglo.length;
        for (int i = 1; i < n; i++) {
            //indice j para comparar los elementos
            //con el elemento actual (arreglo[i])
            j = i;  // Comienza desde el elemento anterior
            aux = arreglo[i]; // Guarda el valor actual para insertarlo en la posición correcta
            // Mover los elementos del arreglo que son mayores que la clave
            while (j > 0 && aux < arreglo[j-1]) {
                arreglo[j] = arreglo[j-1]; // Desplaza el elemento hacia la derecha
                j--;
            }
            arreglo[j] = aux;
        }
    }

}
