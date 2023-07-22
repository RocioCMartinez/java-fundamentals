package inheritance;

public class MovieReview extends Review{

    String movieName;

    public MovieReview(String businessName, String author, String body, float rating, String movieName) {
        super(businessName, author, body, rating);
        this.movieName = movieName;
    }

    @Override
    public String toString() {
        return "MovieReview{" +
                "movieName='" + movieName + '\'' +
                ", author='" + author + '\'' +
                ", body='" + body + '\'' +
                ", rating=" + rating +
                '}';
    }
}
