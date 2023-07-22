package inheritance;

import java.util.ArrayList;

public class Business {
    String name;
    float stars;
    ArrayList<Review> reviews = new ArrayList<>();

    public Business() {
    }


    public Business(String name, float stars) {
        this.name = name;
        this.stars = stars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getStars() {
        return stars;
    }

    public void setStars(float stars) {
        this.stars = stars;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    // Add review method
    public void addReview(Review review){
        if (this.name != Review.businessName){
            System.out.println("Business does not exist in records.");
        } else {
            this.reviews.add(review);
        }
    }

    public float getStarAverage(){
        float average = 0;
        for (Review review : reviews) {
            average += review.getRating();
        }
        setStars(reviews.isEmpty() ? 0 : (average/reviews.size()));
        return average/ reviews.size();
    }

    @Override
    public String toString() {
        return "Business{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", reviews=" + reviews +
                '}';
    }
}
