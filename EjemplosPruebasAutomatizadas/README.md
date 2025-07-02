# Ejemplos de Pruebas Automatizadas en Java (JUnit 5)

Este repositorio contiene ejemplos educativos de **pruebas automatizadas** utilizando **JUnit 5** en Java.

Actualmente incluye:

- 📂 `Calculadora/`: Proyecto base que muestra cómo probar operaciones matemáticas básicas con JUnit 5.
- 📂 `ListaLinealArreglos/`: Proyecto base que muestra cómo probar los métodos de nuestra primera lista lineal basada en arreglos con JUnit 5.

---

## 🛠 Requisitos Generales

Antes de comenzar, asegúrate de tener instalado:

- Java Development Kit (JDK) 11 o superior
- Un entorno de desarrollo (IDE) como **Visual Studio Code**, **Eclipse** o **IntelliJ IDEA**
- JUnit 5 (puede venir preconfigurado en los IDEs modernos o agregarse manualmente)

---

## 🚀 Cómo correr pruebas automatizadas

Puedes mantener los archivos `.java` juntos en una misma carpeta o, si prefieres organizar mejor tu proyecto, puedes separarlos en carpetas como `src/` para el código fuente y `test/` para las pruebas. Ambos enfoques son válidos, siempre que tu entorno de desarrollo los detecte correctamente.

### 🌀 En Eclipse

1. Crea un nuevo **Java Project**
2. Agrega los archivos del proyecto (pueden estar juntos o en carpetas separadas)
3. Añade **JUnit 5** a tu proyecto:
   - Clic derecho en el proyecto > Build Path > Add Libraries > JUnit > JUnit 5
4. Clic derecho sobre el archivo `NombreClaseTest.java` y selecciona **"Run As > JUnit Test"**

### 💡 En IntelliJ IDEA

1. Crea un nuevo proyecto Java
2. Agrega los archivos del proyecto en una misma carpeta o en `src/` y `test/`
3. Asegúrate de que JUnit 5 esté agregado como dependencia
4. Haz clic derecho sobre la clase de prueba y selecciona **"Run 'NombreClaseTest'"**

---

## 🔍 ¿Qué contiene cada ejemplo?

Los proyectos incluyen:
- Código fuente en una o varias clases Java
- Una clase de pruebas automatizadas con métodos anotados con `@Test`
- Un archivo `README.md` explicando brevemente qué hace el ejemplo y cómo probarlo

Ejemplo de estructura (opcional, si decides organizarlo en carpetas):

```
NombreDelProyecto/
├── src/               # Código fuente
│   └── ClasePrincipal.java
├── test/              # Pruebas unitarias
│   └── ClasePrincipalTest.java
└── README.md          # Instrucciones específicas del proyecto
```

---

## 📚 En desarrollo

Se agregarán más proyectos próximamente, incluyendo:

- Pruebas para los ejemplos de polimorfismo
- Pruebas para estructuras de datos como listas ligadas
- Pruebas con manejo de excepciones

---

## 👩‍🏫 Propósito

Estos ejemplos han sido preparados con fines educativos para el curso de APALOO. Puedes utilizarlos para aprender o repasar cómo aplicar pruebas automatizadas en Java.

---
