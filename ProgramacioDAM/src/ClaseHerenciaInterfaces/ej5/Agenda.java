package ClaseHerenciaInterfaces.ej5;

import java.util.Arrays;

public class Agenda {
	private Contacto [] listaContacto = new Contacto[10];
	private int cont  = 0;
	public Contacto[] getListaContacto() {
		return listaContacto;
	}
	public void setListaContacto(Contacto[] listaContacto) {
		this.listaContacto = listaContacto;
	}
	public int getCont() {
		return cont;
	}
	public void setCont(int cont) {
		this.cont = cont;
	}
	@Override
	public String toString() {
		return "Agenda [listaContacto=" + Arrays.toString(listaContacto) + ", cont=" + cont + "]";
	}
	public Agenda() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Agenda (Contacto[] listaContacto) {
		this.listaContacto = listaContacto;
	}
	public void agregarContacto (Contacto pepo){
		if (cont < listaContacto.length ) {
			listaContacto[cont]=pepo;
			cont++;
		}else {
			System.out.println("La agenda esta llena ");
		}
	}
	public void buscaContacto (String nombre) {
		boolean vac = false;
		for (int i =0;i<listaContacto.length;i++ ) {
			if(listaContacto[i]!=null && listaContacto[i].getNombre().equals(nombre)) {
				System.out.println(listaContacto[i].getNombre()+" tefl:"+listaContacto[i].getTelf());
				vac=true;
			}
		}
		if(!vac) {
			System.out.println("No esta ese nombre registrado");
		}
	}
	public void mostrarContacto() {
		for(int i = 0;i<listaContacto.length;i++) {
			if(listaContacto[i] ==null) {
				System.out.println("Contacto vacio");
			}else {
			System.out.println(listaContacto[i]);
			}
		}
	}
}

