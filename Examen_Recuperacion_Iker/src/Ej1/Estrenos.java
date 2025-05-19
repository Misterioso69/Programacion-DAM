package Ej1;

public class Estrenos  extends Pelicula {
	public enum Genero{
		accion , comedia ,drama
	}
	private Genero genero;
	
	public Estrenos(String id, String titulo, String autor, int duracion_min, boolean estaAlquilada, Genero genero) {
		super(id, titulo, autor, duracion_min, estaAlquilada);
		this.genero = genero;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Estrenos [genero=" + genero + "]";
	}

	public Estrenos() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularRecargo(int diasRetraso, boolean esVIP) {
		// TODO Auto-generated method stub
		double recargo = 0;
		switch (genero) {
		case accion : recargo = diasRetraso* 1.5;
		break;
		case comedia : recargo = diasRetraso*1.2;
		break;
		case drama : recargo = diasRetraso*1;
		}
		if (esVIP) {
			recargo = recargo * 0.5;
		}
		return recargo;
	}
}
