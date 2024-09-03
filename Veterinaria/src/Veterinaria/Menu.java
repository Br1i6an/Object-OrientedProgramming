/*
 * 
 */
package Veterinaria;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        try {
            Scanner Keyboard = new Scanner(System.in);
            Perro p = new Perro();
            Gato g = new Gato();
            Veterinaria v = new Veterinaria();

            System.out.println("Bienvenido a la veterinaria Huellitas"
                    + "\n Tu amigo es un: "
                    + "\n 1- Perro "
                    + "\n 2- Gato "
                    + "\n"
                    + "\n"
                    + "\n 3- Base de datos de mascotas "
                    + "\n 0- Salir ");
            int opcion = Keyboard.nextInt();
            switch (opcion) {
                case 1:
                    for (int i = 0; i < 1; i++) {
                        System.out.println("Ingresa la raza de tu perro:");
                        v.getperros()[i].setraza(Keyboard.next());
                        System.out.println("Ingresa la dad de tu perro:");
                        v.getperros()[i].setedad(Keyboard.nextInt());
                        System.out.println("Ingresa el color de tu perro:");
                        v.getperros()[i].setcolor(Keyboard.next());
                        System.out.println("Ingresa el nombre de  tu perro:");
                        v.getperros()[i].setnombre(Keyboard.next());
                        System.out.println("Ingresa la enfermedad que aqueja a tu perro:");
                        v.getperros()[i].setenfermedad(Keyboard.next());
                    }
                    System.out.println("No te preocupes, tu mascota se aliviará pronto");
                    
                case 2:
                    for (int i = 0; i < 1; i++) {
                        System.out.println("Ingresa la raza de tu gato:");
                        v.getgatos()[i].setraza(Keyboard.next());
                        System.out.println("Ingresa la dad de tu gato:");
                        v.getgatos()[i].setedad(Keyboard.nextInt());
                        System.out.println("Ingresa el color de tu gato:");
                        v.getgatos()[i].setcolor(Keyboard.next());
                        System.out.println("Ingresa el nombre de  tu gato:");
                        v.getgatos()[i].setnombre(Keyboard.next());
                        System.out.println("Ingresa la enfermedad que aqueja a tu gato:");
                        v.getgatos()[i].setenfermedad(Keyboard.next());
                    }
                    System.out.println("No te preocupes, tu mascota se aliviará pronto");
                    
                case 3:
                    int opcion2 = 9;
                    System.out.println("Bienvenido a la base de datos de la veterinaria Huellitas, ¿que deseas ver? "
                            + "\n 1- Informacion de los perros "
                            + "\n 2- Informacion de los gatos");
                    while (opcion2 != 0) {
                        switch (opcion2) {
                            case 1:
                                for (int i = 0; i < Veterinaria.getnumperro(); i++) {
                                    System.out.println("Dog " + (1 + i) + ": "
                                            + "\nRaza: " + v.getperros()[i].getraza()
                                            + "\nEdad: " + v.getperros()[i].getedad()
                                            + "\nColor: " + v.getperros()[i].getcolor()
                                            + "\nNombre: " + v.getperros()[i].getnombre()
                                            + "\nEnfermedad: " + v.getperros()[i].getenfermedad());
                                }

                        }
                    }

            }
        } catch (Exception e) {
            System.err.println("Error en main, error: "
                    + e.toString());
        }
    }

    public static void Ver_menu() {
        try {

        } catch (Exception e) {
            System.err.println("Error en main, error: "
                    + e.toString());
        }
    }
}
