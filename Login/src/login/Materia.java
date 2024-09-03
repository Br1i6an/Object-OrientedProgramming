/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

public class Materia {

    private String Nombre;
    private String Profesor;
    private int Créditos;

    private static final double notacorte = 3.0;

    public Materia() {
    }

    public Materia(String Nombre, String Profesor, int Créditos) {
        this.Nombre = Nombre;
        this.Profesor = Profesor;
        this.Créditos = Créditos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getProfesor() {
        return Profesor;
    }

    public void setProfesor(String Profesor) {
        this.Profesor = Profesor;
    }

    public int getCréditos() {
        return Créditos;
    }

    public void setCréditos(int Créditos) {
        this.Créditos = Créditos;
    }

}
