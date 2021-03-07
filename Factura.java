package SingleResponsability;

/**
 *
 * @author kriiz
 */
public class Factura {
    
    double IVA = 0.12;
    
    public double IVA (int a){
        return a * IVA;
    }
    
    public double Subtotal (int a){
        return a - (a * IVA);
    }
    
    public String ImprimirIva (double result) {
    return "IVA: " 
            +result;
}
    
    public String ImprimirSubtotal (double result) {
    return "Subtotal: " 
            +result;
}
    
}
