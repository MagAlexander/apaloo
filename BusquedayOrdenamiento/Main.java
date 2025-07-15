package BusquedayOrdenamiento;

/*
 * Clase principal para realizar pruebas de búsqueda y ordenamiento.
 * @author Magali
 * @version 1.0
 */ 
public class Main {
    public static void main(String[] args) {

        // Arreglo de enteros de tamaño 10 llenado con números aleatorios
        int[] arreglo = new int[10];
        for (int i = 0; i < arreglo.length; i++) {
            // Crear un arreglo con números aleatorios entre 1 y 10 sin repetición
            java.util.Random rand = new java.util.Random();
            arreglo[i] = rand.nextInt(10) + 1; // Números entre 1 y 10, pueden repetirse
        }
        // Imprimir el arreglo original
        System.out.println("Arreglo original:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

 
        
        // ----------Prueba de algoritmos de ordenamiento------------
        
        // Creamos una copia del arreglo para cada algoritmo de ordenamiento
        // para evitar que se modifique el arreglo original
        int [] arregloBurbuja = arreglo.clone();
        int [] arregloSeleccion = arreglo.clone();
        int [] arregloInsercion = arreglo.clone();

        // Llamamos a los métodos de ordenamiento
        // Ordenamiento por burbuja
        System.out.println("Ordenamiento Burbuja:");
        AlgoritmosOrdenamiento.burbuja(arregloBurbuja);
        for (int i = 0; i < arregloBurbuja.length; i++) {
            System.out.print(arregloBurbuja[i] + " ");
        }
        System.out.println();
        // Ordenamiento por selección
        System.out.println("Ordenamiento Selección:");
        AlgoritmosOrdenamiento.seleccion(arregloSeleccion);
        for (int i = 0; i < arregloSeleccion.length; i++) {
            System.out.print(arregloSeleccion[i] + " ");
        }
        System.out.println();
        // Ordenamiento por inserción
        System.out.println("Ordenamiento Inserción:");
        AlgoritmosOrdenamiento.insercion(arregloInsercion);
        for (int i = 0; i < arregloInsercion.length; i++) {
            System.out.print(arregloInsercion[i] + " ");
        }
        System.out.println();

      
        //-----------Prueba de algoritmos de búsqueda------------
        
        int clave = 10; // Valor a buscar en el arreglo
        int resultadoLineal = AlgoritmosBusqueda.busquedaLineal(arreglo, clave);
        int resultadoBinaria = AlgoritmosBusqueda.busquedaBinaria(arregloInsercion, clave); // Probamos en un arreglo ya ordenado

        System.out.println("Búsqueda Lineal: " + resultadoLineal);
        System.out.println("Búsqueda Binaria: " + resultadoBinaria);

        //En un programa como este se pueden ver tiempos de ejecución y eficiencia de los algoritmos
        //de ordenamiento y búsqueda, pero para simplificar, solo se muestran los resultados de     
        //las búsquedas y ordenamientos realizados.
        //Medir tiempos de ejecución es una tarea más compleja que requiere
        //un entorno de pruebas más controlado y específico.

    }
}
