package ejercicio2;

import java.util.List;


public interface GestionInventario { //Se crea una interfaz con dos metodos y se declaran 
	List<Productos>filtarPorCategoria(Productos categoria);
	List<String>obtenerNombreProductos();
}
