package Ejercicios_colecciones;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio4_2 {
	public static void main(String[] args) {

		HashMap<String, String> mapa = new HashMap<String, String>();
		mapa.put("Juan", "1234");
		mapa.put("Ana", "abc43");
		mapa.put("Lucia", "contraseña");
		mapa.put("Claudia", "abcd");
		mapa.put("Antonio", "1b3d");

		HashMap<String, String[]> mapaIncorrectas = new HashMap<String, String[]>();
		boolean acertada = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre = sc.next();
		// Compruebo que el nombre existe en el mapa
		if (mapa.containsKey(nombre)) {

			System.out.println("Introduce la contraseña");
			String contrasena = sc.next();
			while (!contrasena.equals("-1") && !acertada) {
				if (contrasena.equals(mapa.get(nombre))) {
					acertada = true;
					System.out.println("Has acertado la clave");
				} else {
					System.out.println("Intentalo de nuevo, -1 para salir");
					// Hay que comprobar si la colección es nula o tiene valores
					if (mapaIncorrectas.containsKey(nombre)) {
						String[] contInc = mapaIncorrectas.get(nombre);
						if (contInc == null) {// Se crea el mapa con la contraseña incorrecta
							String[] lista = new String[1];
							lista[0] = contrasena;
							mapaIncorrectas.put(nombre, lista);
						} else { // Se añade la nueva contraseña incorrecta
							// Se redimensiona el array para añadir la nueva contraseña
							String[] copy = Arrays.copyOf(contInc, contInc.length + 1);
							copy[copy.length - 1] = contrasena;
							contInc = copy;
							mapaIncorrectas.put(nombre, contInc);
						}
					} else {// La primera vez que el usuario falla
						String[] lista = new String[1];
						lista[0] = contrasena;
						mapaIncorrectas.put(nombre, lista);
					}
					System.out.println(Arrays.toString(mapaIncorrectas.get(nombre)));
				}

				System.out.println("Introduce la contraseña");
				contrasena = sc.next();
			}
			// Eliminar alguna contraseña
			System.out.println("¿Quiere eliminar alguna contraseña?");
			String contraEliminar = sc.next();
			if (mapaIncorrectas.containsKey(nombre)) {
				String[] claves = mapaIncorrectas.get(nombre);
				if (claves != null) {
					int pos = Arrays.binarySearch(claves, contraEliminar);
					if (pos >= 0) {
						// Clave encontrada, redimensiono el array
						String[] nuevoArray = new String[claves.length - 1];
						int cont = 0;
						for (int i = 0; i < claves.length; i++) {
							if (i != pos) {
								nuevoArray[cont] = claves[i];
								cont++;
							}
							// Otra forma de eliminar la clave
//							if(!claves[i].equals(contraEliminar)) {
//								nuevoArray[cont] = claves[i];
//								cont++;
//							}
						}
						mapaIncorrectas.put(nombre, nuevoArray);
						System.out.println("Clave eliminada");
						System.out.println(Arrays.toString(mapaIncorrectas.get(nombre)));
					} else {
						System.out.println("La clave no existe");
					}

				}

			}

		} else {
			System.out.println("El usuario no existe en el mapa");
		}
	}
}
