package exceptions.task2;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(long id) throws NoBookFoundException {
        for (Book book : books) {
            if (book.getId() == id) {
                books.remove(book);
                return;
            }
        }
        throw new NoBookFoundException("Wrong: " + id);
    }

    public Book findBookById(long id) throws NoBookFoundException {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        throw new NoBookFoundException("Wrong: " + id);
    }

    public List<Book> findBookByName(String name) throws NoBookFoundException {
        List<Book> booksByName = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(name)) {
                booksByName.add(book);
            }
        }
        if (booksByName.isEmpty()) {
            throw new NoBookFoundException("Wrong: " + name);
        }
        return booksByName;
    }

    public void getBooks(List<Book> bookList) {
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    @Override
    public String toString() {
        return "BookRepository{" +
                "books=" + books +
                '}';
    }
}
