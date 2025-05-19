package EjemploAdemico;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class PrincipalAcademico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gson g = new Gson();
		Academico a1 = new Academico("Iker", 2005);
		String json = g.toJson(a1);
		System.out.println(json);
		 try (BufferedWriter bw = new BufferedWriter(new FileWriter("datos_academico.json"))) {
			 bw.write(json);
			 System.out.println("Fichero creado");
			 
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			 e.printStackTrace();
		}

	}

}
