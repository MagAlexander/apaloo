package ListaLigada;
/*
 * Clase que representa una lista ligada simple con nodos que guardan enteros.
 * @author Magali
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        // Crear una lista ligada
        ListaLigada lista = new ListaLigada();
        
        // Agregar elementos al inicio
        lista.agregarAlInicio(10);
        lista.agregarAlInicio(20);
        
        // Agregar elementos al final
        lista.agregarAlFinal(30);
        lista.agregarAlFinal(40);
        
        // Mostrar el tamaño de la lista
        System.out.println("Tamaño de la lista: " + lista.getTam());
        
        // Verificar si la lista está vacía
        System.out.println("¿La lista está vacía? " + lista.esVacia());
        //mostrar la lista con toString
        System.out.println("Lista: "+lista);
        
        // Eliminar el primer elemento
        lista.eliminaAlInicio();
        System.out.println("Después de eliminar el primer elemento: " + lista);
        // Eliminar el último elemento
        lista.eliminaAlFinal();
        System.out.println("Después de eliminar el último elemento: " + lista);
        // Eliminar un elemento en una posición específica
        lista.eliminaEn(1);
        System.out.println("Después de eliminar el elemento en la posición 1: " + lista);
    }
    
}
