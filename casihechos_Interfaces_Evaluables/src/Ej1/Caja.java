package Ej1;
public class Caja {
	protected final int ancho;
	protected final int alto;
	protected final int fondo;
	private String etiqueta;
	private Unidad unidad;
	
	enum Unidad {cm,m}

	public Caja(int ancho, int alto, int fondo, Unidad unidad) {
		super();
		this.ancho = ancho;
		this.alto = alto;
		this.fondo = fondo;
		this.etiqueta = "";
		this.unidad = unidad;
	}

	public int getAncho() {
		return ancho;
	}

	public int getAlto() {
		return alto;
	}
	public int getFondo() {
		return fondo;
	}

	public Unidad getUnidad() {
		return unidad;
	}

	public void setUnidad(Unidad unidad) {
		this.unidad = unidad;
	}

	@Override
	public String toString() {
		return "Caja [ancho=" + ancho + ", alto=" + alto + ", fondo=" + fondo + ", etiqueta=" + etiqueta + "]";
	}
	
	public double getVolumen () {
		double res = 0;
		if(unidad ==  Unidad.m) {
			res = ancho*alto*fondo;
		}else {
			res = (ancho*alto*fondo)/1000000;
		}
		return res ;
	}
	public void setEtiqueta (String etiqueta) {
		   if (etiqueta.length() <= 30) {
	            this.etiqueta = etiqueta;
	        } else {
	            System.out.println("La etiqueta no puede llegar a los 30 caracteres.");
	        }
	}
	
	
}