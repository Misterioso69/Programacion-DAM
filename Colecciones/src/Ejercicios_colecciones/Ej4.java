package Ejercicios_colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> area_res = new HashMap<String, String>();
		area_res.put("1234", "usuario");
		
		Scanner sc = new Scanner(System.in);
		boolean c = false;
		for(int i = 3 ; i>0;i--) {
			System.out.println("Escribe el usuario");
			String a = sc.nextLine();
			System.out.println("Escribe la contraseña");
			String b = sc.nextLine();
			if (area_res.containsKey(b) && area_res.get(b).equals(a) ) {
				c = true;
				break;
			}else {
				System.out.println("Te quedan "+(i-1)+" intentos");
			}
		}
		if(c) {
			System.out.println("Ha accedido al área restringida");
		}else {
			System.out.println("Lo siento, no tiene acceso al área restringida");
		}
	}

}
