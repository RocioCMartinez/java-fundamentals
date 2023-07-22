package inheritance;

import java.util.ArrayList;

public class Restaurant extends Business {
    //Properties
    int priceCat;




      //Constructors


    public Restaurant(String name, float stars, int priceCat) {
        super(name, stars);
        this.priceCat = priceCat;
    }


    // Getters and Setters


    public int getPriceCat() {
        return priceCat;
    }

    public void setPriceCat(int priceCat) {
        this.priceCat = priceCat;
    }



   

    // toString method

    @Override
    public String toString() {
        return "Restaurant{ " +
                "Name: " + name  +
                " Star Rating: " + stars +
                " Price Category: " + priceCat +
                '}';
    }
}

