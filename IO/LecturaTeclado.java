import java.util.Scanner;

/**
 * Programa auxiliar para aprender a leer datos desde teclado.
 * Muestra cómo leer opciones numéricas y cadenas de texto.
 */
public class LecturaTeclado {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){ // Objeto para leer desde teclado
            // Variable para almacenar la opción del usuario
            // Inicializamos con un valor que no sea 0 para entrar al menú
            int opcion = -1;
            System.out.println("Bienvenido al programa de ejemplo de lectura desde teclado.");
            // Repetimos el menú hasta que el usuario elija salir (opción 0)
            while (opcion != 0) {
                System.out.println("\nMenú:");
                System.out.println("1. Escribir una tarea");
                System.out.println("2. Mostrar mensaje fijo");
                System.out.println("0. Salir");
                System.out.print("Elige una opción: ");
                
                opcion = sc.nextInt();  // Lee un número entero
                sc.nextLine();  // Limpiar el buffer del salto de línea
                
                switch (opcion) {
                    case 1:
                        System.out.print("Escribe el nombre de la tarea: ");
                        String tarea = sc.nextLine();  // Lee una línea completa
                        System.out.println("Tarea recibida: " + tarea);
                        break;
                    case 2:
                        System.out.println("¡Hola! Esta es una prueba de menú.");
                        break;
                    case 0:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intenta de nuevo.");
                }
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        } finally {
            // Cerramos el Scanner si es necesario
            // En este caso, el Scanner se cierra automáticamente al salir del bloque try-with-resources
            // No es necesario cerrarlo manualmente
            System.out.println("Programa finalizado.");
        }
    }
}
