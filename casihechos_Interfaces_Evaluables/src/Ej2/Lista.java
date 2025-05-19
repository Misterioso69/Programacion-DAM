package Ej2;

import java.util.Arrays;

public class Lista {
	protected  int [] numero;

	public Lista(int[] numero) {
		super();
		this.numero = new int [0];
	}

	public Lista() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int num_elementos () {
		return numero.length;
	}
	public void insetnum_final (int num) {
		numero = Arrays.copyOf(numero, numero.length+1);
		numero[numero.length-1]=num;
	}
	public void insertnum_principio(int num) {
		numero = Arrays.copyOf(numero, numero.length+1);
		for(int i = numero.length-2 ; i>=0;i-- ) {
			numero[i+1]=numero[i];
		}
		numero[0]=num;
	}
	public void insertnum_indice (int ind , int num) {
		int[] arreglo = Arrays.copyOf(numero, numero.length+1);
		if (ind < arreglo.length) {
		    arreglo[ind]=num;
		    numero = arreglo;
		} else {
		    System.out.println("Tamanio del array menor a indice");
		}
	}
	
	public void añadir_lista (int [] a ) {
		int b =  numero.length;
		numero =  Arrays.copyOf(numero, numero.length+a.length);
		int cont = 0;
		for (int i = b ; i< numero.length;i++) {
			numero[i]=a[cont];
			cont++;
		}
	}
	public void eliminarnum_indice (int ind) {
		if(ind>=0 && ind<numero.length) {
			int [] arreglo = Arrays.copyOf(numero, numero.length-1);
			int cont = 0;
			for(int i = 0 ;i< numero.length;i++) {
				if(numero[i]!=numero[ind]) {
					arreglo[cont]=numero[i];
				}
			}
			numero=arreglo;
		}else {
			System.out.println("Error");
		}
	}
	public int obtenernum_indice (int ind) {
		if(ind>=0 && ind < numero.length) {
			return numero[ind];
		}else {
			return -1;
		}
	}
	public int obtenerposicion_num (int num) {
		for (int i = 0; i < numero.length; i++) {
			if (numero[i] == num) {
				return i; 
	       }
	     }
		 return -1;
	}
	public void mostrarInfo () {
		System.out.println(numero);
	}
	
}
