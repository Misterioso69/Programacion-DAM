package Ej2_Repaso;

import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo [] vehiculo = new Vehiculo[] {
			new Vehiculo("1234ABC", 2015, "Rojo", 5, "Toyota"),
            new Vehiculo("5678XYZ", 2018, "Azul", 4, "Ford"),
            new Vehiculo("4321DEF", 2020, "Blanco", 7, "Toyota"),
            new Vehiculo("8765LMN", 2017, "Negro", 5, "Ford") };
		
		Arrays.sort(vehiculo);
		for (int i = 0 ;i<vehiculo.length;i++) {
			System.out.println(vehiculo[i]);
		}
		System.out.println();
		Arrays.sort(vehiculo, new Comparar_Marca());
		for (int i = 0 ;i<vehiculo.length;i++) {
			System.out.println(vehiculo[i]);
		}
		System.out.println();
		Arrays.sort(vehiculo, new Comparar_Plazas());
		for (int i = 0 ;i<vehiculo.length;i++) {
			System.out.println(vehiculo[i]);
		}
		System.out.println();
		Arrays.sort(vehiculo, new Comparar_Anio());
		for (int i = 0 ;i<vehiculo.length;i++) {
			System.out.println(vehiculo[i]);
		}
	}

}
