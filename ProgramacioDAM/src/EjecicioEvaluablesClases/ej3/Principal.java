package EjecicioEvaluablesClases.ej3;

public class Principal {
	public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Ana", 20, 8.5);
        Estudiante estudiante2 = new Estudiante("Luis", 22, 7.8);
        Estudiante estudiante3 = new Estudiante("María", 21, 9.2);
        Estudiante estudiante4 = new Estudiante("Jose", 21, 9.2);
        
        Clase ca = new Clase (3);
        ca.setNombre("Mates");
        ca.agregarEstu(estudiante1);
        ca.agregarEstu(estudiante2);
        ca.agregarEstu(estudiante3);
        ca.agregarEstu(estudiante4);
        ca.ampliarClase();
        ca.agregarEstu(estudiante4);
        
        Clase ca2 = new Clase(2);
        ca2.setNombre("FyQ");
        ca2.agregarEstu(estudiante1);
        ca2.agregarEstu(estudiante2);
        ca2.eliminarEstu(estudiante2);
        
        
        ca.buscarEstu("Ana");
        ca2.buscarEstu("Luis");
        
        Escuela es = new Escuela(2);
        es.agregarCla(ca);
        es.buscarClase("FyQ");
        es.agregarCla(ca2);
        es.buscarEstu("Ana");
        es.mostrarEstas();
        
    }

}
