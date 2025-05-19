package ClaseHerenciaInterfaces.ej3;

public class Principal {
	public static void main (String[] args) {
        Persona persona = new Persona("Juan Pérez", 25);
        Coche coche = new Coche("Toyota", "Corolla", persona);
        coche.InfoCoche();
        coche.verificarMayorEdad();
	}
}
