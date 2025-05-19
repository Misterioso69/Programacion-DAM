package EjecicioEvaluablesClases.ej1;

public class Cifrado {
	private int clave;
	private String frase;
	public int getClave() {
		return clave;
	}
	public void setClave(int clave) {
		this.clave = clave;
	}
	public String getFrase() {
		return frase;
	}
	public void setFrase(String frase) {
		this.frase = frase;
	}
	@Override
	public String toString() {
		return "Cifrado [clave=" + clave + ", frase=" + frase + "]";
	}
	public Cifrado() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cifrado(int clave , String frase ) {
		this.clave = clave;
		this.frase = frase;
	}
	public void Cifrar() {
		String res = "";
	    
	    for (int i = 0; i < frase.length(); i++) {
	        char caracter = frase.charAt(i);
	        int caracterCi = caracter + clave;
	        if (caracter >= 'A' && caracter <= 'Z') {
	            if (caracterCi > 'Z') {
	                caracterCi = 'A' + (caracterCi - 'Z' - 1);
	            } else if (caracterCi < 'A') {
	                caracterCi = 'Z' - ('A' - caracterCi - 1);
	            }
	        }
	        else if (caracter >= 'a' && caracter <= 'z') {
	            if (caracterCi > 'z') {
	                caracterCi = 'a' + (caracterCi - 'z' - 1);
	            } else if (caracterCi < 'a') {
	                caracterCi = 'z' - ('a' - caracterCi - 1);
	            }
	        }
	        res += (char) caracterCi;
	    }

	    System.out.println(res);
		}
}
