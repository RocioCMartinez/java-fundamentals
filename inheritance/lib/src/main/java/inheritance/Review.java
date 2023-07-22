package inheritance;

public class Review {
    static String businessName;
    String author;
    String body;


   float rating;

    public Review() {
    }

    public Review(String businessName, String author, String body, float rating) {
        this.businessName = businessName;
        this.author = author;
        this.body = body;
        this.rating = rating;
    }


    public String getRestaurantName() {
        return businessName;
    }

    public void setRestaurantName(String businessName) {
        this.businessName = businessName;
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

    public void setRating(float rating) {
       this.rating = rating;
    }


    @Override public String toString() {
        return "Business Review {Business: " + businessName + ", Author: " + author + ", Body: " + body + "}";
    }
}
