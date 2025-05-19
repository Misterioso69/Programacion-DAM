package usoIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PrincipalNumerosEnteros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce número enteros mayores o igual a 0");
		int num = sc.nextInt();
		List<Integer> listaNumeros = new ArrayList<Integer>();
		while (num >= 0) {
			listaNumeros.add(num);
			System.out.println("Introduce número enteros mayores o igual a 0");
			num = sc.nextInt();

		}
		System.out.println("Lista de números antes de los cambios :" + listaNumeros.toString());
		
		List<Integer> lista_multipo5 = new ArrayList<Integer>();
		Iterator<Integer> i = listaNumeros.iterator();
		while(i.hasNext()) {
			Integer a = i.next();
			if (a%5==0 ) {
				lista_multipo5.add(a);
			}
			if (a%2==0||a%5==0) {
				i.remove();
			}
		}
		System.out.println("Lista de números original:" + listaNumeros.toString());
		System.out.println("Lista de números multipos de 5 :" + lista_multipo5.toString());
		
	}

}
