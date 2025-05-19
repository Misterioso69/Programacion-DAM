package Examen;

import java.util.Arrays;

public class Bibloteca{
	
	public int findPermutationsOfONE(String str) {
		
		return 0;
	}
	
	public static int[] findCommons(int[] arr1, int[] arr2) {
		int[] arreglo = new int[500];
		int cont = 0;
		for(int i = 0 ; i<arr1.length;i++) {
			boolean esta = false;
			for(int j = 0 ; j<arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					esta=true;
				}
			}
			if(esta) {
				arreglo[cont]=arr1[i];
				cont++;
			}
		}
		int []a = Arrays.copyOf(arreglo, cont);
		return a;
	}

	public static int[] findSpaces(String str) {
		int [] arreglo = new int[500];
		int cont = 0 ;
		for(int i = 0 ; i<str.length();i++) {
			char a = str.charAt(i);
			if(a==' ') {
				arreglo[cont]=i;
				cont++;
			}
		}
		
		int a [] =Arrays.copyOf(arreglo, cont);
		return a;
	}
	
	
	public static String decolumnize(String twoColumnsText) {
		String [] arreglo = new String[100];
		int cont = 99;
		String textf="";
		String [] a = twoColumnsText.split("\n");
		for(int i = 0 ; i <a.length;i++) {
			String b = a[i];
			for(int j = 0 ; j<b.length()/2+1;j++) {
				char c = b.charAt(j);
				textf+=c;
				
				
			}
			String sum="";
			for(int j = b.length()/2+2 ; j<b.length();j++) {
				char c = b.charAt(j);
					sum+=c;	
			}
			arreglo[cont]=sum;
			cont--;
		}
		
		for(int i = 0 ; i<arreglo.length;i++) {
			if(arreglo[i]!=null) {
				textf+=arreglo[i];
			}
		}
		return textf;
		
	}

	
}