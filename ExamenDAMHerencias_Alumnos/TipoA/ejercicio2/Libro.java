package ejercicio2;

public abstract class Libro {
	private String isbn;
	private String titulo;
	private String autor;
	private int num_paginas;
	private boolean esta_perstado = false;
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNum_paginas() {
		return num_paginas;
	}
	public void setNum_paginas(int num_paginas) {
		this.num_paginas = num_paginas;
	}
	public boolean isEsta_perstado() {
		return esta_perstado;
	}
	public void setEsta_perstado(boolean esta_perstado) {
		this.esta_perstado = esta_perstado;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Libro(String isbn, String titulo, String autor, int num_paginas) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.num_paginas = num_paginas;
	}
	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", num_paginas=" + num_paginas
				+ ", esta_perstado=" + esta_perstado + "]";
	}
	public abstract double calcularMulta (int dias_retraso , boolean esSocioPre);
}
