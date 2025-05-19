package Ejercicios_colecciones_Ej7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Carta> lista = new ArrayList<Carta>();
		String[] palo = { "Oro", "Copa", "Espada", "Bastos" };
		Set<Carta>listaset = new LinkedHashSet<Carta>();
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
		Collections.sort(lista);
		System.out.println(lista.toString());
		Collections.sort(lista,new Mod_valor());
		System.out.println(lista.toString());
	}

}