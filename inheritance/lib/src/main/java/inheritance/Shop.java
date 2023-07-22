package inheritance;

public class Shop extends Business{

    String description;

    int priceCat;

    public Shop(String name, float stars, String description, int priceCat) {
        super(name, stars);
        this.description = description;
        this.priceCat = priceCat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriceCat() {
        return priceCat;
    }

    public void setPriceCat(int priceCat) {
        this.priceCat = priceCat;
    }

    @Override
    public String toString() {
        return "Shop{" +
                ", name='" + name + '\'' +
                ", stars=" + stars +
                "description='" + description + '\'' +
                ", priceCat=" + priceCat +
                '}';
    }
}
