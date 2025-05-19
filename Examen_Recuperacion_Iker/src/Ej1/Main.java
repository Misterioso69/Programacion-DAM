package Ej1;

import Ej1.Estrenos.Genero;

public class Main {

	public static void main(String[] args) throws VideoClubException {
		// TODO Auto-generated method stub
		Estrenos e1 = new Estrenos("001","titulo","autor",120,false, Genero.accion);
		Clasicas c1 = new Clasicas("002","titulo","auto",130,false,1980);
		
		VideoClub v1 = new VideoClub(10, e1,c1);
		
		try {
			v1.alquilarPelicula("001");
		}catch (VideoClubException e){
			
		}
		
		
	}

}
