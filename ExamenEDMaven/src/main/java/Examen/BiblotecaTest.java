package Examen;

import org.junit.Assert;
import org.junit.Test;


public class BiblotecaTest {
	
	@Test
	public  void findCommonsTest() {
		int [] arr1 = {3, 14, 18, 20, 23, 29, 33 };
		int [] arr2 = {9, 13, 17, 18, 20, 28, 32};
		int [] c = Bibloteca.findCommons(arr1, arr2);
		int[] f = {18,20};
		Assert.assertArrayEquals(f,c);
	}
	
	@Test
	public  void findSpacesTest() {
		String a ="I’m dishonest, and a to watch out for,\n";
		int [] d = Bibloteca.findSpaces(a);
		int[] f = {3,14,18,20,23,29,33};
		Assert.assertArrayEquals(f, d);
	}
}
