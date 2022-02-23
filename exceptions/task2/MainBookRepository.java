package exceptions.task2;

import java.util.List;

public class MainBookRepository {

    public static void main(String[] args) throws NoBookFoundException {
        BookRepository bookRepository = new BookRepository();

        Book book1 = new Book(1, "Title1", "Author1", 1990);
        Book book2 = new Book(2, "Title2", "Author2", 1990);
        Book book3 = new Book(3, "Title2", "Author3", 1992);
        Book book4 = new Book(4, "Title4", "Author4", 1993);

        bookRepository.addBook(book1);
        bookRepository.addBook(book2);
        bookRepository.addBook(book3);
        bookRepository.addBook(book4);

        try {
            List<Book> books = bookRepository.findBookByName("Title2");
            System.out.println(books);
        } catch (NoBookFoundException e) {
            System.out.println("There is no book of such title.");
        }

        try {
            bookRepository.removeBook(2);
        } catch (NoBookFoundException e) {
            System.out.println("There is no book of such id.");
        }
        System.out.println(bookRepository);

        try {
            Book book = bookRepository.findBookById(4);
            System.out.println(book);
        } catch (NoBookFoundException e) {
            System.out.println("There is no book of such id.");
        }

    }

}
