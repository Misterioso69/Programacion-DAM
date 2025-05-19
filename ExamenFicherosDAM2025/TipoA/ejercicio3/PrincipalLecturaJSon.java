package ejercicio3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

public class PrincipalLecturaJSon {

		public static void main(String[] args) {
			Gson gson = new Gson();
			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader("obras.json"));
				String linea = br.readLine();
				String total ="";
				while(linea!=null) {
					total+=linea;
					linea = br.readLine();
				}
				Galeria v = gson.fromJson(total, Galeria.class);
				System.out.println(v);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	

}
