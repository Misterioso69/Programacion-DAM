package Herencia.ej1;

public class Bicicleta extends Vehiculo{
	
	private int km_bici;

	public int getKm_bici() {
		return km_bici;
	}

	public void setKm_bici(int km_bici) {
		this.km_bici = km_bici;
	}
	
	
	public void andaConLaBicicleta (int km_recorrido) { 
		
		km_bici += km_recorrido;
		super.setKilometrosTotales(super.getKilometrosTotales()+km_bici);
	}
	
	public void caballito (int t_caballito) {
		
		int km_recorrido = t_caballito * 2;
		
		
		km_bici += km_recorrido;
		super.setKilometrosTotales(super.getKilometrosTotales()+km_bici);
		
	}

	public int totalbici () {
		
		return km_bici;
		
	}
	
	public String toString() {
		return "Has recorrido en bicicleta " + km_bici + "km";
	}

}