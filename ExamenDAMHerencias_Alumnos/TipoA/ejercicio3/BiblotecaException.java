package ejercicio3;

public class BiblotecaException extends Exception {
	public static String LIBRO_DEVUELTO() {
		return "El libro ya esta devuelto";
	}
	public static String LIBRO_PRESTADO () {
		return "El libro ya esta prestado";
	}
	public static String BIBLOTECA_LLENA () {
		return "No se puede almacenar mas libros";
	}
	public BiblotecaException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BiblotecaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
	public BiblotecaException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
	public BiblotecaException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	public BiblotecaException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
