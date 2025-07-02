# Ejemplos de Pruebas Automatizadas en Java (JUnit 5)

Este repositorio contiene ejemplos educativos de **pruebas automatizadas** utilizando **JUnit 5** en Java.

Actualmente incluye:

- 📂 `Calculadora/`: Proyecto base que muestra cómo probar operaciones matemáticas básicas con JUnit 5.
- 📂 `ListaLinealArreglos/`: Proyecto base que muestra cómo probar los métodos de nuesta primer lista lineal basada en arreglos con JUnit 5.

---

## 🛠 Requisitos Generales

Antes de comenzar, asegúrate de tener instalado:

- Java Development Kit (JDK) 11 o superior  
  [Descargar JDK](https://adoptium.net/)  
- Un entorno de desarrollo (IDE) como **Visual Studio Code**, **Eclipse** o **IntelliJ IDEA**
- JUnit 5 (puede venir preconfigurado en los IDEs modernos o agregarse manualmente)

---

## 🚀 Cómo correr pruebas automatizadas

### ▶️ En Visual Studio Code

1. Instala la extensión **Java Extension Pack**
2. Abre la carpeta del proyecto (por ejemplo, `Calculadora/`)
3. Asegúrate de que los archivos `.java` estén organizados en `src/` y `test/` (opcional, pero recomendable)
4. Haz clic derecho sobre el archivo de pruebas (por ejemplo, `CalculadoraTest.java`) y selecciona **"Run Test"**
5. Visualiza los resultados en la pestaña de pruebas

### 🌀 En Eclipse

1. Asegúrate de tener instalado **Eclipse IDE for Java Developers**
2. Crea un nuevo **Java Project**
3. Agrega los archivos del proyecto (src y pruebas)
4. Añade **JUnit 5** a tu proyecto:
   - Haz clic derecho en el proyecto > Build Path > Add Libraries > JUnit > JUnit 5
5. Haz clic derecho sobre el archivo `CalculadoraTest.java` y selecciona **"Run As > JUnit Test"**

### 💡 En IntelliJ IDEA

1. Abre IntelliJ IDEA y selecciona **New Project > Java**
2. Agrega los archivos del proyecto
3. Asegúrate de que JUnit 5 esté agregado como dependencia (puedes usar Maven o Gradle, o agregarlo como biblioteca externa)
4. Haz clic derecho sobre la clase de prueba y selecciona **"Run 'CalculadoraTest'"**

---

## 🔍 ¿Qué contiene cada ejemplo?

Los proyectos seguirán esta estructura:

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

Estos ejemplos han sido preparados con fines educativos para el curso de APALOO. Puedes utilizarlos para aprender o repasar cómo aplicar pruebas automatizadas.

---
