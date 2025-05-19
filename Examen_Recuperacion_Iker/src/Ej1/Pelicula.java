package Ej1;

public abstract class Pelicula {
	private String id;
	private String titulo;
	private String autor;
	private int duracion_min;
	private boolean estaAlquilada = false;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getDuracion_min() {
		return duracion_min;
	}
	public void setDuracion_min(int duracion_min) {
		this.duracion_min = duracion_min;
	}
	public boolean isEstaAlquilada() {
		return estaAlquilada;
	}
	public void setEstaAlquilada(boolean estaAlquilada) {
		this.estaAlquilada = estaAlquilada;
	}
	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", duracion_min=" + duracion_min
				+ ", estaAlquilada=" + estaAlquilada + "]";
	}
	public Pelicula() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Pelicula(String id, String titulo, String autor, int duracion_min, boolean estaAlquilada) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.duracion_min = duracion_min;
		this.estaAlquilada = estaAlquilada;
	}
	public abstract double calcularRecargo(int diasRetraso , boolean esVIP);
	
	
	
}
