package Ejercicios_colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lista = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		for (int j = 0; j < 10; j++) {
			System.out.println("Añade numero a la lista");
			int i = sc.nextInt();
			lista.add(i);
		}
		Collections.sort(lista);
		System.out.println(lista.toString());
	}

}
