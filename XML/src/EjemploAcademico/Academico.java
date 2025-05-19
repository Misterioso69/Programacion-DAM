package EjemploAcademico;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement (name="academico")
@XmlType (propOrder = {"nombre","anioIngreso"})
@XmlAccessorType (XmlAccessType.FIELD)
public class Academico {
	@XmlElement (name="nombre_academico")
	private String nombre;
	@XmlElement (name="año_ingreso")
	private int anioIngreso;
	
	public Academico(String nombre, int anioIngreso) {
		super();
		this.nombre = nombre;
		this.anioIngreso = anioIngreso;
	}

	@Override
	public String toString() {
		return "Academico [nombre=" + nombre + ", anioIngreso=" + anioIngreso + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnioIngreso() {
		return anioIngreso;
	}

	public void setAnioIngreso(int anioIngreso) {
		this.anioIngreso = anioIngreso;
	}

	public Academico() {
		super();
	}

	
}
