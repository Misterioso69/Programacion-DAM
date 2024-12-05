public class Operaciones {
    public static boolean capi (String a){
        int b = a.length()-1;
        if (b!=3){
            return false;
        }else {
            if (a.charAt(0)==a.charAt(3)&&a.charAt(1)==a.charAt(2)){
                return true;
            }
        }
        return false;
    }
    public static boolean primo (int a){
        int cont = 0 ;
        for (int i = 1; i <= a; i++) {
            if (a%i==0){
               cont++;
            }
        }
        if (cont==2){return true;}
        return false;
    }
    public static int proxprimo (int a){
        int cont = 0 ;
        int b = 0 ;
        for (int i = a+1; i <= a+10; i++) {
            for (int j = 1; j <= i; j++) {
                if (i%j==0){
                    cont++;
                }
            }
            if (cont==2){
                b = i ;
                break;
            }
            cont = 0;
        }
        return b;
    }
    public static int digi (int a){
        int cont = 0 ;
        while (a>0){
            a = a/10;
            cont++;
        }
        return cont;
    }
    public static String volear (String a){
        String cont = "";
        for (int i = a.length()-1; i>= 0 ; i--){
            cont += a.charAt(i);
        }
        return cont;
    }
    public static String digitoN (int a ,int b){
        String cont = String.valueOf(a);
        if (a<0){
            b++;
        }
        return cont.charAt(b)+" ";
    }
    public static int pordetras (int a){
        return a/10;
    }
    public static int pordelante (int a){
        String cont = String.valueOf(a);
        String mes = "";
        for (int i = 1; i<= cont.length()-1 ; i++){
            mes += cont.charAt(i);
        }
        return Integer.parseInt(mes);
    }
    public static int pegarpordetras (int a ,int b){
        String cont = String.valueOf(a);
        String cont2 = String.valueOf(b);
        String mes = cont+cont2;
        return Integer.parseInt(mes);
    }
    public static int pegarpordelante (int a ,int b){
        String cont = String.valueOf(a);
        String cont2 = String.valueOf(b);
        String mes = cont2+cont;
        return Integer.parseInt(mes);
    }
}
