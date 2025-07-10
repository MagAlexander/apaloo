package ManejoArchivos;
// Ejemplos y ejercicios de manejo de archivos en Java: Creación, escritura y lectura de archivos.

import java.io.*;   // Importamos las todas las clases necesarias para manejar archivos

public class Ejercicios1 {

    public static void main(String[] args) {
        // Hacer: Define la ruta del directorio y del archivo
        String nombreCarpeta = "mis_archivos";
        String nombreArchivo = "datos.txt";

        // Paso 1: Crear la carpeta si no existe
        File carpeta = new File(nombreCarpeta);
        if (!carpeta.exists()) {
            System.out.println("La carpeta no existe. Creándola...");
            //EJERCICIO: Usa mkdir para crear la carpeta

            
        }

        // Paso 2: Crear el archivo si no existe
        File archivo = new File(carpeta, nombreArchivo);
        if (!archivo.exists()) {
            try {
                // EJERCICIO: Usa createNewFile para crear el archivo





                System.out.println("Archivo creado exitosamente.");
            } catch (IOException e) {
                System.out.println("Error al crear el archivo: " + e.getMessage());
            }
        }

        // Paso 3: Escribir contenido al archivo
        // EJEMPLO DE ESCRITURA EN ARCHIVO CON FileWriter Y BufferedWriter

        // Vamos a escribir texto dentro del archivo "mis_archivos/datos.txt"
        // Utilizamos FileWriter para escribir en el archivo, y BufferedWriter para hacerlo de forma más eficiente

        try {
            // FileWriter con 'true' permite *agregar* texto al final sin borrar lo anterior
            FileWriter fw = new FileWriter("mis_archivos/datos.txt", true);

            // BufferedWriter es un envoltorio que hace más eficiente la escritura
            BufferedWriter bw = new BufferedWriter(fw);

            // Escribimos algunas líneas de texto
            bw.write("Hola desde Java :)");
            bw.newLine(); // Esto agrega un salto de línea
            bw.write("Este texto se guardó en el archivo usando BufferedWriter.");
            bw.newLine();

            // Cerramos el BufferedWriter (esto también cierra el FileWriter automáticamente)
            bw.close();

            System.out.println("Texto escrito correctamente en el archivo.");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
        }


        // EJERCICIO:
// Escribe tu propio mensaje personalizado dentro del archivo "mis_archivos/mensaje_personal.txt"
// Usa FileWriter y BufferedWriter como en el ejemplo anterior

// PASOS:
// 1. Crea el archivo si no existe
// 2. Escribe al menos dos líneas: tu nombre y una frase que te guste
// 3. Ejecuta el programa y verifica que el archivo se haya creado y contenga tu mensaje



        // EJEMPLO DE LECTURA DE UN ARCHIVO CON FileReader Y BufferedReader

    // Vamos a leer el archivo "mi_directorio/archivo_ejemplo.txt" línea por línea.
    // Usamos FileReader para abrir el archivo y BufferedReader para leerlo más fácilmente.

    try {
        // Abrimos el archivo para lectura
        FileReader fr = new FileReader("mis_archivos/datos.txt");

        // BufferedReader nos permite leer una línea completa a la vez
        BufferedReader br = new BufferedReader(fr);

        System.out.println("Leyendo el contenido del archivo:");

        String linea;
        // Leemos línea por línea hasta que no haya más (readLine devuelve null al final)
        while ((linea = br.readLine()) != null) {
            System.out.println(linea);
        }

        // Cerramos el BufferedReader (esto también cierra el FileReader)
        br.close();

    } catch (IOException e) {
        System.out.println("Error al leer el archivo: " + e.getMessage());
    }

        // EJERCICIO:
        // Lee el archivo "mis_archivos/mensaje_personal.txt" que creaste antes
        // Imprime su contenido línea por línea en la consola
        // Usa FileReader y BufferedReader como en el ejemplo anterior



        //EJERCICIO EXTRA:
        // EJERCICIO:
// Crea un nuevo archivo llamado "mis_archivos/lista_de_compras.txt"
// Asegúrate de que contenga varias líneas con diferentes productos.

// Luego, escribe un bloque de código que:
// 1. Abra ese archivo.
// 2. Lea cada línea una por una.
// 3. Imprima cada producto precedido por "- ", como si fuera una lista visual.

// Ejemplo de salida esperada:
// Leyendo lista_de_compras.txt:
// - Leche
// - Pan
// - Huevos


    }
}
