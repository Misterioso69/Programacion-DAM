package primoh;



public class primo {

	public static void main(String[] args) {
		primeNumber(100000007);
		System.out.print(primoh(100000007));

	}
	public static void primeNumber(int num) {
	    boolean prime = true; 
	    for(int i = 2; i < num; i++) {
	        if (num % i == 0) {
	            prime = false;
	            break;
	        }
	    }
	    if (prime)
	    	System.out.println("The number is prime.");
	    else
	        System.out.println("The number isn't prime.");
	}
	public static boolean primoh(int a ) {
		int i = 2;
		if (a<=1) return false;
			while (i<Math.sqrt(a)){
				if(a%i==0) return false;
				i++;
			}
		return true;
		
	}
}
