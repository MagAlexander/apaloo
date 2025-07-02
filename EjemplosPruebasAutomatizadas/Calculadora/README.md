# Proyecto de pruebas unitarias en una calculadora en Java con JUnit 5

Este proyecto contiene una clase `Calculadora` y su conjunto de pruebas automáticas usando **JUnit 5**.

## Pasos para probar el código en VS Code

### 1. Requisitos

- Tener instalado **Java JDK** (versión 11 o superior)
- Tener instalado **Visual Studio Code**
- Instalar el plugin **Java Extension Pack** desde la tienda de extensiones

### 2. Abrir el proyecto

1. Abre Visual Studio Code
2. Selecciona "File" > "Open Folder..." y abre la carpeta descargada
3. Asegúrate de que `Calculadora.java` está en `src/` y `CalculadoraTest.java` en `test/`

### 3. Ejecutar las pruebas

- Haz clic derecho sobre `CalculadoraTest.java` y selecciona **"Run Tests"** o usa el botón de ejecutar del editor.
- VS Code mostrará los resultados en una ventana inferior indicando si pasaron o fallaron.

### 4. ¿Qué hace cada prueba?

- `testSuma()`, `testResta()`, `testMultiplica()`, `testDivide()` verifican que las operaciones matemáticas básicas funcionen bien.
- `testDivisionPorCero()` verifica que lanzar una división entre cero produce la excepción esperada.

Si algo falla, revisa bien el código y los valores esperados.
