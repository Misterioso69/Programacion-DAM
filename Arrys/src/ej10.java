import java.util.Arrays;

public class ej10 {
    public static void main(String[] args) {
        int a [] = new int[20];
        for (int i = 0; i < 20; i++) {
            a[i] = (int) Math.floor(Math.random() * 100+1);
        }
        System.out.println(Arrays.toString(a));
        int b [] = new int[20];
        int j = 0 ;
        int m = 19 ;
        for (int i = 0; i < 20; i++) {
            if (a[i]%2==0) {
                b[j++]=a[i];
            }
            else {
                b[m--]=a[i];
            }
        }
        a=b;
        System.out.println(Arrays.toString(a));
    }
}
