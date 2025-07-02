# Proyecto de Pruebas Unitarias en Java con JUnit 5

Este proyecto contiene una clase `Calculadora` y su conjunto de pruebas automáticas utilizando **JUnit 5**.

## Archivos incluidos

- `Calculadora.java`: Implementa operaciones matemáticas básicas como suma, resta, multiplicación y división.
- `CalculadoraTest.java`: Contiene pruebas unitarias que verifican el funcionamiento correcto de cada operación, incluyendo una prueba que valida que se lance una excepción al intentar dividir entre cero.

## Descripción de las pruebas

- `testSuma()`, `testResta()`, `testMultiplica()`, `testDivide()` prueban que los métodos de la clase `Calculadora` funcionan correctamente con valores esperados.
- `testDivisionPorCero()` asegura que el método `divide()` lanza una excepción `ArithmeticException` cuando el segundo parámetro es cero.

Este proyecto puede usarse como introducción a la escritura de pruebas automatizadas en Java.
