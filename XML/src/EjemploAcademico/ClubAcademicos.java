package EjemploAcademico;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


@XmlRootElement (name="listaAcademicos")
@XmlType(propOrder = {"nombreClub","numMiembros","listado"})
@XmlAccessorType (XmlAccessType.FIELD)

public class ClubAcademicos {
	@XmlElementWrapper (name="academicos")
	@XmlElement (name="academico")
	private List<Academico> listado;
	@XmlElement (name = "nombre")
	private String nombreClub;
	@XmlElement (name="cantidad")
	private int numMiembros;
	public ClubAcademicos() {
		super();
	}
	public ClubAcademicos(List<Academico> listado, String nombreClub, int numMiembros) {
		super();
		this.listado = listado;
		this.nombreClub = nombreClub;
		this.numMiembros = numMiembros;
	}
	public List<Academico> getListado() {
		return listado;
	}
	public void setListado(List<Academico> listado) {
		this.listado = listado;
	}
	public String getNombreClub() {
		return nombreClub;
	}
	public void setNombreClub(String nombreClub) {
		this.nombreClub = nombreClub;
	}
	public int getNumMiembros() {
		return numMiembros;
	}
	public void setNumMiembros(int numMiembros) {
		this.numMiembros = numMiembros;
	}
	@Override
	public String toString() {
		return "ClubAcademicos [listado=" + listado + ", nombreClub=" + nombreClub + ", numMiembros=" + numMiembros
				+ "]";
	}

}