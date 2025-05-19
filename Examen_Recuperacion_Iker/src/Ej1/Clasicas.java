package Ej1;

public class Clasicas extends Pelicula{
	private int anio_lanzamineto;

	public Clasicas(String id, String titulo, String autor, int duracion_min, boolean estaAlquilada,
			int anio_lanzamineto) {
		super(id, titulo, autor, duracion_min, estaAlquilada);
		this.anio_lanzamineto = anio_lanzamineto;
	}

	public int getAnio_lanzamineto() {
		return anio_lanzamineto;
	}

	public void setAnio_lanzamineto(int anio_lanzamineto) {
		this.anio_lanzamineto = anio_lanzamineto;
	}

	@Override
	public String toString() {
		return "Clasicas [anio_lanzamineto=" + anio_lanzamineto + "]";
	}

	@Override
	public double calcularRecargo(int diasRetraso, boolean esVIP) {
		// TODO Auto-generated method stub
		double recargo =0;
		if(anio_lanzamineto>= 1980) {
			recargo = diasRetraso*0.8;
		}else if (anio_lanzamineto < 1980) {
			recargo = diasRetraso*0.5;
		}
		if(esVIP) {
			recargo = recargo * 0.5;
		}
		return recargo;
	}
	
	
}
