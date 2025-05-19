package Ej2_Repaso;

import java.util.Comparator;

public class Comparar_Plazas  implements Comparator<Vehiculo>{
	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		// TODO Auto-generated method stub
		int resultado = o1.getNum_plazas() - o2.getNum_plazas();
		if (resultado==0) {
			return o1.getMatricula().compareTo(o2.getMatricula());
		}
		return resultado;
	}
	

}
