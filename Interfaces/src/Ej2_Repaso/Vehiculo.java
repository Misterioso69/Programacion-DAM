package Ej2_Repaso;



public class Vehiculo implements Modificacion ,Comparable<Vehiculo> {
	private String matricula;
	private int anio_anti;
	private String color;
	private int num_plazas;
	private String marca;
	public Vehiculo(String matricula,int anio_anti, String color, int num_plazas, String marca) {
		super();
		this.matricula = matricula;
		this.anio_anti = anio_anti;
		this.color = color;
		this.num_plazas = num_plazas;
		this.marca = marca;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getAnio_anti() {
		return anio_anti;
	}
	public void setAnio_anti(int anio_anti) {
		this.anio_anti = anio_anti;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNum_plazas() {
		return num_plazas;
	}
	public void setNum_plazas(int num_plazas) {
		this.num_plazas = num_plazas;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula  + ", anio_anti=" + anio_anti
				+ ", color=" + color + ", num_plazas=" + num_plazas + ", marca=" + marca + "]";
	}
	@Override
	public void mod_matricula(String a) {
		// TODO Auto-generated method stub
		setMatricula(a);
		
	}
	@Override
	public void mod_anio(int a) {
		// TODO Auto-generated method stub
		setAnio_anti(a);
	}
	@Override
	public int compareTo(Vehiculo o) {
		// TODO Auto-generated method stub
		return this.matricula.compareTo(o.getMatricula());
	}


	
}