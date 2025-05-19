package Ej7;

public class Principal {
	public static void main (String[] args){
		Persona p1 = new Persona("1234568d","Iker",true,false);
		p1.num_horas_trabajadas(10);
		p1.num_saldo(100.5);
		System.out.println("Las horas trabajadas son "+p1.horas_trabajadas()+" y el saldo es de "+p1.cant_saldo());
		System.out.println(p1.toString());
	}

}
