package Ejercicios_colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ej1 {
	public static void main(String[] args) {
		int suma = 0;
		int min=0;
		int max=0;
		List<Integer> lista = new ArrayList<Integer>();
		int i ;
		do {
			i = (int) (Math.random() * 20) + 1;
		} while (i<10);
		for (int j = 0; j <= i; j++) {
			int k = (int) (Math.random() * 101) ;
			lista.add(k);
		}
		Iterator<Integer> it = lista.iterator();
		while (it.hasNext()) {
			Integer a = it.next();
			suma+=a;
			if(a<min || min==0) {
				min=a;
			}
			if(a>max || max==0) {
				max=a;
			}
		}
		System.out.println(lista.toString());
		System.out.println("La suma es de: "+suma);
		System.out.println("El numero mas grnade: "+max+" y el numero mas pequeño es: "+min);
		System.out.println("La media es de: "+(suma/i));
	}
}