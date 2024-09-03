package peliculas.logica;

public class Movie {

    private String name;
    private float price;
    private String genre;
    private int classification;
    private int year;
    private String language;
    private boolean status;
    private Client user;

    public Movie(String name, float price, String genre, int classification, int year, String language, boolean status) {
        this.name = name;
        this.price = price;
        this.genre = genre;
        this.classification = classification;
        this.year = year;
        this.language = language;
        this.status = status;
        this.user = new Client();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getClassification() {
        return classification;
    }

    public void setClassification(int classification) {
        this.classification = classification;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Client getUser() {
        return user;
    }

    public void setUser(Client user) {
        this.user = user;
    }

    
}
