package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Supermercado implements GestionInventario {
	List<Productos>lista =  new ArrayList<Productos>();
	public void agregarProducto(Productos a) { //Se añade productos y te dice si su codigo de barra esta repetido
		if(lista.isEmpty()) {
			lista.add(a);
			System.out.println("Producto añadido");
		}else {
			Iterator<Productos> i = lista.iterator();
			boolean estarepe = false;
			while(i.hasNext()) {
				Productos b = i.next(); 
				if(a.getCodigoBarras().equals(b.getCodigoBarras())) { // Mira si el codigo de barra esta ya en la Lista
					estarepe=true;
				}
			}
			if(!estarepe) {
				lista.add(a);
				System.out.println("Producto añadido");
			}else {
				System.out.println("Producto repetido");
			}
		}	
	}
	public void listarProductos() { //Efectua el metodo toString varias veces dependiendo de la cantidad de productos
		Iterator<Productos>i = lista.iterator();
		while(i.hasNext()) {
			Productos a = i.next();
			System.out.println(a.toString());
		}
	}
	public void eliminarProducto(String codigo) { //Elimina el producto si se encuentra su codigo de barra
		Iterator<Productos>i = lista.iterator();
		boolean esta = false;
		while(i.hasNext()) {
			Productos a = i.next();
			if(a.getCodigoBarras().equals(codigo)) { //Aqui se mira si su codigo de barra se encuentra en la Lista
				esta=true;
				lista.remove(a);
			}
		}
		if(esta) {
			System.out.println("Producto eliminado");
		}else {
			System.out.println("No se encontro el producto");
		}
	}
	@Override
	public List<Productos> filtarPorCategoria(Productos categoria) { //Observa que objetos son de la misma categoria
		// TODO Auto-generated method stub
		List<Productos>b = new ArrayList<Productos>();
		Iterator<Productos>i =lista.iterator();
		while(i.hasNext()) { //Dentro del bucle se mira primero cual es la categoria que se quiere y luego el producto de la Lista para añadirlo en otro 
			Productos a = i.next();
			if(categoria instanceof Alimento  ) {
				if (a instanceof Alimento) {
					b.add(a);
				}
			}
			if(categoria instanceof Electronico  ) {
				if(a instanceof Electronico) {
					b.add(a);
				}
			}if(categoria instanceof Limpieza  ) {
				if(a instanceof Limpieza) {
					b.add(a);
				}
			}
		}
		return b;
	}
	@Override
	public List<String> obtenerNombreProductos() { //Observa todos los objetos de la Lista y se guarda en una nueva Lista solo los nombres de los productos
		// TODO Auto-generated method stub
		List<String>a = new ArrayList<String>();
		Iterator<Productos> i = lista.iterator();
		while(i.hasNext()) {
			Productos b = i.next();
			a.add(b.getNombre());
		}
		return a;
	}
	
}
