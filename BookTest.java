import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public String getDetails() {
        return title + " by " + author + ", ISBN: " + isbn;
    }
    public String getTitle() {
        return title;
    }
}
class Library {
    private ArrayList<Book> books = new ArrayList<>();
    // Add book
    public void addBook(Book book) {
        books.add(book);
    }
    // Remove book by title
    public void removeBook(String title) {
        books.removeIf(book -> book.getTitle().equals(title));
    }
    // Display all books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book.getDetails());
            }
        }
    }
}

public class BookTest {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books
        Book b1 = new Book("Java Programming", "James Gosling", "9780135166307");
        Book b2 = new Book("Data Structures", "Robert Lafore", "9780672324536");

        library.addBook(b1);
        library.addBook(b2);

        System.out.println("List of books:");
        library.displayBooks();

        // Remove one book
        library.removeBook("Java Programming");

        System.out.println("\nAfter removing Java Programming:");
        System.out.println("List of books:");
        library.displayBooks();
    }
}