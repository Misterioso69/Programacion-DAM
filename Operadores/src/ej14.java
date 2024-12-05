import java.util.Scanner;

public class ej14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Increse su año de nacimiento");
        int a = sc.nextInt();
        boolean res = a>= 1928 && a<=1945? true : false;
        boolean res1 = a>= 1946 && a<=1964? true : false;
        boolean res2 = a>= 1965 && a<=1980? true : false;
        boolean res3 = a>= 1981 && a<=1996? true : false;
        boolean res4 = a>= 1997 && a<=2012? true : false;
        boolean res5 = a>= 2012? true : false;
        String m = res? "Generacion Silenciosa" : res1? "Baby Boomers" : res2? "Generacion X" : res3? "Generacion Y / Millenials"
                : res4? "Generacion Z" : res5? "Generacion alfa" : "error" ;
        System.out.println(m);
    }
}
