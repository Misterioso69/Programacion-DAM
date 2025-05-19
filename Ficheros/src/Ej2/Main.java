package Ej2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main{
	public static void main(String[]args) {
		BufferedWriter es = null;
		BufferedReader le = null;
		BufferedReader le2 = null;
		try {
			List<Integer>lista = new ArrayList<Integer>();
			le =  new BufferedReader(new FileReader("numeros1.txt"));
			String linea = le.readLine();
			while(linea!=null) {
				Integer numeros = Integer.valueOf(linea);
				lista.add(numeros);
				linea = le.readLine();
			}
			le2= new BufferedReader(new FileReader("numeros2.txt"));
			String linea2 = le2.readLine();
			while(linea2!=null) {
				Integer numeros2 = Integer.valueOf(linea2);
				lista.add(numeros2);
				linea2 = le2.readLine();
			}
			Collections.sort(lista);
			es = new BufferedWriter(new FileWriter("ordenado.txt"));
			Iterator<Integer>i = lista.iterator();
			while(i.hasNext()) {
				Integer a = i.next();
				String b = a.toString();
				es.write(b);
				es.newLine();
			}
			System.out.println("Escritura finalizada");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				le.close();
				le2.close();
				es.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}