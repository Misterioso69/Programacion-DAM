package ejercicio3;

public class Enciclopedia extends Libro {
	private int num_volumen;
	
	

	public Enciclopedia(String isbn, String titulo, String autor, int num_paginas, int num_volumen) {
		super(isbn, titulo, autor, num_paginas);
		this.num_volumen = num_volumen;
	}

	@Override
	public double calcularMulta(int dias_retraso, boolean esSocioPre) {
		double multa = 0;
		if (num_volumen<=5 ) {
			multa = dias_retraso * 1;
		}else if ( num_volumen>5 ) {
			multa= dias_retraso*1.5;
		}
		if(esSocioPre) {
			multa= multa*0.5;
		}
		return multa;
	}

	public int getNum_volumen() {
		return num_volumen;
	}

	public void setNum_volumen(int num_volumen) {
		this.num_volumen = num_volumen;
	}

	@Override
	public String toString() {
		super.toString();
		return "Enciclopedia [num_volumen=" + num_volumen + "]";
	}

	public Enciclopedia() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	


	
	
	

}
