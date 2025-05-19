package Ej1;

import java.util.Objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement (name="Obra_de_arte")
@XmlType (propOrder = {"titulo","autor","tecnica","fecha"})
@XmlAccessorType (XmlAccessType.FIELD)
public class Obra {
	@XmlAttribute(name ="Id", required = true )
	private Integer id;
	@XmlElement (name="Titulo")
	private String titulo;
	@XmlElement (name="Autor")
	private String autor;
	@XmlElement (name="Tecnica_utilizada")
	private String tecnica;
	@XmlElement (name="Fecha_de_creacion")
	private String fecha;
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
	public String getTecnica() {
		return tecnica;
	}
	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Obra [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", tecnica=" + tecnica + ", fecha="
				+ fecha + "]";
	}
	public Obra() {
		super();
	}
	public Obra(Integer id, String titulo, String autor, String tecnica, String fecha) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.tecnica = tecnica;
		this.fecha = fecha;
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
	
	
}