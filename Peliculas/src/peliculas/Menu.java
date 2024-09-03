package peliculas;

import java.util.*;
import peliculas.logica.Client;
import peliculas.logica.Store;

public class Menu {

    public static Scanner Kb = new Scanner(System.in);
    private Store claromovie;

    public static Scanner getKb() {
        return Kb;
    }

    public static void setKb(Scanner Kb) {
        Menu.Kb = Kb;
    }

    public Store getClaromovie() {
        return claromovie;
    }

    public void setClaromovie(Store claromovie) {
        this.claromovie = claromovie;
    }

    public static void main(String[] args) {
        try {
            System.out.println("     Welcome to the Store      ");
            
            Menu menu = new Menu();
            
            
            System.out.println("Input your name ");
            String name=Kb.next();
            
            System.out.println("Input your id ");
            int id=Kb.nextInt();
            
            System.out.println("Input your payment method ");
            String paymentmethod=Kb.next();
            
            Client newclient= new Client(name, id, 1);
            menu.getClaromovie().add_clients(newclient);
             
            

        } catch (Exception e) {
            System.err.println("Error, something went wrong in " + e.toString());
            e.printStackTrace();
        }

    }

}
