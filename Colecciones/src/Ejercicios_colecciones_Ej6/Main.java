package Ejercicios_colecciones_Ej6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Carta> lista = new ArrayList<Carta>();
		String[] palo = { "Oro", "Copa", "Espada", "Bastos" };
		while (lista.size() < 11) {
			int lo = (int) (Math.random() * 4);
			int valor = (int) (Math.random() * 12)+1;
			String pa = palo[lo];
			Carta a =  new Carta(valor,palo[lo] );
			if (lista.isEmpty()) {
				lista.add(a);
			} else {
				Iterator<Carta> i = lista.iterator();
				boolean Noesta = false;
				while (i.hasNext()) {
					Carta b = i.next();
					if(pa.equals(b.getPalo()) && valor ==b.getValor() ) {
						Noesta = true;
					}
				}
				if (!Noesta ) {
					lista.add(a);
				}
			}
		}
		System.out.println(lista.toString());
	}

}
