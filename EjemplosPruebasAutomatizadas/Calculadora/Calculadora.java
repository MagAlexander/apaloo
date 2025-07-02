package Calculadora;
/*
 * Calculadora.java
 * Esta clase define una calculadora simple con operaciones básicas.
 * @author Magali
 * @version 1.0
 */
public class Calculadora {

    /**
     * Suma dos números enteros.
     * @param a Primer número.
     * @param b Segundo número.
     * @return La suma de a y b.
     */
    public int suma(int a, int b) {
        return a + b;
    }

    /**
     * Resta dos números enteros.
     * @param a Primer número.
     * @param b Segundo número.
     * @return La resta de a y b.
     */
    public int resta(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dos números enteros.
     * @param a Primer número.
     * @param b Segundo número.
     * @return El producto de a y b.
     */
    public int multiplica(int a, int b) {
        return a * b;
    }

    /**
     * Divide dos números enteros.
     * @param a Primer número.
     * @param b Segundo número.
     * @return La división de a entre b.
     */
    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("No se puede dividir entre cero");
        return a / b;
    }
}
