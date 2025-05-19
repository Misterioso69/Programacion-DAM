package EjecicioEvaluablesClases.ej2;

public class Cambio {
    private float[] euro = {500f, 200f, 100f, 50f, 20f, 10f, 5f, 2f, 1f, 0.5f, 0.2f, 0.1f, 0.05f, 0.02f, 0.01f};
    private int[] cant = new int[15];  
    private float precio;
    private float pago;

    // Getters y setters
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPago() {
        return pago;
    }

    public void setPago(float pago) {
        this.pago = pago;
    }

    @Override
    public String toString() {
        return "Cambio [precio=" + precio + ", pago=" + pago + "]";
    }

    public Cambio() {
        super();
    }

    public Cambio(float precio, float pago) {
        this.precio = precio;
        this.pago = pago;
    }
    
    public float Resto() {
        return pago - precio;
    }
    
    public void infoCambio() {
        float rest = Resto();
        
        if (rest == 0f) {
            System.out.println("El pago es igual al precio, no hay cambio");
        } else if (rest < 0f) {
            System.out.println("El pago no es suficiente para cubrir el precio.");
            return;
        } else {
            for (int i = 0; i < euro.length; i++) {
                if (rest >= euro[i]) {
                    cant[i] = (int) (rest / euro[i]);
                    rest -= cant[i] * euro[i];
                }
            }
            System.out.println("El cambio es de:");
            for (int i = 0; i < euro.length; i++) {
                if (cant[i] > 0) {
                    System.out.print(cant[i]);
                    if (i <= 6) {
                        System.out.println(" billetes de " + euro[i] + "€");
                    } else { 
                        System.out.println(" monedas de " + euro[i] + "€");
                    }
                }
            }
        }
    }
}

