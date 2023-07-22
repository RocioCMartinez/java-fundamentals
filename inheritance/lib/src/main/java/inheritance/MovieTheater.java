package inheritance;

import java.util.ArrayList;

public class MovieTheater extends Business {

    ArrayList<String> movies = new ArrayList<>();

    public MovieTheater(String name, float stars) {
        super(name, stars);
    }

    public void addMovie(String movieName){
        movies.add(movieName);
    }

    @Override
    public String toString() {
        return "MovieTheater{" +
                ", movies=" + movies +
                ", name='" + name + '\'' +
                ", stars=" + stars +
                ", reviews=" + reviews +
                '}';
    }
}
