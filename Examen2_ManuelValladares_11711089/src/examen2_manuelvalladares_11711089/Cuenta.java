/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_manuelvalladares_11711089;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author mevl1
 */
public class Cuenta implements Serializable{

    //la Cuenta tiene el siguiente atributo NumCuenta , saldo disponible , Id del usuario propietario
    private String num;
    private double saldo;
    private String id_prop;
   private static final long serialVersionUID = 777L;
    public Cuenta(String num, double saldo, String id_prop) {
        this.num = num;
        this.saldo = saldo;
        this.id_prop = id_prop;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getId_prop() {
        return id_prop;
    }

    public void setId_prop(String id_prop) {
        this.id_prop = id_prop;
    }

    @Override
    public String toString() {
        return  num ;
    }
    
    
}
