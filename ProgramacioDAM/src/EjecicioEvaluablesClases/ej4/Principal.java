package EjecicioEvaluablesClases.ej4;

public class Principal {

	public static void main(String[] args) {
		Sorteo s = new Sorteo(5);
		s.agregarPar("jose");
		s.agregarPar("maria");
		s.agregarPar("jorge");
		s.agregarPar("ivan");
		s.agregarPar("iker");

		s.ganadores();
		
	}

}
