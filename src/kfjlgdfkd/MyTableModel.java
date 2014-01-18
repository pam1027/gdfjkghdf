/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kfjlgdfkd;

import cosa.Cuenta;
import cosa.CuentaNormal;
import cosa.CuentaPremium;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Alumno CG
 */
public class MyTableModel extends AbstractTableModel{
    
    private ArrayList<Cuenta> list = new ArrayList<>(); 
    private int cantidadColumnas = 4;
    private String[] nombre_columnas = {"Numero de cuenta", "Saldo", "Titular", "Tipo de cuenta"};

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return cantidadColumnas;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cuenta cuenta = list.get(rowIndex);
        switch (columnIndex){
            case 0: return cuenta.getNumeroCuenta();
                            
            case 1: return cuenta.getSaldo();
                
            case 2: return cuenta.getTitular();
                
            case 3:
                if (cuenta instanceof CuentaNormal) {
                    return "Cuenta Normal";                    
                } else{
                    return "Cuenta Premium";
                }
                
            default:
                throw new AssertionError();
            
        }
    }
    
    public void addRow(CuentaNormal cuenta){
        list.add(cuenta);
        this.fireTableDataChanged();
    }
    
    public void addRow(CuentaPremium cuenta){
        list.add(cuenta);
        this.fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        return nombre_columnas[column];
    }
    
    public void removeRow (int index){
        list.remove(index);
        this.fireTableDataChanged();
    }
    
    }
