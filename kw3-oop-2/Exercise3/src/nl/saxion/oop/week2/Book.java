package nl.saxion.oop.week2;

public class Book {
    private String ISBN;
    private String title;
    private int pages;
    private Author author;

    /**
     * Construct a new book
     * @param ISBN ISBN is a number that is specific to a book and print
     * @param title Title of the book
     * @param pages Define the amount of pages a book has
     * @param author The creator of the book
     */
    public Book(String ISBN, String title, int pages, Author author) {
        this.ISBN = ISBN;
        this.title = title;
        this.pages = pages;
        this.author = author;
    }

    /**
     * Get formatted string
     * @return returns a formatted string
     */
    @Override
    public String toString() {
        return "Title " + title + " form " + author.getName() + " has " + pages + " pages. ISBN " + ISBN;
    }

    /**
     * Get the author from a book
     * @return Author object
     */
    public Author getAuthor() {
        return author;
    }
}
