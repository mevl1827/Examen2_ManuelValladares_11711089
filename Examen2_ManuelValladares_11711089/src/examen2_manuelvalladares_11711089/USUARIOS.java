/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_manuelvalladares_11711089;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mevl1
 */
public class USUARIOS implements Serializable {

    //s tienen un id Usuario , primer nombre , segundo nombre , primer apellido ,una contraseña ,
    //segundo apellido , año de nacimiento , año de afiliación , 
    //transacciones que se han realizado sobre sus cuentas y cualquier otro atributo que usted considere necesario.
    private String user;
    private String nombre;
    private String nombre2;
    private String apellido;
    private String apellido2;
    private String contraseña;
    private Date nacimiento;
    private Date afiliacion;
    private ArrayList<Cuenta> cuentas;
    private double transacciones;
    private static final long serialVersionUID = 777L;

    public USUARIOS(String user, String nombre, String nombre2, String apellido, String apellido2, String contraseña, Date nacimiento, Date afiliacion, double transacciones) {
        this.user = user;
        this.nombre = nombre;
        this.nombre2 = nombre2;
        this.apellido = apellido;
        this.apellido2 = apellido2;
        this.contraseña = contraseña;
        this.nacimiento = nacimiento;
        this.afiliacion = afiliacion;
        this.transacciones = transacciones;
        this.cuentas=new ArrayList();
    }

 

    public USUARIOS() {
    }
    

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Date getAfiliacion() {
        return afiliacion;
    }

    public void setAfiliacion(Date afiliacion) {
        this.afiliacion = afiliacion;
    }

    public double getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(double transacciones) {
        this.transacciones = transacciones;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public String toString() {
        return  user;
    }
    
    
}
