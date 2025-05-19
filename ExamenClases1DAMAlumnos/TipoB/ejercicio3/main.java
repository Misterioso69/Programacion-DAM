package ejercicio3;

public class main {

	public static void main(String[] args) {
		// Como es estatico simepre aparece "si" en todos los usuario 
		Usuario u1 = new Usuario("iker");
		Usuario u2 = new Usuario("tomi");
		Usuario u3 = new Usuario("jorge");
		Usuario u4 = new Usuario("calletano");
		System.out.println(u1.getTotalUsuario());
		System.out.println(u2.getTotalUsuario());
		System.out.println(u3.getTotalUsuario());
		System.out.println(u4.getTotalUsuario());
		
		
		
	}

}
