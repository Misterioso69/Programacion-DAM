package ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class PrincipalEjercicio1A {

	public static void main(String[] args) {
		GestionAcademica ga=new GestionAcademica();
		Map<String, Estudiante[]> cursos=new HashMap<String, Estudiante[]>();
		ga.setCursos(cursos);
		Estudiante e=new Estudiante("Juan", "89897890F");
		Estudiante e1=new Estudiante("Luisa", "45697890L");
		Estudiante e2=new Estudiante("Maria", "89555890M");
		Estudiante e3=new Estudiante("Paula", "89897123S");
		Estudiante e4=new Estudiante("Manuel", "89897890F");
		Estudiante e5=new Estudiante("Luis", "22897890R");
		ga.agregarEstudiante("4ESO", e);
		ga.agregarEstudiante("2ESO", e1);
		ga.agregarEstudiante("1ESO", e2);
		ga.agregarEstudiante("3ESO", e3);
		ga.agregarEstudiante("4ESO", e4);
		ga.agregarEstudiante("4ESO", e5);
		
		ga.listarEstudiantes("4ESO");
		ga.listarEstudiantes("2ESO");
		ga.listarEstudiantes("1ESO");
		ga.listarEstudiantes("3ESO");
		System.out.println(ga.buscarEstudiante("1ESO", "89555890M")); 
		ga.actualizarEstudiante("2ESO", "45697890L", "Pepe");
		ga.eliminarEstudiante("3ESO", "89897123S");
		ga.listarEstudiantes("4ESO");
		ga.listarEstudiantes("2ESO");
		ga.listarEstudiantes("1ESO");
		ga.listarEstudiantes("3ESO");
		//Incluir las pruebas de los comparadores
		ga.agregarEstudiante("4ESO", e1);
		ga.agregarEstudiante("4ESO", e2);
		ga.agregarEstudiante("4ESO", e3);
		System.out.println("Orden por Nombre");
		ga.orden_Nombre("4ESO");
		System.out.println("Orden por DNI");
		ga.orden_Dni("4ESO");
	}

}
