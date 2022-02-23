package collections.task2;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Book implements Comparable<Book> {

    String title;
    double price;
    short yearOfRelease;
    List<Author> authors;
    Genre genre;

    public Book(String title, double price, short yearOfRelease, List<Author> authors, Genre genre) {
        this.title = title;
        this.price = price;
        this.yearOfRelease = yearOfRelease;
        this.authors = authors;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public short getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(short yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (Double.compare(book.price, price) != 0) return false;
        if (yearOfRelease != book.yearOfRelease) return false;
        if (!Objects.equals(title, book.title)) return false;
        if (!Objects.equals(authors, book.authors)) return false;
        return genre == book.genre;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = title != null ? title.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) yearOfRelease;
        result = 31 * result + (authors != null ? authors.hashCode() : 0);
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", yearOfRelease=" + yearOfRelease +
                ", authors=" + authors +
                ", genre=" + genre +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return 0;
    }
}
