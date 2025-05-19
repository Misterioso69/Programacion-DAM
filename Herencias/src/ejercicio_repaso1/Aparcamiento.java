package ejercicio_repaso1;

public class Aparcamiento {
    private Vehiculo[] vehiculos;
    private int capacidad;
    private int cantidadVehiculos;

    public Aparcamiento(int capacidad) {
        this.capacidad = capacidad;
        this.vehiculos = new Vehiculo[capacidad]; // Usamos un array para los vehículos
        this.cantidadVehiculos = 0; // Inicializamos con cero vehículos
    }

    public void introducirVehiculo(Vehiculo v) throws AparcamientoException {
        if (cantidadVehiculos >= capacidad) {
            throw new AparcamientoException(AparcamientoException.APARCAMIENTO_LLENO);
        }

        for (int i = 0; i < cantidadVehiculos; i++) {
            if (vehiculos[i].getMatricula().equals(v.getMatricula())) {
                throw new AparcamientoException(AparcamientoException.VEHICULO_DENTRO);
            }
        }

        // Añadimos el vehículo al array
        vehiculos[cantidadVehiculos] = v;
        cantidadVehiculos++;
    }

    public void sacarVehiculo(String matricula) throws AparcamientoException {
        Vehiculo vehiculoASacar = null;
        int indexVehiculoASacar = -1;

        for (int i = 0; i < cantidadVehiculos; i++) {
            if (vehiculos[i].getMatricula().equals(matricula)) {
                vehiculoASacar = vehiculos[i];
                indexVehiculoASacar = i;
                break;
            }
        }

        if (vehiculoASacar == null) {
            throw new AparcamientoException(AparcamientoException.VEHICULO_FUERA);
        }

        double importe = vehiculoASacar.calcularImporte();
        System.out.println("Importe a pagar por el vehículo " + matricula + ": " + importe + "€");

        // Desplazamos los vehículos para eliminar el vehículo sacado
        for (int i = indexVehiculoASacar; i < cantidadVehiculos - 1; i++) {
            vehiculos[i] = vehiculos[i + 1];
        }
        
        vehiculos[cantidadVehiculos - 1] = null; // Limpiamos el último puesto
        cantidadVehiculos--;
        capacidad++;
    }

    public int getCapacidad() {
        return capacidad;
    }
}