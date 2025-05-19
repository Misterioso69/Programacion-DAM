package ejercicio;

import java.io.*;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

public class Main {
	public static void main(String[] args) {
		try {
			Obra ac = new Obra(1, "Galeria1", "Marco", "oleo", "2025-04-23");
			JAXBContext contexto = JAXBContext.newInstance(Obra.class);
			Marshaller m = contexto.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(ac, new FileWriter("Obra.xml"));
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
