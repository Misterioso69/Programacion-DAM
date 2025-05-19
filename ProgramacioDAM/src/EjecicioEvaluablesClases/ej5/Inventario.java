package EjecicioEvaluablesClases.ej5;
public class Inventario {
    private String [] produtos;
    private int [] cantidad;
    private int cont;
    public Inventario( int capa) {
        this.produtos = new String[capa];
        this.cantidad = new int[capa];
        this.cont = 0;
    }
    public void registrarPro(String nombre , int canti){
        for(int i = 0 ; i<produtos.length;i++){
            if(produtos[i]!=null && produtos[i].equals(nombre)){
                cantidad[i]+=canti;
                return;
            }
        }
        if(cont<produtos.length){
            produtos[cont]=nombre;
            cantidad[cont]+=canti;
            cont++;
        }else{
            System.out.println("No hay espacio haz la funcion 'aumentarInve'");
        }
    }
    public void aumentarInve(){
        String[] arreglo = new String[produtos.length+1];
        int[] arreglo2 = new int[produtos.length+1];
        System.arraycopy(produtos, 0, arreglo, 0, produtos.length);
        System.arraycopy(cantidad, 0, arreglo2, 0, cantidad.length);
        produtos=arreglo;
        cantidad = arreglo2;
    }
    public void mostrar(String nombre){
        boolean res = false;
        for(int i = 0 ; i<produtos.length;i++){
            if(produtos[i].equals(nombre)){
                System.out.println(produtos[i]+" y la cantidad es "+cantidad[i]);
                res=true;
            }
        }
        if(!res){
            System.out.print("Producto no encontrado");
        }
    }
    public void reducirInve(String nombre,int canti){
        boolean res = false;
        for(int i = 0 ; i<produtos.length;i++){
            if(produtos[i].equals(nombre)){
               if (cantidad[i]>canti){
                   cantidad[i]-=canti;
                   res=true;
               }else {
                   System.out.println("No hay suficiente producto");
               }
            }
        }
        if(!res){
            System.out.print("Producto no encontrado");
        }
    }
    
    public void valorTo(double[] valor){
        double valortotal = 0;
        if(valor.length!=produtos.length){
            System.out.println("No es del tamaño correcto");
            return;
        }
        for (int i = 0; i < produtos.length; i++) {
            valortotal += cantidad[i] * valor[i];
        }
        System.out.println("El valor del iventario  es: "+valortotal);
    }
}