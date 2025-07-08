package ColaLigadaSimple;
/*
 * Clase principal que crea una cola ligada simple, agrega elementos, muestra su tamaño,
 * verifica si está vacía, obtiene el valor del primer elemento, busca un elemento,
 * elimina un elemento y muestra la cola en diferentes etapas.
 * @author Magali
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        // Crear una cola ligada simple
        ColaLigadaSimple cola = new ColaLigadaSimple();

        // Agregar elementos a la cola
        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);
        cola.encolar(40);

        // Mostrar el tamaño de la cola
        System.out.println("Tamaño de la cola: " + cola.getTam());

        // Verificar si la cola está vacía
        System.out.println("¿La cola está vacía? " + cola.esVacia());
        //mostrar la cola con toString
        System.out.println("Cola: "+cola);

        // Valor del primer elemento
        System.out.println("Primer elemento: " + cola.getFrente());

        //Buscar un elemento en la cola
        int valorABuscar = 20;
        int posicion = cola.buscar(valorABuscar);
        if (posicion != -1) {
            System.out.println("El valor " + valorABuscar + " se encuentra en la posición: " + posicion);
        } else {
            System.out.println("El valor " + valorABuscar + " no se encuentra en la cola.");
        }

        // Eliminar el primer elemento
        cola.desencolar();
        System.out.println("Después de eliminar el primer elemento: " + cola);
        // Eliminar el último elemento
        cola.desencolar();
        System.out.println("Después de eliminar el último elemento: " + cola);
        // Eliminar un elemento en una posición específica
        cola.desencolar();
        System.out.println("Después de eliminar el elemento en la posición 1: " + cola);
    }
    
}
