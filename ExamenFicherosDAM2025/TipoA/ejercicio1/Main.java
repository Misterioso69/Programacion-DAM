package ejercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static final String nom_archivo = "obras.txt"; //Creamos el nombre del archivo para que no haya ninguna confusion
	private static Scanner sc = new Scanner(System.in);
	private static List<Obra>lista = new ArrayList<Obra>();
	
	public static void main(String[] args) {
		leer();
		menu();
	}
	
	public static void leer() { // Esta funcion lee todo lo del fichero y lo almacena en la Lista
		BufferedReader br = null;
		BufferedWriter crear = null;
		try {
			crear = new BufferedWriter(new FileWriter(nom_archivo,true)); // Este Buffer crea el fichero si no esta y si esta hace como si nada
			br= new BufferedReader(new FileReader(nom_archivo));
			String linea  = br.readLine();
			while(linea!=null) { // Leemos el fichero
				String [] a = linea.split(",");
				if(a.length==5) {
					Obra o = new Obra(Integer.parseInt(a[0]),a[1],a[2],a[3],a[4]); // Creamos las Obras para guardarlo en la Lista
					lista.add(o);
				}
				linea = br.readLine();
			}
			Collections.sort(lista);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Fichero no creado");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				crear.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void menu() { // Esta funcion nos da elegir una opcion o si no nos trae de vuelta
		System.out.println("1.Alta obra");
		System.out.println("2.Baja obra");
		System.out.println("3.Listar obras");
		System.out.println("4.Salir");
		System.out.print("Elige una opcion: ");
		int a = sc.nextInt();
		switch(a) {
			case 1 : altaobra();
				break;
			case 2: bajaobra();
				break;
			case 3 : mostrar();
				break;
			case 4 : salir();
				break;
			default : System.out.println("\nOpcion no valida\n");
				menu();
		}
	}
	public static void altaobra() { //Esta funcion genera una obra si no esta ya escrito el id
		System.out.println("Dime el id de la nueva obra");
		int id = sc.nextInt();
		boolean esta = false;
		Iterator<Obra> i = lista.iterator();
		while(i.hasNext()) { // Miramos si el id esta ya guardado
			Obra o = i.next();
			if(o.getId()==id) {
				esta=true;
			}
		}
		if(esta) {
			System.out.println("El id ya se encuentra regristrado\n");
			menu();
		}else {
			sc.nextLine();
			System.out.println("Dime el titulo de la nueva obra");
			String ti = sc.nextLine();
			System.out.println("Dime el autor de la nueva obra");
			String au = sc.nextLine();
			System.out.println("Dime la tecnica de la nueva obra");
			String tec = sc.nextLine();
			System.out.println("Dime la fecha de creacion de la nueva obra");
			String fec = sc.nextLine();
			Obra ob = new Obra(id,ti,au,tec,fec);
			lista.add(ob); // Guarda la obra creada y retorna al menu
			System.out.println("Obra guardada\n");
			menu();
		}
	}
	public static void bajaobra() {
		sc.nextLine();
		System.out.println("Dime el id de la obra a borrar");
		int id =  sc.nextInt();
		boolean esta = false;
		Iterator<Obra>i = lista.iterator();
		while(i.hasNext() && !esta) { // Se busca el id a borrar
			Obra o = i.next();
			if( o.getId() == id) {
				lista.remove(0);
				esta=true;
			}
		}
		if(esta) {
			System.out.println("Se ha borrado corectamente\n");
			menu();
		}else {
			System.out.println("Id no encontrado\n");
			menu();
		}
	}
	public static void mostrar() { // Esta funcion muestra todo lo que haya en la lista de una forma
		Collections.sort(lista);
		Iterator<Obra>i = lista.iterator();
		while(i.hasNext()) {
			Obra o = i.next();
			System.out.println("autor: "+o.getAutor()+" titulo:  "+o.getTitulo()+" tecnica: "+o.getTenica()+" fecha de creacion: "+o.getFecha_creacion());
		}
		System.out.println();
		menu();
	}
	public static void salir () { // Escribe todo lo de la Lista en el fichero ya creado sobreescribiendo
		BufferedWriter bw = null ;
		try {
			bw = new BufferedWriter(new FileWriter(nom_archivo));
			Iterator<Obra>i = lista.iterator();
			while(i.hasNext()) {
				Obra o = i.next();
				bw.write(String.valueOf(o.getId())+","+o.getTitulo()+","+o.getAutor()+","+o.getTenica()+","+o.getFecha_creacion());
				bw.newLine();
			}
			System.out.println("Escritura finalizada\nCierre del programa");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
