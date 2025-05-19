package Ej1;

public class Main {
    public static void main(String[] args) {
        Caja caja = new Caja(50, 30, 20, Caja.Unidad.cm);
        caja.setEtiqueta("Caja de herramientas");
       
        Cajacarton cajacarton = new Cajacarton(2, 1, 1, Caja.Unidad.m);
        cajacarton.setEtiqueta("Caja de cartón para mudanza");
        
   
        System.out.println("Información de la caja:");
        System.out.println(caja);
        System.out.println("Volumen de la caja: " + caja.getVolumen() + " " + caja.getUnidad());
        
      
        System.out.println("\nInformación de la caja de cartón:");
        System.out.println(cajacarton);
        System.out.println("Volumen de la caja de cartón: " + cajacarton.getVolumen() + " " + cajacarton.getUnidad());
        System.out.println("Superficie de la caja de cartón: " + cajacarton.getSuperficie() + " m²");
    }
}
