package ejercicio2;
import java.util.Arrays;
public class PlataformaPeliculas {
	private String[] lista = new String [100];
	private int cont = 0 ;
	
	public void  registrarPelicula ( String nombre ) {
		// miramos las tres opciones posible si esta llena , si esta y si no esta 
		boolean esta = false; 
		if (cont == lista.length) {
			System.out.println("La plataforma esta llena");
		}else {
			for ( int i = 0 ; i < lista.length;i++) { 
				if(nombre==lista[i]) esta=true;
			}
			if (esta) System.out.println("Ya esta ");
			else lista[cont]=nombre;
			cont++;
		}
	}
	public int consultarEspacio (){
		// calculamos las peliculas que caben
		return 100-cont;
	}
	public void mostrarPeliculasAlmacenadas() {
		// se muestra las peliculas que hay guardadas
		System.out.println("Las peliculas que hay son ");
		for (int i =0;i<cont;i++) {
			System.out.println(lista[i]+",");
		}
	}
	public String buscarPelicula(String nombre) {
		//busca la pelicula por el nombre 
		boolean hf = false;
		String res ="";
		for(int i = 0 ;i <lista.length;i++) {
			if(lista[i]==nombre) hf =true;
		}
		if (hf) {
			res ="Se encontro la pelicula";
		}
		if(!hf) {
			res = "No esta la pelicula";
		}
		return res;
	}
	public void eliminarPelicula (String nombre) {
		// elimina la pelicula buscada si se encuentra si no es asi te lo dice y si esta pues lo borra
		boolean hf = false;
		for(int i = 0 ;i <lista.length;i++) {
			if(lista[i]==nombre) hf =true;
		}
		if (hf) {
			System.out.println("Se encontro la pelicula y se borro");
			String[] arreglo = new String[lista.length];
			int a = 0;
			for(int i = 0;i<lista.length;i++) {
				if (lista[i]!=nombre) {
					arreglo[a]=lista[i];
					a++;
				}
			}
			lista= arreglo;
		}
		if(!hf) {
			System.out.println("No esta la pelicula");
		}
	}
	public String[] getLista() {
		return lista;
	}
	public void setLista(String[] lista) {
		this.lista = lista;
	}
	public int getCont() {
		return cont;
	}
	public void setCont(int cont) {
		this.cont = cont;
	}
	@Override
	public String toString() {
		return "PlataformaPeliculas [lista=" + Arrays.toString(lista) + "]";
	}
	public PlataformaPeliculas() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
