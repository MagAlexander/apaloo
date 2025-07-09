package ManejoArchivos;
import java.io.File;

/**
 * Clase Ejemplo1, uso de la calse File para manejar archivos en Java
 * 
 * @author Magali
 * @version 1.0
 */
public class Ejemplo1 {
    public static void main(String args[]) {
        String fileName = "Ejemplo.txt";
        File archivo = new File(fileName);
        // Verificar si el archivo existe
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

    }
}