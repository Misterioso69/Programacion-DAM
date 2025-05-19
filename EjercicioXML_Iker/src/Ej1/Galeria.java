package Ej1;

import java.util.Set;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement (name="Galeria")
@XmlType(propOrder = {"lista"})
@XmlAccessorType (XmlAccessType.FIELD)
public class Galeria {
	@XmlElementWrapper (name="Lista_de_Galeria")
	@XmlElement(name="Obra")
	Set<Obra>lista ;

	public Set<Obra> getLista() {
		return lista;
	}

	public void setLista(Set<Obra> lista) {
		this.lista = lista;
	}

	public Galeria(Set<Obra> lista) {
		super();
		this.lista = lista;
	}

	public Galeria() {
		super();
	}

	@Override
	public String toString() {
		return "Galeria [lista=" + lista + "]";
	}
	
	
}
