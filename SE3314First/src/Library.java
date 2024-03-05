import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    /**
     * Constructs a new Library object.
     */
    public Library() {
        this.books = new ArrayList<>();
    }

    /**
     * Adds a new book to the library.
     *
     * @param book The book to be added.
     * @throws IllegalArgumentException If the book is null.
     */
    public void addBook(Book book) throws IllegalArgumentException {
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null.");
        }
        books.add(book);
    }

    /**
     * Searches for books by title or author.
     *
     * @param query The title or author to search for.
     * @return A list of books matching the query.
     */
    public List<Book> searchBooks(String query) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(query) || book.getAuthor().equalsIgnoreCase(query)) {
                result.add(book);
            }
        }
        return result;
    }

    /**
     * Checks out a book to a borrower.
     *
     * @param book     The book to be checked out.
     * @param borrower The borrower's name.
     * @return True if the book is successfully checked out; false otherwise.
     */
    public boolean checkoutBook(Book book, String borrower) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            // Additional logic for handling borrower information
            return true;
        }
        return false;
    }

    /**
     * Returns a book to the library.
     *
     * @param book The book to be returned.
     */
    public void returnBook(Book book) {
        book.setAvailable(true);
        // Additional logic for handling book return
    }
}
