package pl.robert.programista;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import pl.robert.programista.xsd.Book;

class BookshelfTests {

    private final Bookshelf bookshelf = new Bookshelf();

    @Test
    void addBookTest() {
        Book book = new Book();
        book.setAuthor("Alojzy Testowy");
        book.setIsbn("1234567891234");
        book.setTitle("Wielki test");
        book.setPrice("20");
        bookshelf.addBook(book);

        assertFalse(bookshelf.getBooks().isEmpty());
    }

    @Test
    void removeBookTest() {
        Book book = new Book();
        book.setAuthor("Alojzy Testowy");
        book.setIsbn("1234567891234");
        book.setTitle("Wielki test");
        book.setPrice("20");
        bookshelf.addBook(book);
        bookshelf.removeBook(book);

        assertTrue(bookshelf.getBooks().isEmpty());
    }
}