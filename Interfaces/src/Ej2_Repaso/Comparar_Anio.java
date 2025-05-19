package Ej2_Repaso;

import java.util.Comparator;

public class Comparar_Anio implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		// TODO Auto-generated method stub
		return o2.getAnio_anti() - o1.getAnio_anti();
	}

}
