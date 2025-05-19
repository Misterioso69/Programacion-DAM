 package Ej1;

public class Cajacarton extends Caja{
	
	public Cajacarton (int ancho ,int alto,int fondo , Unidad unidad) {
		super(ancho,alto,fondo,unidad);
	}

	@Override
	public double getVolumen() {
		double volumenCarton = super.getVolumen()*80/100;
		return volumenCarton;
	}
	
	public double getSuperficie() {
		double superficie = 2*(fondo*ancho)+2 *(fondo*alto)+2*(ancho-alto);
		return superficie;
	}

}
