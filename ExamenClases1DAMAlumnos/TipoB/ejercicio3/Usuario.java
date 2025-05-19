package ejercicio3;

public class Usuario {
	private String nombre;
	private static String totalUsuario = "si";
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static String getTotalUsuario() {
		return totalUsuario;
	}
	public static void setTotalUsuario(String totalUsuario) {
		Usuario.totalUsuario = totalUsuario;
	}
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + "]";
	}
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Usuario (String nombre) {
		this.nombre = nombre;
	}
}
