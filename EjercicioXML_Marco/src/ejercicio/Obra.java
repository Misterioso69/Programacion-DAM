package ejercicio;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Obra")
@XmlType(propOrder = { "titulo", "autor", "tecnica", "fechaCreacion" })
@XmlAccessorType(XmlAccessType.FIELD)
public class Obra {
	@XmlAttribute(name = "ID", required = true)
	private Integer id;
	@XmlElement(name = "Titulo")
	private String titulo;
	@XmlElement(name = "Autor")
	private String autor;
	@XmlElement(name = "Tecnica")
	private String tecnica;
	@XmlElement(name = "FechaCreacion")
	private String fechaCreacion;

	@Override
	public String toString() {
		return "Galeria [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", tecnica=" + tecnica
				+ ", fecha_creacion=" + fechaCreacion + "]";
	}

	public Obra() {

	}

	public Obra(Integer id, String titulo, String autor, String tecnica, String fecha_creacion) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.tecnica = tecnica;
		this.fechaCreacion = fecha_creacion;
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

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	public String getFecha_creacion() {
		return fechaCreacion;
	}

	public void setFecha_creacion(String fecha_creacion) {
		this.fechaCreacion = fecha_creacion;
	}

}
