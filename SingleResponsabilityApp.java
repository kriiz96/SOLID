/*Solucion de Single Responsability
 * El Single Responsability dice que una clase debe tener una sola responsabilidad.
 * Al separar el calculo del Iva y el Subtotal
 * Y dejando en otra clase la impresion en consola de los datos
 * cada clase tiene una sola responsabilidad si se quiere cambiar algo
 * solo se hara en la clase necesaria sin modificar algo mas.
 */

package SingleResponsability.Soluction;

import SingleResponsability.Factura;

/**
 *
 * @author kriiz
 */
public class SingleResponsabilityApp {
    
    public static void main (String[]args){
        Factura Fac = new Factura();
        IVA iva = new IVA();
        
        System.out.println("Factura 1: " + Fac.ImprimirIva(iva.IVA(1000)) );
        System.out.println("Factura 1: " + Fac.ImprimirSubtotal(iva.Subtotal(1000)));
        System.out.println("Factura 2: " + Fac.ImprimirIva(iva.IVA(1500)) );
    }
    
}
