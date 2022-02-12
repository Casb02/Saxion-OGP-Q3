package nl.saxion.oop.week2;

import java.time.LocalDate;

public class Author {
    private String name;
    private LocalDate date;

    /**
     * Create a new author
     * @param name name of the author
     * @param date date of birth
     */
    public Author(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    /**
     * Get the name of the author
     * @return Returns name of author
     */
    public String getName() {
        return name;
    }

}
