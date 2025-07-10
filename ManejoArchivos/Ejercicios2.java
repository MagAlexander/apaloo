package ManejoArchivos;
//Ejemplos y ejercicios de manejo de archivos en Java: Creación y eliminación de archivos y carpetas.

import java.io.File;    // Importamos solo la clase File para manejar archivos y directorios
import java.io.IOException; // Importamos IOException para manejar errores de entrada/salida
import java.text.SimpleDateFormat; // Importamos SimpleDateFormat para formatear fechas
import java.util.Date; // Importamos Date para manejar fechas

public class Ejercicios2 {

    public static void main(String[] args) {
        try {
            // Hacer: Define la ruta del directorio y del archivo
        String nombreCarpeta = "mis_archivos";
        String nombreArchivo = "datos.txt";

            // mkdirs() (crear carpeta "mis_archivos")
            File carpeta = new File(nombreCarpeta);
            if (carpeta.mkdirs()) {
                System.out.println("Carpeta creada: " + carpeta.getAbsolutePath());
            } else {
                System.out.println("La carpeta ya existe o no se pudo crear.");
            }
            
            // Creamos el objeto File
            File archivo = new File(nombreCarpeta, nombreArchivo);  // De esta manera indicamos carpeta + archivo: "mis_archivos/datos.txt"

            // createNewFile()
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }

            // exists()
            System.out.println("¿Existe? " + archivo.exists());

            // canWrite(), canRead()
            System.out.println("¿Se puede escribir? " + archivo.canWrite());
            System.out.println("¿Se puede leer? " + archivo.canRead());

            // isFile(), isDirectory()
            System.out.println("¿Es un archivo? " + archivo.isFile());
            System.out.println("¿Es un directorio? " + archivo.isDirectory());

            // getName(), getPath(), getAbsolutePath(), getParent()
            System.out.println("Nombre: " + archivo.getName());
            System.out.println("Ruta relativa: " + archivo.getPath());
            System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());
            System.out.println("Carpeta contenedora: " + archivo.getParent());

            // lastModified()
            long ultimaMod = archivo.lastModified();
            String fechaMod = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date(ultimaMod));
            System.out.println("Última modificación: " + fechaMod);

            // length()
            System.out.println("Tamaño (bytes): " + archivo.length());

            // EJERCICIO EXTRA 1:
            // Crea 3 archivos distintos en la carpeta "mi_archivos" llamados datos1.txt, datos2.txt y datos3.txt
            // Crea objetos File para cada uno y usa createNewFile() como en el ejemplo anterior,
            // agregales distinto contenido y ve como cambian algunas de las propiedades del archivo.




            //============================================================================================

            // mkdirs() (crear carpeta "mis_archivos/nueva_carpeta")
            File nuevaCarpeta = new File(archivo.getParentFile(), "nueva_carpeta");
            if (nuevaCarpeta.mkdirs()) {
                System.out.println("Carpeta creada: " + nuevaCarpeta.getAbsolutePath());
            } else {
                System.out.println("La carpeta ya existe o no se pudo crear.");
            }

            // renameTo() (renombrar archivo)
            File archivoRenombrado = new File(nuevaCarpeta, "archivo_renombrado.txt");
            if (archivo.renameTo(archivoRenombrado)) {
                System.out.println("Archivo renombrado correctamente.");
                archivo = archivoRenombrado; // actualizamos referencia
            } else {
                System.out.println("No se pudo renombrar el archivo.");
            }

            // listFiles() (listar archivos de la carpeta "mi_directorio")
            File carpeta = new File("mis_archivos");
            File[] archivos = carpeta.listFiles();
            if (archivos != null) {
                System.out.println("Archivos en " + carpeta.getPath() + ":");
                for (File f : archivos) {
                    System.out.println("- " + f.getName());
                }
            }

            // delete() (eliminamos el archivo renombrado)
            if (archivo.delete()) {
                System.out.println("Archivo eliminado: " + archivo.getName());
            } else {
                System.out.println("No se pudo eliminar el archivo.");
            }

            // EJERCICIO EXTRA 2:
            // Crea una subcarpeta dentro de "mis_archivos" llamada "subcarpeta"
            // Luego, crea un archivo llamado "info.txt" dentro de esa subcarpeta



            // EJERCICIO EXTRA 3:
            // Verifica si el archivo tiene extensión ".txt"
            // Puedes usar archivo.getName().endsWith(".txt")


            //============================================================================================
            // Ejemplo extra más avanzado 
            // Mostrar solo los archivos que terminan con ".txt" en la carpeta "mis_archivos"
            // Usamos listFiles y luego revisamos el nombre de cada archivo

            File carpetaFiltrada = new File("mis_archivos");
            File[] archivosFiltrados = carpetaFiltrada.listFiles();

            System.out.println("Mostrando solo archivos .txt:");
            if (archivosFiltrados != null) {
                for (File f : archivosFiltrados) {
                    // Aquí filtramos usando if
                    if (f.getName().endsWith(".txt")) {
                        System.out.println("- " + f.getName());
                    }
                }
            } else {
                System.out.println("No se pudo leer la carpeta.");
            }

        } catch (SecurityException e) {
            System.out.println("Permiso denegado: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Error al acceder a la carpeta o archivo: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error en manejo de archivos: " + e.getMessage());
        }
    }
}

