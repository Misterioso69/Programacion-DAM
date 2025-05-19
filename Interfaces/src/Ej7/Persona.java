package Ej7;
public class Persona implements Empleado , Cliente   {
	private  String dni ;
	private String nombre ;
	private boolean esCliente ;
	private boolean esEmpleado ;
	private int horas_trabajadas;
	private double saldo;
	public Persona(String dni, String nombre, boolean esCliente, boolean esEmpleado) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.esCliente = esCliente;
		this.esEmpleado = esEmpleado;
		this.horas_trabajadas = 0;
		this.saldo = 0;
	}
	public String getDni() {
		return dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isEsCliente() {
		return esCliente;
	}
	public void setEsCliente(boolean esCliente) {
		this.esCliente = esCliente;
	}
	public boolean isEsEmpleado() {
		return esEmpleado;
	}
	public void setEsEmpleado(boolean esEmpleado) {
		this.esEmpleado = esEmpleado;
	}
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", esCliente=" + esCliente + ", esEmpleado=" + esEmpleado
				+ ", horas_trabajadas=" + horas_trabajadas + ", saldo=" + saldo + "]";
	}
	@Override
	public void num_horas_trabajadas(int horas) {
		if(esEmpleado) {
			horas_trabajadas += horas;
		}else {
			System.out.println("No es un empleado ");
		}
	}
	@Override
	public int horas_trabajadas() {
		return horas_trabajadas;
	}
	@Override
	public void num_saldo(double saldo) {
		if(esCliente) {
			this.saldo += saldo;
		}else {
			System.out.println("No es un Cliente");
		}
	}
	@Override
	public double cant_saldo() {
		return saldo;
	}
	
	
	
	
}