package ejercicio2;

import java.util.List;

public class Principal {

	public static void main(String[] args) {
		Supermercado supermercado = new Supermercado();
		// Agregar productos
		Alimento pan = new Alimento("111", "Pan", 1.5, 50, "2025-04-01");
		Electronico tv = new Electronico("222", "TV Samsung", 500, 10, 12);
		Limpieza detergente = new Limpieza("333", "Detergente", 3.5, 30, true);
		
		supermercado.agregarProducto(pan);
		supermercado.agregarProducto(tv);
		supermercado.agregarProducto(detergente);
		
		
		// Mostrar todos los productos
		System.out.println("Lista de productos:");
		supermercado.listarProductos();
		
		// Aplicar descuentos
		System.out.println("\nDescuentos aplicados:");
		System.out.println(pan.getNombre() + ": $" + pan.calcularDescuento());
		System.out.println(tv.getNombre() + ": $" + tv.calcularDescuento());
		System.out.println(detergente.getNombre() + ": $" +  detergente.calcularDescuento());

		// Filtrar productos por categoría
		System.out.println("\nProductos de categoría Alimento:");
		List<Productos> alimentos = supermercado.filtarPorCategoria(pan);
		 System.out.println(alimentos.toString());

		// Obtener nombres de productos
		System.out.println("\nNombres de productos:");
		System.out.println(supermercado.obtenerNombreProductos());

		// Eliminar un producto
		System.out.println("\nEliminando TV Samsung...");
		supermercado.eliminarProducto("222");
		supermercado.listarProductos();

	}

}
