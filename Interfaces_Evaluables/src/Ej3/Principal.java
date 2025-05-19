package Ej3;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
        Futbolista f1 = new Futbolista("12345678A", "Futbolista1", 35, 700);
        Futbolista f2 = new Futbolista("87654321B", "Futbolista2", 38, 800);
        Futbolista f3 = new Futbolista("11223344C", "Futbolista3", 31, 400);
        Futbolista f4 = new Futbolista("55667788D", "Futbolista4", 24, 300);
        
        Futbolista[] futbolistas = {f1, f2, f3, f4};

        System.out.println("Lista original de futbolistas:");
        for (int i = 0 ;i<futbolistas.length;i++) {
            System.out.println(futbolistas[i]);
        }

        
        System.out.println("\nLista ordenada por DNI:");
       
        Arrays.sort(futbolistas);
        for (int i = 0 ;i<futbolistas.length;i++) {
            System.out.println(futbolistas[i]);
        }

        System.out.println("\nLista ordenada por nombre:");
        Arrays.sort(futbolistas, Futbolista.ordenar_nombre);
        for (int i = 0 ;i<futbolistas.length;i++) {
            System.out.println(futbolistas[i]);
        }
        
        System.out.println("\nLista ordenada por edad:");
        Arrays.sort(futbolistas, Futbolista.ordenar_edad);
        for (int i = 0 ;i<futbolistas.length;i++) {
            System.out.println(futbolistas[i]);
        }
    }
}