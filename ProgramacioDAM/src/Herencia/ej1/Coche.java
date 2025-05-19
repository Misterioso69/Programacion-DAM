package Herencia.ej1;

public class Coche extends Vehiculo{
	
	private int km_coche;

	@Override
	public String toString() {
		return "Has recorrido en coche " + km_coche + "km";
	}

	public int getKm_coche() {
		return km_coche;
	}

	public void setKm_coche(int km_coche) {
		this.km_coche = km_coche;
	}
	
	
	public void andaConCoche (int km_recorrido) { 
		
		km_coche += km_recorrido;
		super.setKilometrosTotales(super.getKilometrosTotales()+km_coche);
		
	}
	
	public void quemaRueda (int t_quemaRueda) {
		
		int km_recorrido = t_quemaRueda * 2;
		
		
		km_coche += km_recorrido;
		super.setKilometrosTotales(super.getKilometrosTotales()+km_coche);
		
	}
	
	public int totalcoche () {
		
		return km_coche;
		
	}

}

