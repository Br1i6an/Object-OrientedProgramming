/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

public class Cliente {
    private String tarjeta;
    private int clave;
    private Cuenta cuentas[];
    private static int numClientes = 0;
    public static final int Num_cuentas = 2;
    
    public Cliente(){
        
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public Cliente(String tarjeta, int clave, Cuenta[] cuentas) {
        this.tarjeta = tarjeta;
        this.clave = clave;
        this.cuentas = cuentas;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuenta(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

    public static int getNumClientes() {
        return numClientes;
    }

    public static void setNumClientes(int numClientes) {
        Cliente.numClientes = numClientes;
    }

}
