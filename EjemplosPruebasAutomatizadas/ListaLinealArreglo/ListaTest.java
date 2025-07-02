
package Listas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
/**
 * Clase que realiza pruebas a la clase Lista con el paquete JUnit
 * 
 * @author Magali
 * @version 1.0
 */
public class ListaTest {

    /**
     * Aqui verificamos que el estado de la lista sea el esperado, despues de usar
     * una funcion que potencialmente modifica la lista
     */
    @Test // Indica que es un test
    public void estadoLista() {
        Lista l1 = new Lista(5);
        assertEquals(true, l1.esVacia());
        assertEquals(false, l1.esLlena());
        assertEquals("[]", l1.toString());
        l1.agregarAlFinal(5);
        assertEquals("[5]", l1.toString());
        l1.agregarAlInicio(3);
        assertEquals("[3, 5]", l1.toString());
        l1.agregarEn(1, 4);
        assertEquals("[3, 4, 5]", l1.toString());
        l1.mostrar();
        assertEquals(3, l1.devolver(0));
        assertEquals(4, l1.devolver(1));
        assertEquals(5, l1.devolver(2));
        assertThrows(IndexOutOfBoundsException.class, () -> {
            l1.devolver(3);
        });
        l1.eliminar(1);
        assertEquals("[3, 5]", l1.toString());
        l1.reemplazar(0, 8);
        assertEquals("[8, 5]", l1.toString());
        assertEquals(1, l1.buscar(5));
        assertEquals(-1, l1.buscar(10));
    }

    /**
     * Verifica que la lista se pueda crear con una capacidad especificada
     */
    @Test
    public void crearListaConCapacidad() {
        Lista l1 = new Lista(5);
        assertEquals(5, l1.getCapacidad());
        assertEquals(0, l1.getTam());
}
//@Test
//public void sumas(){
//    Lista l2 = new Lista(5);

//    assertEquals(6,l2.sumar())
//}
}
