/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cosa;

/**
 *
 * @author Alumno CG
 */
public class Cuenta {
    
    protected double saldo;
    protected double numeroCuenta;
    protected String titular;

    public Cuenta(double saldo, double numeroCuenta, String titular) {
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
    }

    public Cuenta(double numeroCuenta, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
    }
    
    
    public void abonar (double cantidad){
        this.saldo+=cantidad;
    }
    
    public void retirar (double cantidad){
        this.saldo-=cantidad;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(double numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    
    
}
