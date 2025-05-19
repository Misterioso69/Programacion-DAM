package ClaseHerenciaInterfaces.ej7;

public class Principal {
	public static void main (String[] args) {
		Producto p = new Producto("milanesa",5.5,10);
		Producto p2 = new Producto("torta",2.5,10);
		Producto p3 = new Producto("chocolate",2,10);
		Producto p4 = new Producto("maiz",1.25,10);
		Producto p5 = new Producto("legia",6,10);
		Tienda t = new Tienda();
		t.agrePro(p);
		t.agrePro(p2);
		t.agrePro(p3);
		t.agrePro(p4);
		t.agrePro(p5);
		t.agrePro(p5);
		t.buscarPro("milanesa");
		t.venderPro(5, "torta");
		t.infoPro();
	}
}
