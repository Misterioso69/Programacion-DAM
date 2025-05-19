package ejercicio_repaso1;

public class AparcamientoException extends Exception {
    private static final long serialVersionUID = 1L;
	public static String VEHICULO_DENTRO = "El vehículo está en el aparcamiento.";
    public static String VEHICULO_FUERA = "El vehículo no está en el aparcamiento.";
    public static String APARCAMIENTO_LLENO = "El aparcamiento está lleno.";

    public AparcamientoException(String message) {
        super(message);
    }
}