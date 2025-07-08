package PilaLigadaSimple;
/*
 * Clase principal que crea una pila ligada simple, agrega elementos, muestra su tamaño,
 * verifica si está vacía, obtiene el valor del primer elemento, busca un elemento,
 * elimina un elemento y muestra la pila en diferentes etapas.
 * @author Magali
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        // Crear una pila ligada simple
        PilaLigadaSimple pila = new PilaLigadaSimple();

        // Agregar elementos a la pila
        pila.apilar(10);
        pila.apilar(20);
        pila.apilar(30);
        pila.apilar(40);

        // Mostrar el tamaño de la pila
        System.out.println("Tamaño de la pila: " + pila.getTam());

        // Verificar si la pila está vacía
        System.out.println("¿La pila está vacía? " + pila.esVacia());
        //mostrar la pila con toString
        System.out.println("Pila: "+pila);

        // Valor del primer elemento
        System.out.println("Primer elemento: " + pila.getFrente());

        //Buscar un elemento en la pila
        int valorABuscar = 20;
        int posicion = pila.buscar(valorABuscar);
        if (posicion != -1) {
            System.out.println("El valor " + valorABuscar + " se encuentra en la posición: " + posicion);
        } else {
            System.out.println("El valor " + valorABuscar + " no se encuentra en la pila.");
        }

        // Eliminar el primer elemento
        pila.desapilar();
        System.out.println("Después de eliminar el primer elemento: " + pila);
        // Eliminar el último elemento
        pila.desapilar();
        System.out.println("Después de eliminar el último elemento: " + pila);
        // Eliminar un elemento en una posición específica
        pila.desapilar();
        System.out.println("Después de eliminar el elemento en la posición 1: " + pila);
    }
    
}
