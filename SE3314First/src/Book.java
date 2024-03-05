import java.util.ArrayList;
import java.util.List;

/**
 * Represents a book in the library.
 */
public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;

    /**
     * Constructs a new Book object.
     *
     * @param title      The title of the book.
     * @param author     The author of the book.
     * @param ISBN       The ISBN (International Standard Book Number) of the book.
     * @param isAvailable Indicates whether the book is currently available in the library.
     */
    public Book(String title, String author, String ISBN, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = isAvailable;
    }

    /**
     * Gets the title of the book.
     *
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the author of the book.
     *
     * @return The author of the book.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Gets the ISBN of the book.
     *
     * @return The ISBN of the book.
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Checks if the book is available in the library.
     *
     * @return True if the book is available; false otherwise.
     */
    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * Sets the availability of the book.
     *
     * @param available True if the book is available; false otherwise.
     */
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

/**
 * Represents a library to manage books.
 */
