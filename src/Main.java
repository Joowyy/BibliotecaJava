import java.util.Scanner;

import Gestion.Biblioteca;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		Biblioteca biblioJowy = Biblioteca.crearBiblioteca();
		char opc;

		do {
			
			System.out.println("BIENVENIDO A BIBLIOTECA JOWY'S\n1. Añadir prestamo\n2. Borrar prestamo\n3. Ver prestamos\n4. \n5. Salir");
			switch (opc = sc.nextLine().charAt(0)) {
			case '1':
				
				biblioJowy.añadirPrestamo();
				break;
				
			case '2':
				
				break;
				
			case '3':
				
				break;
				
			case '4':
				
				break;
				
			case '5':
				
				System.out.println("Saliendo del programa...");
				break;
				
			default:
				
				System.out.println("Introduce un numero valido\n");
			
			}
			
		} while (opc != '5');
		
	}

}
