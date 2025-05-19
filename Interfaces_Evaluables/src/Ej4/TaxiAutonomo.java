package Ej4;

public class TaxiAutonomo implements Vehiculo, Electrico, Autonomo {
	private int bateria = 100;
	private boolean modoAutonomo = false;

	@Override
	public void arrancar() {
		System.out.println("El taxi autonomo ha arrancado.");
		bateria -= 50;
	}

	@Override
	public void detener() {
		System.out.println("El taxi autonomo se ha detenido.");
	}

	@Override
	public int capacidadPasajero() {
		return 4;
	}

	@Override
	public void cargarBateria(int porcentaje) {
		bateria = Math.min(100, bateria + porcentaje);
		System.out.println("Bateria del taxi cargada al " + bateria + "%.");
	}

	@Override
	public int nivelBateria() {
		return bateria;
	}

	@Override
	public void activarModoAutonomo() {
		modoAutonomo = true;
		System.out.println("Modo autónomo activado.");
		bateria-=15;
	}

	@Override
	public void desactivarModoAutonomo() {
		modoAutonomo = false;
		System.out.println("Modo autónomo desactivado.");
	}

	@Override
	public boolean enModoAutonomo() {
		return modoAutonomo;
	}
}