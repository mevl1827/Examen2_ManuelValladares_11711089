/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_manuelvalladares_11711089;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author mevl1
 */
public class Admin_Cuentas implements Serializable{
    ArrayList <Cuenta>cuentas;
    private static final long serialVersionUID = 777L;
    private File archivo = null;

    public Admin_Cuentas(String path) {
        archivo = new File(path);
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

   
    
    
    public void cargarArchivo() {
        cuentas = new ArrayList();
        Cuenta temp;
        try {
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {//cuando leo un archivo binario de manera infinita siempre va a tirar una exception
                    while ((temp = (Cuenta) objeto.readObject()) != null) {
                        cuentas.add(temp);
                    }
                } catch (EOFException e) {
                    //encuentra final de archivo
                }
                objeto.close();
                entrada.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Cuenta t : cuentas) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }

}
