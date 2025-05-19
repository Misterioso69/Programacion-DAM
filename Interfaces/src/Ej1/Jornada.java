package Ej1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Jornada implements Comparable<Jornada>{
	private String dni;
	private String fecha;
	private int hora_entrada;
	private int hora_salida;
	public Jornada(String dni, String fecha, int hora_entrada, int hora_salida) {
		super();
		this.dni = dni;
		this.fecha = fecha;
		this.hora_entrada = hora_entrada;
		this.hora_salida = hora_salida;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getHora_entrada() {
		return hora_entrada;
	}
	public void setHora_entrada(int hora_entrada) {
		this.hora_entrada = hora_entrada;
	}
	public int getHora_salida() {
		return hora_salida;
	}
	public void setHora_salida(int hora_salida) {
		this.hora_salida = hora_salida;
	}
	
	public Jornada() {
		super();
	}
	
	public int minutos_trabajadas () {
		return (hora_salida-hora_entrada)*60;
	}
	
	@Override
	public String toString() {
		return "Jornada [dni=" + dni + ", fecha=" + fecha + ", minutos trabajados="+minutos_trabajadas() +"]";
	}
	@Override
	public int compareTo(Jornada o) {
        int comparacionDNI = this.dni.compareTo(o.dni);
        if (comparacionDNI != 0) {
            return comparacionDNI;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha1 = LocalDate.parse(this.fecha, formatter);
        LocalDate fecha2 = LocalDate.parse(o.fecha, formatter);
        
        return fecha1.compareTo(fecha2);
	}
}