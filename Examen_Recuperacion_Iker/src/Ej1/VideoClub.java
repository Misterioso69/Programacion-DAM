package Ej1;

import java.util.Arrays;

public class VideoClub {
	private int capacidad;
	private Pelicula[] lista_pelicula;
	private Pelicula[] resguardo;
	
	public VideoClub(int capacidad, Pelicula[] lista_pelicula) {
		super();
		this.capacidad = capacidad;
		this.lista_pelicula = lista_pelicula;
		Arrays.copyOf(lista_pelicula, capacidad);
	}

	public VideoClub(int i, Estrenos e1, Clasicas c1) {
		// TODO Auto-generated constructor stub
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public Pelicula[] getLista_pelicula() {
		return lista_pelicula;
	}

	public void setLista_pelicula(Pelicula[] lista_pelicula) {
		this.lista_pelicula = lista_pelicula;
	}

	@Override
	public String toString() {
		return "VideoClub [capacidad=" + capacidad + ", lista_pelicula=" + Arrays.toString(lista_pelicula) + "]";
	}
	
	public void alquilarPelicula ( String codigo) throws VideoClubException {
		boolean esta_alquilada = false;
		for (int i = 0 ; i<lista_pelicula.length;i++) {
			if (lista_pelicula[i].getId().equals(codigo) && false !=lista_pelicula[i].isEstaAlquilada() && lista_pelicula[i] != null ) {
				lista_pelicula[i].setEstaAlquilada(true);
				esta_alquilada = true;
			}
		}
		if (esta_alquilada) {
			Pelicula [] arreglo = new Pelicula [lista_pelicula.length-1];
			int contador = 0;
			for (int j = 0 ; j<lista_pelicula.length;j++) {
				arreglo[contador]= lista_pelicula[j];
				contador++;
			}
			lista_pelicula = arreglo;
			System.out.println("Se ha alquilado la pelicula");
		}else if (!esta_alquilada) {
			throw new VideoClubException(VideoClubException.PELICULA_ALQUILADA);
		}
	}
	public void devolverPelicula (String codigo , int diasRetraso , boolean esMiembroVIP) throws VideoClubException {
		boolean esta_la_pelicula = false;
		double dinero = 0;
		for ( int i = 0 ; i<lista_pelicula.length;i++) {
			if (lista_pelicula[i].getId().equals(codigo) && lista_pelicula[i] != null ) {
				esta_la_pelicula = true;
			}
		}
		
		if (!esta_la_pelicula) {
			if (lista_pelicula.length < capacidad) { 
				Pelicula [] arreglo = new Pelicula [lista_pelicula.length+1];
				for(int i = 0 ; i<lista_pelicula.length;i++) {
					arreglo[i]=lista_pelicula[i];
					if(resguardo[i].getId().equals(codigo)) {
						arreglo[arreglo.length-1]= resguardo[i];
						dinero = resguardo[i].calcularRecargo(diasRetraso, esMiembroVIP);
					}
				}
				lista_pelicula= arreglo;
				System.out.println("Se entrego la pelicula y el precio es de "+dinero);
			}else {
				throw new VideoClubException(VideoClubException.VIDEOTECA_LLENA);
			}
		}else {
			throw new VideoClubException(VideoClubException.PELICULA_DEVUELTA);
		}
	}
	public void consultarDisponibilidad(String codigo) {
		boolean esta_la_pelicula = false;
		for ( int i = 0 ; i<lista_pelicula.length;i++) {
			if (lista_pelicula[i].getId().equals(codigo) && lista_pelicula[i] != null && lista_pelicula[i].isEstaAlquilada()==false ) {
				esta_la_pelicula = true;
			}
		}
		if(esta_la_pelicula) {
			System.out.println("Esta la pelicula disponible");
		}else {
			System.out.println("No se encuentra la pelicula");
		}
	}
}
