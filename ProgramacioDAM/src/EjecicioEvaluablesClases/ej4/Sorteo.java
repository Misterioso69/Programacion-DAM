package EjecicioEvaluablesClases.ej4;

public class Sorteo {
	private String[] participantes;
	private int cont;
	
	 public Sorteo(int capa) {
	        this.participantes = new String[capa];
	        this.cont = 0;
	    }
	 public void agregarPar(String nombre) {
		 boolean res =false;
		 if(cont<participantes.length) {
			 for (int i = 0; i < participantes.length; i++) {
				    if (participantes[i] != null && participantes[i].equals(nombre)) {
				        res = true;
				        break;
				    }
				}
			 if(res) {
				 System.out.println("El nombre ya existe");
			 }else {
				 participantes[cont]=nombre;
				 cont++;
			 }
		 }else {
			 System.out.println("No hay mas hueco haz la fumcion 'ampliarPar'");
		 }
	 }
	 public void ampliarPar () {
		 String [] arreglo = new String[participantes.length+1];
		 System.arraycopy(participantes, 0, arreglo, 0, participantes.length);
		 participantes=arreglo;
	 }
	 public void ganadores() {
		 int a = (int) (Math.random()*participantes.length+1);
		 String [] arreglo = new String[a];
		 boolean[] usados = new boolean[participantes.length];
		    for (int i = 0; i < a; i++) {
		        int b;
		        do {
		            b = (int) (Math.random() * participantes.length); 
		        } while (usados[b]);
		        arreglo[i] = participantes[b];
		        usados[b] = true;
		    }
		    System.out.println("Los ganadores son:");
		    for (int i = 0; i < a; i++) {
		        System.out.println(arreglo[i]);
		    }
	 }
	 public void infoPar() {
		 if (cont==0) {
			 System.out.println("No hay participantes");
		 }else {
			 System.out.println("Participantes actuales son ");
			 for (int i = 0 ; i<participantes.length;i++) {
				 System.out.println(participantes[i]);
			 }
		 }
	 }
	 
}
