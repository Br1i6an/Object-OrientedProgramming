/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String u = new String();
        int c = 0;
        Estudiante est1 = new Estudiante("pepito", 12345);

        System.out.println("Por favor ingrese su usuario: ");
        u = keyboard.next();

        System.out.println("Por favor ingrese su contraseña: ");
        c = keyboard.nextInt();
        
        Estudiante est2 = new Estudiante("Juanito", 147258);
        System.out.println("Número de estudiantes: " + est2.getNumEstudiantes());

        while (est1.getContraseña() != c || !est1.getUsuario().equals(u)) {
            System.out.println("Datos incorrectos!");
            System.out.println("Por favor ingrese su usuario: ");
            u = keyboard.next();

            System.out.println("Por favor ingrese su contraseña: ");
            c = keyboard.nextInt();
        }

        System.out.println("Bienvenido!");
        est1.llenarMaterias();
        est1.materiallenar();

        System.out.println("Las materias son: ");

        for (int i = 0; i < Estudiante.Num_materias; i++) {
            System.out.println("Nombre: " + est1.getMateria()[i].getNombre());
            System.out.println("Profesor: " + est1.getMateria()[i].getProfesor());
            System.out.println("Créditos: " + est1.getMateria()[i].getCréditos());

        }
       
    }

}
