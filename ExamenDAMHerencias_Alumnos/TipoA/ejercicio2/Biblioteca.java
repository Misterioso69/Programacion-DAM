package ejercicio2;

import java.util.Arrays;
import java.util.Iterator;

public class Biblioteca {
	private int cantidad_maxima;
	private Libro [] lista_libros ;
	
	public Biblioteca(int cantidad_maxima ) {
		super();
		this.cantidad_maxima = cantidad_maxima;
		this.lista_libros =  new Libro [0];
	}
	public int getCantidad_maxima() {
		return cantidad_maxima;
	}
	public void setCantidad_maxima(int cantidad_maxima) {
		this.cantidad_maxima = cantidad_maxima;
	}
	@Override
	public String toString() {
		return "Biblioteca [lista_libros=" + Arrays.toString(lista_libros) + ", cantidad_maxima=" + cantidad_maxima
				+ "]";
	}
	public Biblioteca() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void agregarLibro (Libro a) {
		Libro [] arreglo = new Libro[lista_libros.length+1];
		for ( int i = 0 ; i<lista_libros.length ;i ++) {
			arreglo[i]=lista_libros[i];
		}
		lista_libros=arreglo;
		if ( lista_libros.length < cantidad_maxima) {
			lista_libros[lista_libros.length-1]=a;
		}else {
			System.out.println("La bibloteca esta llena ");
		}
	}
	
	public void prestarLibro (String a) {
		boolean prestado = true;
		for ( int i = 0 ; i<lista_libros.length ; i ++) {
			if (lista_libros[i].getIsbn()==a) {
				prestado= false;
				lista_libros[i].setEsta_perstado(true);
				
			}
		}
		Libro [] arreglo = new Libro[lista_libros.length-1];
		int con = 0;
		for ( int j = 0 ; j<lista_libros.length ;j ++) {
			if (lista_libros[j].getIsbn()!=a) {
				arreglo[con]=lista_libros[j];
				con++;
			}
		}
		lista_libros=arreglo;
		if (!prestado) {
			System.out.println("Se ha presto el libro ");
		}else {
			System.out.println("El libro ya estaba prestado");
		}
	}
	
	public void devolverLibro ( Libro a , int cant_dias_retaso , boolean socio) {
		boolean entrega = false;
		for ( int i = 0 ; i<lista_libros.length;i++) {
			if(lista_libros[i].getIsbn() !=a.getIsbn()) {
				entrega = true;
				if (cant_dias_retaso>0) {
					double din =a.calcularMulta(cant_dias_retaso, socio);
					System.out.println("Se entrego con retraso y hay que pagar: "+din);
				}else {
					System.out.println("Se entrego el libro , Muchas gracias :)");
				}
				agregarLibro(a);
			}
		}
		if(!entrega) {
			System.out.println("No se encontro el libro");
		}
	}
}
