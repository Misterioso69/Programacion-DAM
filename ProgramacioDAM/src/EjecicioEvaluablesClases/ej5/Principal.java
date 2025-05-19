package EjecicioEvaluablesClases.ej5;

public class Principal {
    public static void main(String[] args) {
        Inventario i = new Inventario(5);
        i.registrarPro("Legia",10);
        i.registrarPro("coco",20);
        i.registrarPro("piña",10);
        i.registrarPro("pera",10);
        i.registrarPro("manza",10);
        i.registrarPro("sandia",10);
        i.aumentarInve();
        i.registrarPro("sandia",10);
        i.reducirInve("sandia",5);
        i.reducirInve("pera",5);
        i.registrarPro("pera",15);
        i.mostrar("sandia");
        i.mostrar("pera");
        double[]valot ={10,25,15,48};
        i.valorTo(valot);
        double[]valot2 ={10,10,10,10,10,10};
        i.valorTo(valot2);
    }
}