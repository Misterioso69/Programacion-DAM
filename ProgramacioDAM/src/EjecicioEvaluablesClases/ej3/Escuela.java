package EjecicioEvaluablesClases.ej3;

import java.util.Arrays;

public class Escuela {
	private Clase [] lista ;
	private int cont ;
	public Clase[] getLista() {
		return lista;
	}
	public void setLista(Clase[] lista) {
		this.lista = lista;
	}
	@Override
	public String toString() {
		return "Escuela [lista=" + Arrays.toString(lista) + "]";
	}
	public Escuela() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Escuela(int capacidad) {
		this.lista = new Clase [capacidad];
		this.cont = 0;
	}
	
	public void ampliarEscuela () {
        Clase[] arreglo = new Clase[lista.length + 1];
        System.arraycopy(lista, 0, arreglo, 0, lista.length);
        lista = arreglo;
	} 
	
	public void agregarCla (Clase a) {
	    if (cont < lista.length) {
            lista[cont] = a;
            cont++;
        } else {
            System.out.println("No se puede agregar más clases, escuela llena.");
        }
    }
	
	public void buscarClase(String nombre) {
		boolean res =false ;
		for(int i = 0;i<lista.length;i++) {
			if(lista[i]!=null && lista[i].getNombre()==nombre) {
				System.out.println("La Clase es tal: "+lista[i].getNombre());
				res=true;
			}
		}
		if(res==false) {
			System.out.println("No existe una clase llamada asi");
		}
	}
	
	public void buscarEstu(String nombre) {
		boolean res =false ;
		for(int i = 0;i<lista.length;i++) {
			for(int j = 0 ;j<lista[i].getLista().length; j++) {
				if(lista[i].getLista()[j].getNombre().equals(nombre) && lista[i].getLista()[j]!= null ) {
					System.out.println("Su clase es :"+lista[i].getNombre()+" y su informacion es "+lista[i].getLista()[j].getNombre()+" "+lista[i].getLista()[j].getEdad()+" "+lista[i].getLista()[j].getCalificacion());
				}
			}
		}
		if(res==false) {
			System.out.println("No existe una clase llamada asi");
		}
	}
	
	public void mostrarEstas() {
		for(int i = 0;i<lista.length;i++) {
			System.out.println("El promedio de esta clase es :"+lista[i].calcularproClase() +" y su tamaño de clase es "+lista[i].tamañoCla());
		}
	}
}
