package ClaseHerenciaInterfaces.ej3;

public class Coche {
	private String marca ;
	private String modelo ;
	private Persona propetario ;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Persona getPropetario() {
		return propetario;
	}
	public void setPropetario(Persona propetario) {
		this.propetario = propetario;
	}
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", propetario=" + propetario + "]";
	}
	public Coche() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Coche(String marca, String modelo , Persona propetario) {
		this.marca = marca;
		this.modelo = modelo;
		this.propetario = propetario;
	}
	public void InfoCoche () {
		System.out.println("Marca: "+marca+"\nModelo: "+modelo+"\nPropetario: ");
		propetario.InfoPer();
	}
	public void verificarMayorEdad () {
		if (propetario.esMayorEdad()) {
			System.out.println("Es mayor de edad");
		}else {
			System.out.println("Es menoer de edad");
		}
	}
	
	
	
}
