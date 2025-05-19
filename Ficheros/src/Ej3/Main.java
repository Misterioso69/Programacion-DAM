package Ej3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		BufferedReader br ;
		try {
			int car = 0;
			int li =0;
			int pal=0;
			br = new BufferedReader(new FileReader("carta.txt"));
			String linea =  br.readLine();
			while(linea !=null) {
				String [] texto =  linea.split(" ");
				pal+=texto.length;
				li++;
				for (int i = 0; i < texto.length; i++) {
					for (int j = 0; j < texto[i].length(); j++) {
						car++;
					}
				}
				linea = br.readLine();
			}
			System.out.println("Las lineas son: "+li+" las palabras son: "+pal+" y los caracteres: "+car);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}