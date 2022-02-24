package ioandnio.task6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class MovieRepository {
    private final MovieParser movieParser = new MovieParser();
    private final static Path PATH =
            Paths.get("C:\\Users\\user\\IdeaProjects\\sda-transporeon1\\adv\\java-advanced-development\\target\\classes\\movie.txt");

    public void addMovie(Movie movie) throws IOException {
        Files.writeString(PATH, movieParser.toCSV(movie),
                StandardOpenOption.APPEND);
    }

    public List<Movie> getAllMovies() throws IOException {
        List<String> movieLines = Files.readAllLines(PATH);
        List<Movie> movies = new ArrayList<>();
        for (String line : movieLines) {
            Movie movie = movieParser.fromCSV(line);
            movies.add(movie);
        }
        return movies;
    }
}
