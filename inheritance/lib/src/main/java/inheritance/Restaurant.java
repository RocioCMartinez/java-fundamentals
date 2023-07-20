package inheritance;

import java.util.ArrayList;

public class Restaurant {
    //Properties
    String name;
    double stars;
    int priceCat;

    ArrayList<Review> restaurantReviews = new ArrayList<>();


      //Constructors

    public Restaurant() {
    }
    public Restaurant(String name, double stars, int priceCat) {
        this.name = name;
        this.stars = stars;
        this.priceCat = priceCat;
    }

    // Getters and Setters


    public ArrayList<Review> getRestaurantReviews() {
        return restaurantReviews;
    }

    public void setRestaurantReviews(ArrayList<Review> restaurantReviews) {
        this.restaurantReviews = restaurantReviews;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStars() {
        return stars;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }

    public int getPriceCat() {
        return priceCat;
    }

    public void setPriceCat(int priceCat) {
        this.priceCat = priceCat;
    }

    // Add review method
    public void addReview(Review review){
        if (this.name != Review.restaurantName){
            System.out.println("Restaurant does not exist in records.");
        } else {
            this.restaurantReviews.add(review);
        }
    }

    public double getStarAverage(){
        double average = 0;
       for (Review review : restaurantReviews) {
           average += review.getRating();
       }
       setStars(restaurantReviews.isEmpty() ? 0 : (average/restaurantReviews.size()));
       return average/ restaurantReviews.size();
    }
   

    // toString method
    @Override public String toString() {
        return "Restaurant{" +
                "Name: " + name +
                " Star Rating: " + stars +
                " Price Category: " + priceCat +
                " Restaurant Reviews: " + restaurantReviews +
                "}";
    }
}

