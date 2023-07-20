package inheritance;

public class Review {
    static String restaurantName;
    String author;
    String body;

   double rating;

    public Review(String restaurantName, String author, String body, double rating) {
        this.restaurantName = restaurantName;
        this.author = author;
        this.body = body;
        this.rating = rating;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public double getRating() {
        if (rating < 0) {
            this.rating = 0;
        } else if (rating > 5) {
            this.rating = 5;
        }
        return this.rating;
    }

    public void setRating(double rating) {
       this.rating = rating;
    }


    @Override public String toString() {
        return "Restaurant Review {Restaurant: " + restaurantName + ", Author: " + author + ", Body: " + body + "}";
    }
}
