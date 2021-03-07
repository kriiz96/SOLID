package SingleResponsability.Soluction;

/**
 *
 * @author kriiz
 */
public class IVA {
    
    double IVA = 0.12;
    
    public double IVA (int a){
        return a * IVA;
    }
    
    public double Subtotal (int a){
        return a - (a * IVA);
    }
}
