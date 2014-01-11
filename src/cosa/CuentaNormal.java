/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cosa;

/**
 *
 * @author Alumno CG
 */
public class CuentaNormal extends Cuenta {

    public CuentaNormal(double saldo, double numeroCuenta, String titular) {
        super(saldo, numeroCuenta, titular);
    }

    public CuentaNormal(double numeroCuenta, String titular) {
        super(numeroCuenta, titular);
    }

    @Override
    public void abonar(double cantidad) {
        super.abonar(cantidad);
        System.out.println("Ha habonado " +numeroCuenta);
    }

    @Override
    public void retirar(double cantidad) {
        if(cantidad>=saldo){
            saldo-=cantidad;
        }
    }
    
    
    
}
