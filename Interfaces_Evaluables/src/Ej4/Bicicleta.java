package Ej4;

public class Bicicleta implements Vehiculo {
	@Override
    public void arrancar() {
        System.out.println("La bicicleta ha comenzado a moverse.");
    }

    @Override
    public void detener() {
        System.out.println("La bicicleta se ha detenido.");
    }

    @Override
    public int capacidadPasajero() {
        return 1;
    }
}
