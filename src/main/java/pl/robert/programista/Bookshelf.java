package pl.robert.programista;

import java.util.ArrayList;
import java.util.List;
import pl.robert.programista.xsd.Book;

public class Bookshelf {
    private List<Book> books = new ArrayList<Book>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public String toString() {
        return books.toString();
    }
}
