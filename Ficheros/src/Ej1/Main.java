package Ej1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedWriter es = null;
		try {
			System.out.println("Introduce tu edad");
			String eda = sc.nextLine();
			System.out.println("Introduce tu nombre");
			String nom = sc.nextLine();
			es = new BufferedWriter(new FileWriter("datos.txt", true));
			es.write("Nombre: "+nom+" , edad: "+eda);
			es.newLine();
			System.out.println("Fin de escritura");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				es.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}