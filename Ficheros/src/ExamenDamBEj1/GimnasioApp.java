package ExamenDamBEj1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GimnasioApp {
	private static final String nombre_archivo = "/home/ikercruz/Escritorio/programacion/Ficheros/src/ExamenDamBEj1/usuarios.txt";
	private static Scanner sc = new Scanner(System.in);
	private static List<Usuario> usuario = new ArrayList<Usuario>();

	public static void main(String[] args) {
		cargarUsuarios();
		int opcion;
		do {
			mostrarMenu();
			opcion = sc.nextInt();
			sc.nextLine(); // Limpiar el buffer

			switch (opcion) {
			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				System.out.println("Saliendo del sistema...");
				break;
			default:
				System.out.println("Opción no válida. Intente nuevamente.");
			}
		} while (opcion != 4);
	}

	private static void mostrarMenu() {
		System.out.println("\n--- MENÚ GIMNASIO ---");
		System.out.println("1. Alta usuario");
		System.out.println("2. Baja usuario");
		System.out.println("3. Listar usuarios");
		System.out.println("4. Salir");
		System.out.print("Seleccione una opción: ");
	}
	private static void cargarUsuarios() {
		try(BufferedReader br = new BufferedReader(new FileReader(nombre_archivo))){
			String linea = br.readLine();
			while ( linea != null) {
				String [] datos =  linea.split(",");
				if ( datos.length == 4) {
					
				}
			}
		} catch (IOException e) {
			System.out.println("No se encontró el archivo de usuarios. Se creará uno nuevo al salir.");
		}
	}
}
