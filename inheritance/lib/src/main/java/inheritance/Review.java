package inheritance;

public class Review extends Restaurant {
    String author;
    String body;

   int rating;

    public Review(String name, int stars, int priceCat, String author, String body, int rating) {
        super(name, stars, priceCat);
        this.author = author;
        this.body = body;
        this.rating = rating;
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

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

//    @Override public String toString() {
//        return "Review{" +
//                "Author: " + author +
//                " Body: " + body +
//                " Star Rating: " + stars +
//                '}';
//    }

    @Override public String toString() {
        return "Restaurant Review {Restaurant: " + name + ", Star Rating: " + stars + ", Price Category: " + priceCat +
                ", Author: " + author + ", Body: " + body + "}";
    }
}
