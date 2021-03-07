/*Problema de Single Responsability
 * Cuando se calcula el iva y subtotal de una factura en un misma clase.
 * El problema es que si cambia en % del Iva se tiene que modificar toda la clase o si se quiere
 * cambiar el mensaje en consola o valores.
 * Imprime el total del iva y subtotal.
 */

package SingleResponsability;

/**
 *
 * @author kriiz
 */
public class SingleResponsabilityApp {
    
    public static void main (String[]args){
        Factura Fac = new Factura();
        System.out.println("Factura 1: " + Fac.ImprimirSubtotal(Fac.Subtotal(1000))+ " "+ Fac.ImprimirIva(Fac.IVA(1000)));
        System.out.println("Factura 2: " + Fac.ImprimirSubtotal(Fac.Subtotal(1500))+ " "+ Fac.ImprimirIva(Fac.IVA(1500)));
    }
}
