package Ej4;

public class AutoElectrico implements Vehiculo, Electrico {
	private int bateria = 100;

	@Override
	public void arrancar() {
		System.out.println("El auto electrico ha arrancado.");
		bateria-=50;
	}

	@Override
	public void detener() {
		System.out.println("El auto electrico se ha detenido.");
	}

	@Override
	public int capacidadPasajero() {
		return 4; 
	}

	@Override
	public void cargarBateria(int porcentaje) {
		bateria = Math.min(100, bateria + porcentaje); 
		System.out.println("Bateria cargada al " + bateria + "%.");
	}

	@Override
	public int nivelBateria() {
		return bateria;
	}
}
