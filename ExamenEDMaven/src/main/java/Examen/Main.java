package Examen;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {3, 14, 18, 20, 23, 29, 33 };
		int [] arr2 = {9, 13, 17, 18, 20, 28, 32};
		int [] c = Bibloteca.findCommons(arr1, arr2);
		System.out.println(Arrays.toString(c));
		
		
		String a ="I’m dishonest, and a to watch out for,\n";
		int [] d = Bibloteca.findSpaces(a);
		System.out.println(Arrays.toString(d));
		String aa ="dishonest man you    because you can";
		int [] dd = Bibloteca.findSpaces(aa);
		System.out.println(Arrays.toString(dd));
		
		String qq =  
				"I’m dishonest, and a to watch out for,   \n"+
                "dishonest man you    because you can     \n"+
                "can always trust to  never predict when  \n" +
                "be dishonest.        they’re going to do \n" +
                "Honestly, it’s the   something incredibly\n" +
                "honest ones you want stupid.             \n";
		System.out.println(Bibloteca.decolumnize(qq));
	}

}
