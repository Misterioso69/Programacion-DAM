package ejercicio1;

import java.util.Comparator;

public class ComparaDNI implements Comparator<Estudiante> {

	@Override
	public int compare(Estudiante arg0, Estudiante arg1) {
		// TODO Auto-generated method stub
		return arg0.getDni().compareTo(arg1.getDni());
	}


}
