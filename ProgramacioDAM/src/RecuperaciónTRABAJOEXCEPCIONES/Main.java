package RecuperaciónTRABAJOEXCEPCIONES;

public class Main {

	public static void main(String[] args) {
		// 1
		try {
			System.out.println("1:"+BibliotecaFunciones.fechaValida());
		}catch(Exception e ){
			System.out.println("Error la fecha no esta bien puesta "+e.getMessage());
		}
		
		// 2
		try {
			System.out.println("2:"+BibliotecaFunciones.verFechaDesouesDia	());
		}catch(Exception e ){
			System.out.println("Error la fecha no esta bien puesta");
		}
		// 3
		try {
			System.out.println("3:"+BibliotecaFunciones.verFechaDesouesMes());
		}catch(Exception e ){
			System.out.println("Error la fecha no esta bien puesta");
		}
		// 4
		try {
			System.out.println("4:"+BibliotecaFunciones.sumarPeriodo());
		}catch(Exception e ){
			System.out.println("Error la fecha no esta bien puesta");
		}
		// 5
		try {
			System.out.println("5:"+BibliotecaFunciones.diaDelaSemana());
		}catch(Exception e ){
			System.out.println("Error la fecha no esta bien puesta");
		}
		// 6
		try {
			System.out.println("6:"+BibliotecaFunciones.diaHace3Dias());
		}catch(Exception e ){
			System.out.println("Error la fecha no esta bien puesta");
		}
		// 7
		try {
			System.out.println("7:"+BibliotecaFunciones.primerDiaOctubre());
		}catch(Exception  e ){
			System.out.println("Error la fecha no esta bien puesta");
		}
		// 8
		try {
			System.out.println("8:"+BibliotecaFunciones.segundos());
		}catch(Exception e ){
			System.out.println("Error la fecha no esta bien puesta");
		}
	}

}
