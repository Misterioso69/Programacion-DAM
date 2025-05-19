package Ejercicios_colecciones_Ej5;

import java.util.ArrayList;
import java.util.List;

public class Eurocoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] valores = {"1 centimo","2 centimos" ,"5 centimos","10 centimos","20 centimos","50 centimos","1 euro","2 euros"};
		String [] posiciones = {"cara","cruz"};
		List<Moneda> mon =  new ArrayList<Moneda>();
		int cont = 0;
		int lor=-1;
		int cion = -1;
		while(cont < 6) {
			int va = (int) (Math.random()*9);
			int posi = (int) (Math.random()*2);
			if (va == lor || posi == cion || lor==-1 || cion==-1  ) {
				Moneda a = new Moneda (null, null);
				a.setPosicione(posiciones[posi]);
				a.setValor(valores[va]);
				mon.add(a);
				cont++;
				lor = va;
				cion = posi;
			}
		}
		System.out.println(mon.toString());
	}
}
