package EjemploAdemico;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

public class LeerFichero_Club {
	public static void main(String[] args) {
		Gson g = new Gson();
		String fichero ="";
		try (BufferedReader br = new BufferedReader(new FileReader("datos_club_Academico.json"))){
			String linea;
			while((linea =br.readLine()) != null) {
				fichero += linea;
			}
			System.out.println(fichero);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
