package ManejoArchivos;
import java.io.File;

public class Ejemplo3 {
    public static void main(String[] args) {
        // Manejo de carpetas en Java
        System.out.println("\nManejo de carpetas en Java");

        // 1. Creación de carpetas
        String dirName = "mi_carpeta";
        File dir = new File(dirName);
        if (dir.mkdir()) {
            System.out.println("Carpeta creada: " + dir.getName());
        } else {
            System.out.println("La carpeta ya existe.");
        }

        // 2. Verificar si la carpeta existe
        if (dir.exists()) {
            System.out.println("La carpeta " + dir.getName() + " existe.");
        } else {
            System.out.println("La carpeta " + dir.getName() + " no existe.");
        }

        // 3. Listar archivos en la carpeta
        String[] listaArchivos = dir.list();
        if (listaArchivos != null && listaArchivos.length > 0) {
            System.out.println("Archivos en la carpeta " + dir.getName() + ":");
            for (String archivo : listaArchivos) {
                System.out.println("- " + archivo);
            }
        } else {
            System.out.println("La carpeta " + dir.getName() + " está vacía.");
        }

        // 4. Eliminar la carpeta
        if (dir.delete()) {
            System.out.println("Carpeta eliminada: " + dir.getName());
        } else {
            System.out.println("No se pudo eliminar la carpeta.");
        }

        // 5. Verificar si la carpeta fue eliminada
        if (!dir.exists()) {    
            System.out.println("La carpeta " + dir.getName() + " ha sido eliminada.");
        } else {
            System.out.println("La carpeta " + dir.getName() + " aún existe.");
        }
    }
}
