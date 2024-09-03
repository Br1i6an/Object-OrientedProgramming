package peliculas.logica;

public class Store {

    private String name;
    private int type;
    private Movie availableMovies[];
    private Client clientsStore[];

    private int numMovies;
    private int numClients;
    private int actualClients;

    public Store(String name, int type) {
        this.name = name;
        this.type = type;
        numMovies = 10;
        numClients = 10;
        this.availableMovies = new Movie[numMovies];
        this.clientsStore = new Client[numClients];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Movie[] getAvailableMovies() {
        return availableMovies;
    }

    public void setAvailableMovies(Movie[] availableMovies) {
        this.availableMovies = availableMovies;
    }

    public Client[] getClientsStore() {
        return clientsStore;
    }

    public void setClientsStore(Client[] clientsStore) {
        this.clientsStore = clientsStore;
    }

    public int getNumMovies() {
        return numMovies;
    }

    public void setNumMovies(int numMovies) {
        this.numMovies = numMovies;
    }

    public int getNumClients() {
        return numClients;
    }

    public void setNumClients(int numClients) {
        this.numClients = numClients;
    }

    public void add_clients(Client data) {
        clientsStore[actualClients] = data;
        actualClients++;

    }
    

}
