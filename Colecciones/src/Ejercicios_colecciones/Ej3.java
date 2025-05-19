package Ejercicios_colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lista = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		for (int i =0 ; i<10 ;i++) {
			System.out.println("Introduca una frase/palabra");
			String a = sc.nextLine();
			lista.add(a);
		}
		Collections.sort(lista);
		System.out.println(lista.toString());
	}

}
