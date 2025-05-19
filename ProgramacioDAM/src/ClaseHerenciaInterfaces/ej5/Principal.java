package ClaseHerenciaInterfaces.ej5;

public class Principal {
	public static void main (String [] args) {
		Contacto c = new Contacto("Pepe","12345678");
		Contacto c1 = new Contacto("Ana" ,"12345678");
		Contacto c2 = new Contacto ("Maria", "12345678");
		Agenda ag = new Agenda();
		ag.agregarContacto(c);
		ag.agregarContacto(c2);
		ag.mostrarContacto();
		ag.agregarContacto(c1);
		ag.buscaContacto("Pepe");
	}
}
