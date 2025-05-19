package EjemploAdemico;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class PrincipalClub {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gson g = new Gson();
		Academico a1 = new Academico("Iker", 2005);
		Academico a2 = new Academico("Tomas", 2005);
		Academico a3 = new Academico("Jorge", 2005);
		List<Academico>lista = new ArrayList<Academico>();
		lista.addLast(a1);
		lista.add(a2);
		lista.add(a3);
		ClubAcademicos c1 = new ClubAcademicos(lista,"Club ajedrez",3);
		String json = g.toJson(c1);
		System.out.println(json);
		 try (BufferedWriter bw = new BufferedWriter(new FileWriter("datos_club_Academico.json"))) {
			 bw.write(json);
			 System.out.println("Fichero creado");
			 
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			 e.printStackTrace();
		}

	}
}
