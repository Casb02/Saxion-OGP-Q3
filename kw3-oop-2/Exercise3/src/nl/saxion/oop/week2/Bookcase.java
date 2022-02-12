package nl.saxion.oop.week2;

import java.util.ArrayList;
import java.util.Objects;

public class Bookcase {
    private int size = 0;
    private ArrayList<Book> books = new ArrayList<Book>();

    @Override
    public String toString() {
        return "Bookcase size: " + size + " has " + books.size() + " books";
    }

    /**
     * Create a space where you can store a specific amount of books
     * @param size Size is the amount of books that can be stored
     */
    public Bookcase(int size) {
        this.size = size;
    }

    /**
     * Adds a book to the bookcase only if there is space left.
     * @param book Book is a book object you want to add to the Bookcase
     */
    public void addBook(Book book) {
        if (books.size() < size) {
            books.add(book);
        } else throw new IllegalArgumentException("Bookcase is full");
    }

    /**
     * Get all books from a specific author
     * @param Author Name of the author
     * @return ArrayList Book with all books from specific author
     */
    public ArrayList<Book> getBooksFromAuthor(String Author) {
        ArrayList<Book> booksFromAuthor = new ArrayList<>();
        for (Book book: books) {
            if (Objects.equals(book.getAuthor().getName(), Author)) booksFromAuthor.add(book);
        }
        return booksFromAuthor;
    }
}
