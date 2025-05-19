package ejercicio2;

public class Novela extends Libro {
	private Tipo_Novela Tipo_novela;
	
	public enum Tipo_Novela {
		ficcion , historica , misterio
	}

	public Novela(String isbn, String titulo, String autor, int num_paginas,
			Tipo_Novela tipo_novela) {
		super(isbn, titulo, autor, num_paginas);
		Tipo_novela = tipo_novela;
	}

	@Override
	public double calcularMulta(int dias_retraso, boolean esSocioPre) {
		double multa = 0 ;
		switch (Tipo_novela) {
			case ficcion : multa = dias_retraso*0.5;  
			break;
			case historica : multa = dias_retraso*0.7;
			break;
			case misterio : multa = dias_retraso*0.6;
			break;
		}
		if(esSocioPre) {
			multa = multa *0.5;
		}
		return multa;
	}

	public Tipo_Novela getTipo_novela() {
		return Tipo_novela;
	}

	public void setTipo_novela(Tipo_Novela tipo_novela) {
		Tipo_novela = tipo_novela;
	}

	@Override
	public String toString() {
		super.toString();
		return "Novela [Tipo_novela=" + Tipo_novela + "]";
	}

	public Novela() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

	
	

}
