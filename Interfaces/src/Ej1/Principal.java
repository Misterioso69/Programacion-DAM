package Ej1;

public class Principal {
	public static void main (String[]arg) {
		Jornada jornada1 = new Jornada("12345678A", "18/02/2025", 9, 17);  
		Jornada jornada2 = new Jornada("12345678A", "19/02/2025", 9, 22); 
		Jornada jornada3 = new Jornada("87654321B", "18/02/2025", 8, 17);
		
		 System.out.println(jornada1);
	     System.out.println(jornada2);
	     System.out.println(jornada3);
	     
	     System.out.println("jornada1 vs jornada2: " + jornada1.compareTo(jornada2)); 
	     System.out.println("jornada1 vs jornada3: " + jornada1.compareTo(jornada3));
	}
}
