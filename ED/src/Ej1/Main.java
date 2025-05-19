package Ej1;

import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
	}
	public static void mirarigual (List<String>a ,List<String>b) {
		if (a.size()==b.size()) {
			Iterator<String> i = b.iterator();
			int cont=0;
			while(i.hasNext()) {
				String c = i.next();
				if(c.equals(a.indexOf(cont))) {
					Iterator<String>it = a.iterator();
					while(it.hasNext()) {
						String d = it.next();
						if(!c.equals(b.indexOf(b.size()-1))) {
							
						}
					}
				}
			}
		}else {
			System.out.println("No son iguales");
		}
	}

}
