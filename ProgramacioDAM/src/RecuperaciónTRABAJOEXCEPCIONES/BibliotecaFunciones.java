package RecuperaciónTRABAJOEXCEPCIONES;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class BibliotecaFunciones {

	public static boolean fechaValida(){
		LocalDate.of(2020,2,29);
		return true;
	}
	public static LocalDate verFechaDesouesDia () {
		   LocalDate fecha = LocalDate.of(2010,2,20);
		   return fecha.plusDays(30);
		   
	}
	public static LocalDate verFechaDesouesMes () {
		   LocalDate fecha = LocalDate.of(2009,12,15);
		   return fecha.plusMonths(1);
	}
	public static LocalDate sumarPeriodo () {
		   LocalDate fecha = LocalDate.of(2022,11,12);
		   return fecha.plusMonths(1).plusDays(30);
	}
	public static DayOfWeek diaDelaSemana () {
		   LocalDate fecha = LocalDate.of(2022, 4, 22);
		   return fecha.getDayOfWeek();
	}
	public static DayOfWeek diaHace3Dias () {
		 LocalDate fecha = LocalDate.now().minusDays(3);
	        return fecha.getDayOfWeek();
	}
	public static DayOfWeek primerDiaOctubre () {
		   LocalDate fecha = LocalDate.of(1940,10, 1);
		   return fecha.getDayOfWeek();
	}
	public static int segundos() {
		int horas = 12-10;
		int minutos = 30-45;
		return (minutos*60)+(horas*3600);
	}
}
