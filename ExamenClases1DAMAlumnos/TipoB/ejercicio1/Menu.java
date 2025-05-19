package ejercicio1;

import java.util.Arrays;

public class Menu {
	private Plato [] lista = new  Plato [1];
	private int cont = 0 ;
	
	public void  anadirPlato ( Plato a ) {
		if (cont >= lista.length) {
			Plato [] arreglo = new Plato [lista.length+1];
			for(int i = 0 ; i<lista.length;i++) {
				arreglo [i]= lista[i];
			}
			lista= arreglo;
		}
		lista[cont]= a;
		cont++;	
	}
	public String[] generarPlatosAleatorios (int cant) {
		String[] res = new String [cant];
		if ( cant > lista.length) {
			for (int i = 0 ; i<lista.length;i++) {
				res[i]= lista[i].getNombre();
			}
			System.out.println("No hay suficienetes platos");
		}else {
			for (int i = 0 ; i<=cant ;i++) {
				int num = (int) (Math.random()*lista.length);
				res[i]=lista[num].getNombre();
			}
		}
		 return res;	
	}
	
	public Plato[] getLista() {
		return lista;
	}
	public void setLista(Plato[] lista) {
		this.lista = lista;
	}
	public int getCont() {
		return cont;
	}
	public void setCont(int cont) {
		this.cont = cont;
	}
	@Override
	public String toString() {
		return "Menu [lista=" + Arrays.toString(lista) + ", cont=" + cont + "]";
	}
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
