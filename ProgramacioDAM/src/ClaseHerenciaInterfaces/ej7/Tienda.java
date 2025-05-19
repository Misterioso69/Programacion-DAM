package ClaseHerenciaInterfaces.ej7;

import java.util.Arrays;

public class Tienda {
	private Producto [] almacen = new Producto[5];
	private int cont =0;
	public Producto[] getAlmacen() {
		return almacen;
	}
	public void setAlmacen(Producto[] almacen) {
		this.almacen = almacen;
	}
	@Override
	public String toString() {
		return "Tienda [almacen=" + Arrays.toString(almacen) + "]";
	}
	public Tienda() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tienda(Producto[] almacen){
		this.almacen = almacen;
	}
	public void agrePro (Producto a) {
		if(cont<almacen.length) {
			almacen[cont]=a;
			cont++;
		}else {
			System.out.println("La tienda esta llena ");
		}
	}
	public void buscarPro(String nombre) {
		boolean res= false ;
		for(int i = 0 ;i<almacen.length;i++) {
			if(almacen[i].getNombre()!=null && almacen[i].getNombre()== nombre ) {
				res = true;
				System.out.println("Su precio es: "+almacen[i].getPrecio()+" y la cantidad es: "+almacen[i].getCant());
			}
		}
		if (!res) {
			System.out.println("No existe el producto");
		}
		
	}
	public void venderPro (int canti, String nombre) {
		boolean res= false ;
		for(int i = 0 ;i<almacen.length;i++) {
			if(almacen[i].getNombre()!=null && almacen[i].getNombre()== nombre ) {
				res = true;
				almacen[i].setCant(almacen[i].getCant()-canti);
			}
		}
		if (!res) {
			System.out.println("No existe el producto");
		}
	}
	public void infoPro () {
		for (int i = 0 ; i<almacen.length;i++) {
			System.out.println("Producto "+almacen[i].getNombre()+" y el precio: "+almacen[i].getPrecio()+" y la cantidad: "+almacen[i].getCant());
		}
	}
}
