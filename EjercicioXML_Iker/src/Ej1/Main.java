package Ej1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class Main {
	public static void main(String[] args) {
		JAXBContext contexto;
		try {
			contexto = JAXBContext.newInstance(Galeria.class);
			Set<Obra>lista = new HashSet<Obra>();
			Obra o1 = new Obra(1,"obra1","autor1","tecnica1","fecha1");
			Obra o2 = new Obra(2,"obra2","autor2","tecnica2","fecha2");
			Obra o3 = new Obra(2,"obra3","autor3","tecnica3","fecha3");
			Obra o4 = new Obra(4,"obra4","autor4","tecnica4","fecha4");
			lista.add(o1);
			lista.add(o2);
			lista.add(o3);
			lista.add(o4);
			Galeria g = new Galeria(lista);
			Marshaller m = contexto.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			m.marshal(g, new FileWriter("obras.xml"));

		} catch (JAXBException | IOException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
