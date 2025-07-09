package ManejoArchivos;

import java.io.File;

public class Ejemplo2 { 
    public static void main(String[] args) {
        // Manejo de archivos en Java
        // Este ejemplo muestra cómo crear, escribir, leer, agregar contenido y eliminar un archivo en Java.

        System.out.println("Manejo de archivos en Java");

        // 1: Crear un archivo
        String fileName = "ejemplo.txt";
        File archivo = new File(fileName);
        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (java.io.IOException e) {
            System.out.println("Ocurrió un error al crear el archivo.");
            e.printStackTrace();
        }

        if (archivo.exists()) {
            System.out.println("Nombre del archivo " + archivo.getName());
            System.out.println("Ruta " + archivo.getPath());
            System.out.println("Ruta absoluta " + archivo.getAbsolutePath());
            System.out.println("Se puede escribir " + archivo.canRead());
            System.out.println("Se puede leer " + archivo.canWrite());
            System.out.println("Tamaño " + archivo.length());
        }else {
            System.out.println("El archivo no existe.");
        }

        // 2: Escribir en el archivo
        try (java.io.FileWriter writer = new java.io.FileWriter(fileName)) {
            writer.write("Hola, este es un ejemplo de manejo de archivos en Java.\n");
            writer.write("Puedes escribir varias líneas.\n");
            System.out.println("Se escribió en el archivo correctamente.");
        } catch (java.io.IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo.");
            e.printStackTrace();
        }

        // 3: Leer el archivo
        try (java.util.Scanner reader = new java.util.Scanner(archivo)) {
            System.out.println("Contenido del archivo:");
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
            e.printStackTrace();
        }

        // 4: Agregar contenido al archivo
        try (java.io.FileWriter writer = new java.io.FileWriter(archivo, true)) { // El segundo parámetro 'true' permite agregar contenido sin sobrescribir
            writer.write("Esta línea fue agregada posteriormente.\n");
            System.out.println("Se agregó contenido al archivo.");
        } catch (java.io.IOException e) {
            System.out.println("Ocurrió un error al agregar contenido.");
            e.printStackTrace();
        }

        // 5: Leer nuevamente el archivo para ver los cambios
        try (java.util.Scanner reader = new java.util.Scanner(archivo)) {
            System.out.println("Contenido actualizado del archivo:");
            while (reader.hasNextLine()) {
            String line = reader.nextLine();
            System.out.println(line);
            }
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
            e.printStackTrace();
        }

        // 6: Eliminar el archivo
        if (archivo.delete()) {
            System.out.println("Archivo eliminado: " + archivo.getName());
        } else {
            System.out.println("No se pudo eliminar el archivo.");
        }

        // 7. Verificar si el archivo fue eliminado
        if (!archivo.exists()) {
            System.out.println("El archivo " + archivo.getName() + " ha sido eliminado.");
        } else {
            System.out.println("El archivo " + archivo.getName() + " aún existe.");
        }

               

    }
    
}
