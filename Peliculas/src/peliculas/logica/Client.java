
package peliculas.logica;


public class Client {
    private String name;
    private int id;
    private String paymentMethod;

    public Client(String name, int id, String paymentMethod) {
        this.name = name;
        this.id = id;
        this.paymentMethod = paymentMethod;
    }

    public Client() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    
    
}
