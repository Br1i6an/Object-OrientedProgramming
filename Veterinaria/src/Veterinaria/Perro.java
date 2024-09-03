/*
 * 
 */
package Veterinaria;

public class Perro {

    private String raza;
    private int edad;
    private String color;
    private String nombre;
    private String enfermedad;

    public Perro(String raza, int edad, String color, String nombre, String enfermedad) {
        this.raza = raza;
        this.edad = edad;
        this.color = color;
        this.nombre = nombre;
        this.enfermedad = enfermedad;
    }

    public Perro() {
        

    }
     public String getraza() {
        return raza;
    }

    public void setraza(String raza) {
        this.raza = raza;
    }

    public int getedad() {
        return edad;
    }

    public void setedad(int edad) {
        this.edad = edad;
    }

    public String getcolor() {
        return color;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getenfermedad() {
        return enfermedad;
    }

    public void setenfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

}
