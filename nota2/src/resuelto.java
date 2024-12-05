
import java.util.Arrays;
import java.util.Scanner;

public class resuelto {

    public static void main(String[] args) {
        int ranking[]=new int[0];
        int numCorredores;
        int dorsalOriginal;
        Scanner sc=  new Scanner(System.in);
        System.out.print("Introduce dorsales de corredores, -1 para salir");
        dorsalOriginal=sc.nextInt();
        while(dorsalOriginal!=-1) {
            int copy[]=Arrays.copyOf(ranking, ranking.length+1);
            copy[copy.length-1]=dorsalOriginal;
            ranking=copy;
            System.out.print("Introduce dorsales de corredores, -1 para salir");
            dorsalOriginal=sc.nextInt();

        }

        System.out.println(Arrays.toString(ranking));

        System.out.println("Dorsales de los menores de edad (-1 para acabar)");
        int dorsal = sc.nextInt();
        while (dorsal != -1) {
            avanza1Puesto(ranking, dorsal);
            System.out.println(Arrays.toString(ranking)); //comprobamos el ranking
            System.out.println("Dorsales de los menores de edad (-1 para acabar)");
            dorsal = sc.nextInt();
        }

        System.out.println("Dorsales positivos en antidoping (-1=fin)");
        dorsal = sc.nextInt();
        while (dorsal != -1) {
            ranking = eliminaOrdenado(ranking, dorsal);
            System.out.println(Arrays.toString(ranking));
            System.out.println("Dorsales positivos en antidoping (-1=fin)");
            dorsal = sc.nextInt();
        }

        System.out.println("Dorsales que no han pagado (-1=fin)");
        dorsal = sc.nextInt();
        while (dorsal != -1) {
            ultimoPuesto(ranking, dorsal);
            System.out.println(Arrays.toString(ranking));
            System.out.println("Dorsales que no han pagado (-1=fin)");
            dorsal = sc.nextInt();
        }

        System.out.println("--- Medallero ---");
        if (ranking.length >= 1) {
            System.out.println("Oro: " + ranking[0]);
        }
        if (ranking.length >= 2) {
            System.out.println("Plata: " + ranking[1]);
        }
        if (ranking.length >= 2) {
            System.out.println("bronce: " + ranking[2]);
        }
    }

    static void avanza1Puesto(int ranking[], int dorsal) {
        int posicion = busca(ranking, dorsal);

        if (posicion == -1) {
            System.out.println("Error: el dorsal " + dorsal + " no existe.");
        } else {
            if (posicion != 0) {
                int aux = ranking[posicion - 1];
                ranking[posicion - 1] = ranking[posicion];
                ranking[posicion] = aux;
            }
        }
    }

    static int busca(int t[], int clave) {
        int posicion = -1;
        int i = 0;
        while (i < t.length && t[i] != clave) {
            i++;
        }

        if (i < t.length) {
            posicion = i;
        }

        return posicion;
    }

    static int[] eliminaOrdenado(int t[], int clave) {
        int posicion = busca(t, clave);

        if (posicion == -1) {
            System.out.println("Error: el dorsal " + clave + " no existe.");
        } else {

            System.arraycopy(t, posicion + 1, t, posicion, t.length - posicion - 1);
            t = Arrays.copyOf(t, t.length - 1);
        }

        return t;
    }

    static void ultimoPuesto(int ranking[], int dorsal) {
        int posicion = busca(ranking, dorsal);

        if (posicion == -1) {
            System.out.println("Error: el dorsal " + dorsal + " no existe.");
        } else {
            System.arraycopy(ranking, posicion + 1,
                    ranking, posicion, ranking.length - posicion - 1);
            ranking[ranking.length - 1] = dorsal;
        }
    }
}