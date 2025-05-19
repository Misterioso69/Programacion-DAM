package EjecicioEvaluablesClases.ej3;

import java.util.Arrays;

public class Clase {
	 private String nombre;
     private int cont;
     private Estudiante[] lista ;
     public String getNombre() {
         return nombre;
     }
     public void setNombre(String nombre) {
         this.nombre = nombre;
     }
     public Estudiante[] getLista() {
         return lista;
     }
     public void setLista(Estudiante[] lista) {
         this.lista = lista;
     }
     @Override
     public String toString() {
         return "Clase [nombre=" + nombre + ", lista=" + Arrays.toString(lista) + "]";
     }
     public Clase() {
         super();
         // TODO Auto-generated constructor stub
     }
     
     public Clase(int capacidad) {
         lista = new Estudiante[capacidad];
         cont = 0;
     }
     public void ampliarClase() {
         Estudiante[] arreglo = new Estudiante[lista.length + 1];
         System.arraycopy(lista, 0, arreglo, 0, lista.length);
         lista = arreglo;
     }
     public void agregarEstu(Estudiante a) {
         if (cont < lista.length) {
             lista[cont] = a;
             cont++;
         } else {
             System.out.println("No se puede agregar más estudiantes, clase llena.");
         }
     }
     public void eliminarEstu(Estudiante estudiante)
 	{
 		int i = 0;
 		
 		while (lista.length > i)
 		{
 			if (lista[i] == estudiante)
 			{
 				while (lista.length > i + 1)
 				{
 					lista[i] = lista[i + 1];
 					i++;
 				}
 			}
 			i++;
 		}
 		cont--;
 	}
     public void buscarEstu(String nombre) {
         boolean res = false ;
         for(int i = 0 ;i<lista.length;i++) {
             if(lista[i]!=null && lista[i].getNombre().equals(nombre)) {
                 System.out.println("El estudiante es nombre: "+lista[i].getNombre()+" , su edad: "+lista[i].getEdad()+" y su calificacion es de: "+lista[i].getCalificacion());
                 res = true;
             }
         }
         if(res==false) {
             System.out.println("No existe ese estudiante en la lista");
         }
     }
     public double calcularproClase () {
    	 if (lista.length == 0) {
    	        System.out.println("No hay estudiantes en la clase.");
    	        return 0;
    	    }
    	    int suma = 0;
    	    for (int i = 0; i < lista.length; i++) {
    	        suma += lista[i].getCalificacion();
    	    }
    	    return (double) suma / lista.length;
    	}
     public int tamañoCla() {
    	 return lista.length;
     }
 }
