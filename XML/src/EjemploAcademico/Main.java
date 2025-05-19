package EjemploAcademico;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JAXBContext contexto;
		try {
			contexto = JAXBContext.newInstance(ClubAcademicos.class);
			// Unmarshaller um = contexto.createUnmarshaller();
			// Academico a1 = (Academico) um.unmarshal(new File("Academico.txt"));
			List<Academico> lista = new ArrayList<Academico>();
			Academico a1 = new Academico("iker",2005);
			Academico a2 = new Academico("tomas",2005);
			Academico a3 = new Academico("jorge",2006);
			lista.add(a1);
			lista.add(a2);
			lista.add(a3);
			ClubAcademicos c1 = new ClubAcademicos(lista,"Club ajedrez",3);
			Marshaller m = contexto.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(c1, new FileWriter("Academicos.xml"));
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
