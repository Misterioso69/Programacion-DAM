package ejercicio_repaso1;

public class Camion extends Vehiculo {
    private int numeroEjes;
    private int num=3;

    public Camion(String matricula, int minutosAparcado, boolean tieneAbono, int numeroEjes) {
        super(matricula, minutosAparcado, tieneAbono);
        this.numeroEjes = numeroEjes;
    }

    @Override
    public double calcularImporte() {
        double tarifaPorMinuto = (numeroEjes <= 3) ? 4.5 / 60 : 6.5 / 60;

        double importe = getMinutos() * tarifaPorMinuto;

        if (abono) {
            importe *= 0.6; // Descuento del 40%
        }

        return importe;
    }
}