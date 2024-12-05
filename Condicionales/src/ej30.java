public class ej30 {
    public static void main(String[] args) {
        int dado1 =(int)(Math.random()*6+1);
        int dado2 =(int)(Math.random()*6+1);
        int dado3 =(int)(Math.random()*6+1) ;
        System.out.println(dado1);
        System.out.println(dado2);
        System.out.println(dado3);
        if (dado1== 6 && dado2== 6 && dado3== 6){
            System.out.println("Excelente");
        }else if (dado1==6 && dado2==6 && dado3!=6||dado1==6 && dado2!=6 && dado3==6||dado1!=6 && dado2==6 && dado3==6){
            System.out.println("Muy bien");
        } else if (dado1==6 || dado2==6 || dado3==6) {
            System.out.println("Regular");
        }else {
            System.out.println("Pesimo");
        }
    }
}
