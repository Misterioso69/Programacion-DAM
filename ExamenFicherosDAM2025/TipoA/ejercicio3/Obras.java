package ejercicio3;

public class Obras {
 private String titulo;
 private String autor;
 private String anio;
public Obras(String titulo, String autor, String anio) {
	super();
	this.titulo = titulo;
	this.autor = autor;
	this.anio = anio;
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
public String getAnio() {
	return anio;
}
public void setAnio(String anio) {
	this.anio = anio;
}
public Obras() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Obras [titulo=" + titulo + ", autor=" + autor + ", anio=" + anio + "]";
}
 
}
