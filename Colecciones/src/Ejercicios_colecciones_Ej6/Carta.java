package Ejercicios_colecciones_Ej6;
public class Carta {
	private int valor ;
	private String palo;
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	public Carta(int valor, String palo) {
		super();
		this.valor = valor;
		this.palo = palo;
	}
	@Override
	public String toString() {
		return "\nCarta[valor=" + valor + ", palo=" + palo + "]";
	}
	
}