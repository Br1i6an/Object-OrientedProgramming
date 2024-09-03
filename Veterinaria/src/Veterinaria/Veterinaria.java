/*

 */
package Veterinaria;

public class Veterinaria {

    private static final int numperro = 4;
    private static final int numgato = 4;
    private Perro perros[];
    private Gato gatos[];

    public Veterinaria() {
        perros = new Perro[numperro];
        gatos = new Gato[numgato];
    }


    public Perro[] getperros() {
        return perros;
    }

    public void setperros(Perro[] perros) {
        this.perros = perros;
    }

    public Gato[] getgatos() {
        return gatos;
    }

    public void setgatos(Gato[] gatos) {
        this.gatos = gatos;
    }

    public static int getnumperro() {
        return numperro;
    }

    public static int getnumgato() {
        return numgato;
    }


}
