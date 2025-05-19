package ejercicio_repaso1;
public abstract class Vehiculo {
	
	protected String matricula;
	protected int minutos;
	protected boolean abono = false;
	
	public abstract double calcularImporte();

	public Vehiculo(String matricula, int minutos, boolean abono) {
		super();
		this.matricula = matricula;
		this.minutos = minutos;
		this.abono = abono;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public boolean isAbono() {
		return abono;
	}

	public void setAbono(boolean abono) {
		this.abono = abono;
	}

	public Vehiculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", minutos=" + minutos + ", abono=" + abono + "]";
	}
	
	
	
}