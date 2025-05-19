package ejercicio2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			Map<String, String[]>map = new HashMap<String, String[]>();
			String[] vacio = new String [0];
			map.put("palabra",vacio);
			map.put("frase", vacio);
			map.put("noPalindromo",vacio);
			br = new BufferedReader(new FileReader("palindromo.txt"));
			String linea = br.readLine();
			while(linea!=null) {
				String [] com = linea.split(" ");
				boolean es =false;
				String comp ="";
				for (int i = linea.length()-1; i >= 0; i--) {
					char a =  linea.charAt(i) ;
					if(a!=' ') {
						comp+=a;
					}
				}
				String aaa = "";
				for (int i = 0; i < linea.length(); i++) {
					char a =  linea.charAt(i) ;
					if(a!=' ') {
						aaa+=a;
					}
				}
				if(aaa.toLowerCase().equals(comp.toLowerCase())) {
					es =true;
				}
				
				if(com.length==1 && es) {
					String[] copia = map.get("palabra");
					String [] arreglo  = Arrays.copyOf(copia, copia.length+1);
					arreglo[arreglo.length-1]=linea;
					map.put("palabra",arreglo );
				}else if (com.length > 1 && es) {
					String[] copia1 = map.get("frase");
					String [] arreglo1  = Arrays.copyOf(copia1, copia1.length+1);
					arreglo1[arreglo1.length-1]=linea;
					map.put("frase",arreglo1 );
				}else {
					String[] copia1 = map.get("noPalindromo");
					String [] arreglo1  = Arrays.copyOf(copia1, copia1.length+1);
					arreglo1[arreglo1.length-1]=linea;
					map.put("noPalindromo",arreglo1 );
				}
				linea = br.readLine();
			}
			String [] vista = map.get("palabra");
			System.out.println("Palabra "+ Arrays.toString(vista));
			String [] vista1 = map.get("frase");
			System.out.println("Frase "+ Arrays.toString(vista1));
			String [] vista3 = map.get("noPalindromo");
			System.out.println("No Palindromo "+ Arrays.toString(vista3));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
