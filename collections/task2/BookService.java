package collections.task2;

import exceptions.task2.NoBookFoundException;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String title) throws NoBookFoundException {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                return;
            }
        }
        throw new NoBookFoundException("Invalid " + title);
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public List<Book> getFantasyBooks(Genre genre) {
        List<Book> booksByGenre = new ArrayList<>();
        for (Book book: books) {
            if (book.genre == genre) {
                booksByGenre.add(book);
            }
        }
        return booksByGenre;
    }

    public Book getTheMostExpensiveBook() {
        Book result = null;
        for (Book book : books) {
            if (result != null || result.getPrice() < book.price) {
                book = result;
            }
        }
        return result;
    }


}
