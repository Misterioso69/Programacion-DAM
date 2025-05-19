package ClaseHerenciaInterfaces.ej4;

public class Principal {
	public static void main (String[] args) {
		Ecuacion ecuacion = new Ecuacion(1,-2,1);
		ecuacion.infoEcuacion();
		Ecuacion ecuacion2 = new Ecuacion(1,0,-6);
		ecuacion2.infoEcuacion();
		Ecuacion ecuacion3 = new Ecuacion(2,1,6);
		ecuacion3.infoEcuacion();
	}

}
