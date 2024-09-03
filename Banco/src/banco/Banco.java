/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;


public class Banco {

    public static final int Num_clientes = 20;
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String u = new String();
        int c = 0;
        Cliente cli[] = new Cliente[Num_clientes];
        System.out.println("Ingrese el número de su tarjeta: ");
        u = keyboard.next();

        System.out.println("Ingrese la clave de su tarjeta:  ");
        c = keyboard.nextInt();
        while (cli.getclave()!= c || !cli.getTarjeta().equals(u)) {
            System.out.println("Datos incorrectos!");
            System.out.println("Ingrese el número de su tarjeta: ");
            u = keyboard.next();
              
    }
        System.out.println("Bienvenido!");
    
}
}