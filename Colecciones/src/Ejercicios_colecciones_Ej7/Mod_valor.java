package Ejercicios_colecciones_Ej7;

import java.util.Comparator;

public class Mod_valor  implements Comparator<Carta>{

	@Override
	public int compare(Carta o1, Carta o2) {
		// TODO Auto-generated method stub
		return o1.getValor()-o2.getValor();
	}

}
