# Lista basada en arreglos (estática) en Java

Este repositorio contiene una implementación de una lista tipo arreglo en Java, junto con pruebas automatizadas y un programa principal de demostración.

## Archivos incluidos

- `Lista.java`: Implementación de una lista basada en arreglos en Java, con operaciones como agregar, eliminar, buscar y mostrar elementos.
- `ListaTest.java`: Archivo de pruebas automáticas usando JUnit 5 para verificar el correcto funcionamiento de los métodos de la clase Lista.
- `Main.java`: Programa principal que permite interactuar con la lista para pruebas manuales o demostraciones en consola.

## Requisitos

- Java JDK 11 o superior
- [JUnit 5](https://junit.org/junit5/) para ejecutar las pruebas
- Un entorno como Visual Studio Code, IntelliJ IDEA o similar

## Cómo ejecutar

### Ejecutar manualmente (Main.java)

Compila y ejecuta el programa con:

```bash
javac Main.java Lista.java
java Main
```

### Ejecutar pruebas con JUnit 5

Asegúrate de tener JUnit 5 en tu entorno. Si usas VS Code:
1. Instala el paquete de extensiones "Java Extension Pack"
2. Abre este proyecto
3. Da clic derecho en `ListaTest.java` y selecciona "Run Tests"

## Estructura de la clase `Lista`

La clase permite:
- Agregar elementos
- Eliminar por valor o índice
- Buscar elementos
- Mostrar el contenido de la lista

## Créditos

Este proyecto fue elaborado para fines educativos en el curso de APALOO.

---
