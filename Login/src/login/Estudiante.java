/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.util.Scanner;

public class Estudiante {

    private String usuario;
    private int contraseña;
    private Materia materia[];
    private static int numEstudiantes = 0;
    public static final int Num_materias = 7;

    public Estudiante() {

    }

    public static int getNumEstudiantes() {
        return numEstudiantes;
    }

    public static void setNumEstudiantes(int numEstudiantes) {
        Estudiante.numEstudiantes = numEstudiantes;
    }

    public Estudiante(String u, int c) {
        this.usuario = u;
        this.contraseña = c;
        this.materia = new Materia[Num_materias];
        for (int i = 0; i < Num_materias; i++) {
            this.materia[i] = new Materia();
        }

        numEstudiantes++;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public Materia[] getMateria() {
        return materia;
    }

    public void setMateria(Materia[] materia) {
        this.materia = materia;
    }

    public void llenarMaterias() {
        materia[0].setNombre("Calculo");
        materia[0].setProfesor("Nury");
        materia[0].setCréditos(3);

        materia[1].setNombre("Ingles");
        materia[1].setProfesor("Duncan");
        materia[1].setCréditos(2);

        materia[2].setNombre("Fisica");
        materia[2].setProfesor("Nohora");
        materia[2].setCréditos(3);

    }

    public void materiallenar() {
        Scanner keyboard = new Scanner(System.in);
        String nombre;
        String profesor;
        int creditos;
        for (int i = 3; i < Num_materias; i++) {
            System.out.println("Nombre de la materia: ");
            nombre = keyboard.next();
            materia[i].setNombre(nombre);

            System.out.println("Nombre de la profesor: ");
            profesor = keyboard.next();
            materia[i].setProfesor(profesor);

            System.out.println("Número de creditos: ");
            creditos = keyboard.nextInt();
            materia[i].setCréditos(creditos);
        }

    }
}
