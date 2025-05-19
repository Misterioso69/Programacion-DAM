package Ej1;

public class VideoClubException extends Exception {
	public static String PELICULA_DEVUELTA = "La pelicula ya ha sido devuelta";
	public static String PELICULA_ALQUILADA= "La pelicula ya esta alquilada";
	public static String VIDEOTECA_LLENA="No se puede almacenar mas peliculas";
	public VideoClubException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VideoClubException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
	public VideoClubException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
	public VideoClubException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	public VideoClubException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	

}
