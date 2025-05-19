package ejercicio1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GestionAcademica {
	private Map<String, Estudiante[]> Cursos = new HashMap<String, Estudiante[]>();

	public Map<String, Estudiante[]> getCurso() {
		return Cursos;
	}

	public void setCursos(Map<String, Estudiante[]> curso) {
		Cursos = curso;
	}

	@Override
	public String toString() {
		return "GestionAcademica [Curso=" + Cursos + "]";
	}

	public GestionAcademica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void agregarEstudiante(String curso, Estudiante o1) {
		if (Cursos.containsKey(curso)) {

			Estudiante[] a = Cursos.getOrDefault(curso, null);
			boolean estarepe = false;
			for (int i = 0; i < a.length; i++) {
				if (a[i].getDni().equals(o1.getDni())) {
					estarepe = true;
				}
			}
			if (estarepe) {
				System.out.println("El estudiante es repetido");
			} else {
				Estudiante[] arreglo = Arrays.copyOf(a, a.length + 1);
				a = arreglo;
				a[a.length - 1] = o1;
				Cursos.put(curso, a);
				System.out.println("Se ha añadido ");
			}
		} else {
			System.out.println("El curso no existe pero se ha añadido");
			Estudiante[] a = new Estudiante[1];
			a[a.length - 1] = o1;
			Cursos.put(curso, a);
		}
	}

	public void eliminarEstudiante(String curso, String dni) {
		if (Cursos.containsKey(curso)) {
			Estudiante[] a = Cursos.getOrDefault(curso, null);
			String b = "";
			boolean esta = false;
			for (int i = 0; i < a.length; i++) {
				if (a[i].getDni().equals(dni)) {
					esta = true;
					b = a[i].getDni();
				}
			}
			if (esta && a.length == 1) {
				Cursos.remove(curso);
				System.out.println("Se ha eliminado el curso");
			} else if (esta) {
				Estudiante[] arreglo = Arrays.copyOf(a, a.length - 1);
				int cont = 0;
				for (int i = 0; i < a.length; i++) {
					if (!a[i].getDni().equals(b)) {
						arreglo[cont] = a[i];
						cont++;
					}
				}
				Cursos.put(curso, arreglo);
				System.out.println("Se ha eliminado el alumno");
			}
		} else {
			System.out.println("No existe el curso");
		}
	}

	public void actualizarEstudiante(String curso, String dni, String nombre) {
		if (Cursos.containsKey(curso)) {
			Estudiante[] a = Cursos.get(curso);
			String b = "";
			boolean esta = false;
			for (int i = 0; i < a.length; i++) {
				if (a[i].getDni().equals(dni)) {
					b = a[i].getNombre();
					esta = true;
					a[i].setNombre(nombre);
				}
			}
			if (esta) {
				Cursos.put(curso, a);
				System.out.println("Se ha actualizado el nombre de " + b + " ha " + nombre);
			} else {
				System.out.println("No se encontro el alumno");
			}

		} else {
			System.out.println("No existe el curso");
		}
	}

	public void listarEstudiantes(String curso) {
		if (Cursos.containsKey(curso)) {
			Estudiante[] a = Cursos.getOrDefault(curso, null);
			System.out.println("En el cuso se encuntra " + Arrays.toString(a));
		} else {
			System.out.println("El curso no existe");
		}
	}

	public Estudiante buscarEstudiante(String curso, String dni) {
		Estudiante al = new Estudiante(null, null);
		if (Cursos.containsKey(curso)) {
			Estudiante[] a = Cursos.getOrDefault(curso, null);
			boolean esta = false;
			int b = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i].getDni().equals(dni)) {
					esta = true;
					b = i;
				}
			}
			if (esta) {
				al = a[b];
			}
		}
		return al;
	}
	public void orden_Nombre (String curso) {
		if(Cursos.containsKey(curso)) {
			Estudiante[] a = Cursos.getOrDefault(curso, null);
			Arrays.sort(a);
			System.out.println(Arrays.toString(a));
		}else {
			System.out.println("No existe el curso");
		}
	}
	public void orden_Dni (String curso) {
		if(Cursos.containsKey(curso)) {
			Estudiante[] a = Cursos.getOrDefault(curso, null);
			Arrays.sort(a,new ComparaDNI());
			System.out.println(Arrays.toString(a));
		}else {
			System.out.println("No existe el curso");
		}
	}
}
