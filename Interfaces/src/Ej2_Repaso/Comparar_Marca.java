package Ej2_Repaso;

import java.util.Comparator;

public class Comparar_Marca implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		// TODO Auto-generated method stub
		int resultado = o1.getMarca().compareTo(o2.getMarca());
		if (resultado==0) {
			return o1.getAnio_anti() - o2.getAnio_anti();
		}
		return resultado;
	}

}
