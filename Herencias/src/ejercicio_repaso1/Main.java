package ejercicio_repaso1;

public class Main {
    public static void main(String[] args) {
        try {
            Aparcamiento aparcamiento = new Aparcamiento(2);

            // Crear vehículos
            Automovil a1 = new Automovil("123ABC", 120, false, TipoAutomovil.Turismo);
            Camion c1 = new Camion("456DEF", 180, true, 4);

            // Introducir vehículos
            aparcamiento.introducirVehiculo(a1);
            aparcamiento.introducirVehiculo(c1);

            // Sacar vehículos
            aparcamiento.sacarVehiculo("123ABC");
            aparcamiento.sacarVehiculo("456DEF");

        } catch (AparcamientoException e) {
            System.out.println(e.getMessage());
        }
    }
}