package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Galeria {
	private int cantidadMaxima;
	private List<Obras> galeria = new ArrayList<Obras>();
	public Galeria(int cantidadMaxima, List<Obras> galeria) {
		super();
		this.cantidadMaxima = cantidadMaxima;
		this.galeria = galeria;
	}
	public int getCantidadMaxima() {
		return cantidadMaxima;
	}
	public void setCantidadMaxima(int cantidadMaxima) {
		this.cantidadMaxima = cantidadMaxima;
	}
	public List<Obras> getGaleria() {
		return galeria;
	}
	public void setGaleria(List<Obras> galeria) {
		this.galeria = galeria;
	}
	public Galeria() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Galeria [cantidadMaxima=" + cantidadMaxima + ", galeria=" + galeria + "]";
	}
	
}
