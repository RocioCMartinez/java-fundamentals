package inheritance;

public class Restaurant {
    //Properties
    String name;
    int stars;
    int priceCat;


      //Constructors

    public Restaurant() {

    }
    public Restaurant(String name, int stars, int priceCat) {
        this.name = name;
        this.stars = stars;
        this.priceCat = priceCat;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getPriceCat() {
        return priceCat;
    }

    public void setPriceCat(int priceCat) {
        this.priceCat = priceCat;
    }

    // Add review method

   

    // toString method
    @Override public String toString() {
        return "Restaurant{" +
                "Name: " + name +
                " Star Rating: " + stars +
                " Price Category: " + priceCat +
                '}';
    }
}

