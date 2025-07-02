package Calculadora;

import org.junit.jupiter.api.Test;  // Importamos las librerías necesarias para JUnit
import static org.junit.jupiter.api.Assertions.*;   // Importamos las aserciones de JUnit


/**
 * Clase que realiza pruebas a la clase Calculadora con el paquete JUnit
 * 
 * @author Magali
 * @version 1.0
 */
public class CalculadoraTest {
    /**
     * Aquí verificamos que el llamado a las funciones regrese el valor esperado
     */
    @Test
    public void testSuma() {
        Calculadora calc = new Calculadora();
        assertEquals(7, calc.suma(3, 4));
    }

    @Test
    public void testResta() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.resta(5, 3));
    }

    @Test
    public void testMultiplica() {
        Calculadora calc = new Calculadora();
        assertEquals(20, calc.multiplica(4, 5));
    }

    @Test
    public void testDivide() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.divide(10, 5));
    }

    @Test
    public void testDivisionPorCero() {
        Calculadora calc = new Calculadora();
        assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
    }
}
