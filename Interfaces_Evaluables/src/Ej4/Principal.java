package Ej4;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicicleta b = new Bicicleta();
		AutoElectrico a = new AutoElectrico();
		TaxiAutonomo t = new TaxiAutonomo();

		System.out.println("Bicleta");
		b.arrancar();
		b.detener();
		System.out.println(b.capacidadPasajero() + "\n");

		System.out.println("AutoElectrico");
		a.arrancar();
		a.detener();
		System.out.println(a.capacidadPasajero());
		a.cargarBateria(0);
		System.out.println(a.nivelBateria() + "\n");

		System.out.println("TaxiAutonomo");
		t.arrancar();
		t.detener();
		System.out.println(t.capacidadPasajero());
		t.cargarBateria(5);
		System.out.println(t.nivelBateria());
		t.activarModoAutonomo();
		t.desactivarModoAutonomo();
		t.enModoAutonomo();

		System.out.println("\nVerificación de interfaces:");
		System.out.println(b instanceof Vehiculo);
		System.out.println(a instanceof Vehiculo);
		System.out.println(a instanceof Electrico);
		System.out.println(t instanceof Vehiculo);
		System.out.println(t instanceof Electrico);
		System.out.println(t instanceof Autonomo);

	}

}
