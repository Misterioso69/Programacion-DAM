package ejercicio1;

import java.util.Objects;

public class Obra  implements Comparable<Obra>{
	private Integer id;
	private String titulo;
	private String autor;
	private String tenica;
	private String fecha_creacion;
	
	public Obra(Integer id, String titulo, String autor, String tenica, String fecha_creacion) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.tenica = tenica;
		this.fecha_creacion = fecha_creacion;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public String getTenica() {
		return tenica;
	}
	public void setTenica(String tenica) {
		this.tenica = tenica;
	}
	public String getFecha_creacion() {
		return fecha_creacion;
	}
	public void setFecha_creacion(String fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}
	@Override
	public String toString() {
		return "Obra [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", tenica=" + tenica + ", fecha_creacion="
				+ fecha_creacion + "]";
	}
	public Obra() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Obra other = (Obra) obj;
		return Objects.equals(id, other.id);
	}
	@Override
	public int compareTo(Obra arg0) {
		return id - arg0.getId();
	}
	
}
