package Listas;

/******************************************************************************
Clase principal de una lista de enteros basada en un arreglo
@author Magali
@version 1.0
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		Lista mi_lista;
		try{
	    	mi_lista = new Lista(10);
		}catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
			return; // Salimos si la lista no se pudo crear
		}
		System.out.println(mi_lista.esVacia()); 
		System.out.println(mi_lista.toString());
	    System.out.println(mi_lista.esLlena()); 
		mi_lista.agregarAlFinal(5);
		mi_lista.agregarAlInicio(3);
		mi_lista.agregarEn(1, 4);
		mi_lista.mostrar();
		mi_lista.eliminar(1);
		mi_lista.mostrar();
		System.out.println(mi_lista.toString());
		System.out.println(mi_lista.buscar(5));
		System.out.println(mi_lista.buscar(10));
		try {
			System.out.println(mi_lista.devolver(10));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Error: " + e.getMessage());
		}
		// reemplazamos el valor 3 por 8
		mi_lista.reemplazar(1, 8);
		mi_lista.mostrar();
		
			
	}
}
