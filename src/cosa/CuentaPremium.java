/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cosa;

/**
 *
 * @author Alumno CG
 */
public class CuentaPremium extends Cuenta {

    public CuentaPremium(double saldo, double numeroCuenta, String titular) {
        super(saldo, numeroCuenta, titular);
    }

    public CuentaPremium(double numeroCuenta, String titular) {
        super(numeroCuenta, titular);
    }

    @Override
    public void abonar(double cantidad) {
        super.abonar(cantidad);
    }

    @Override
    public void retirar(double cantidad) {
        saldo-=cantidad;
    }
    
    
    
}
