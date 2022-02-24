package ioandnio.task6;

public class MovieParser {
    private static final String SEPARATOR = ",";

    public Movie fromCSV(String line) {
        String[] data = line.split(SEPARATOR);
        return new Movie(data[0], data[1], data[2], Short.parseShort(data[3]));
    }

    public String toCSV(Movie movie) {
        return new StringBuilder().append(movie.getTitle())
                .append(SEPARATOR)
                .append(movie.getGenre())
                .append(SEPARATOR)
                .append(movie.getDirector())
                .append(SEPARATOR)
                .append(movie.getYearOfRelease())
                .append("\n")
                .toString();
    }
}
