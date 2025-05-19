package ejercicio_repaso1;

public class Automovil extends Vehiculo {
	
	protected TipoAutomovil  TipoAutomovil; 
	
	public Automovil(String matricula, int minutos, boolean abono, TipoAutomovil TipoAutomovil) {
		super(matricula, minutos, abono);
		this.TipoAutomovil = TipoAutomovil;
	}

	@Override
    public double calcularImporte() {
        double tarifaPorMinuto = 0;

        switch (TipoAutomovil) {
            case Turismo:
                tarifaPorMinuto = 1.5 / 60;
                break;
            case Todoterreno:
                tarifaPorMinuto = 2.5 / 60;
                break;
            case Furgoneta:
                tarifaPorMinuto = 3.5 / 60;
                break;
        }

        double importe = getMinutos() * tarifaPorMinuto;

        if (abono) {
            importe *= 0.6; // Descuento del 40%
        }

        return importe;
    }
}