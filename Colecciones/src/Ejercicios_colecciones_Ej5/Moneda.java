package Ejercicios_colecciones_Ej5;
public class Moneda{
	private String valor;
	private String posicione;
	public Moneda(String valor, String posicione) {
		super();
		this.valor = valor;
		this.posicione = posicione;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getPosicione() {
		return posicione;
	}
	public void setPosicione(String posicione) {
		this.posicione = posicione;
	}
	@Override
	public String toString() {
		return "Moneda [valor=" + valor + ", posicione=" + posicione + "]";
	}
	
	
}