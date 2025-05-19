package Ej4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		BufferedWriter bwes = null;
		BufferedWriter bw = null;
		BufferedReader br = null;
		Scanner sc = new Scanner(System.in);
		try {
			bwes = new BufferedWriter(new FileWriter("firmas.txt", true));
			List<String> listanom = new ArrayList<String>();
		
			br = new BufferedReader(new FileReader("firmas.txt"));
			String linea = br.readLine();
			if (linea != null) {
				System.out.println("Esta es la lista de las frimas:");
				while (linea != null) {
					listanom.add(linea);
					System.out.println(linea);
					linea = br.readLine();
				}
			}
			bw = new BufferedWriter(new FileWriter("firmas.txt", true));
			String nom = null;
			while (nom == null || !nom.equals("-1")) {
				System.out.println("Dame tu nombre (-1 para finaliza) ");
				nom = sc.nextLine();
				if (nom.equals("-1")) {
					System.out.println("Escritura finalisada");
					break;
				} else if (listanom.isEmpty()) {
					listanom.add(nom);
					bw.write(nom);
					bw.newLine();
				} else {
					Iterator<String> i = listanom.iterator();
					boolean esta = false;
					while (i.hasNext()) {
						String b = i.next();
						if (b.equals(nom)) {
							esta = true;
						}
					}
					if (esta) {
						System.out.println("Repe");
					} else {
						listanom.add(nom);
						bw.write(nom);
						bw.newLine();
					}
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {

			try {
				bw.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}