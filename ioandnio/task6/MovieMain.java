package ioandnio.task6;

import java.io.IOException;
import java.util.List;

public class MovieMain {

    public static void main(String[] args) throws IOException {
        Movie movie = new Movie("Title", "Genre", "Director", (short) 2000);
        MovieRepository movieRepository = new MovieRepository();

        movieRepository.addMovie(movie);

        List<Movie> movies = movieRepository.getAllMovies();
        System.out.println(movies.toString());

    }
}
