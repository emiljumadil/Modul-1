package Day10;
import java.util.*;

public class Library {
    private ArrayList<Books> books;

    public Library() {
        books = new ArrayList<> ();
    }

    public void addBook(Books book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Books List:  ");
        for (Books book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("ISBN: " + book.getIsbn());
            System.out.println("Availbility: " + (book.isAvailable() ? "Available" : "Not Available"));
            System.out.println();
        }
    }

    public void searchByTitle(String title) {
        System.out.println("Searching for title: " + title);
        for (Books book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("ISBN: " + book.getIsbn());
                System.out.println("Available: " + (book.isAvailable() ? " Available" : " not Available"));
                System.out.println();
            }
        }
    }
    public void searchByAuthor(String author) {
        System.out.println("Searching for author: " + author);
        for (Books book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)){
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("ISBN: " + book.getIsbn());
                System.out.println("Availability: " + (book.isAvailable() ? "Available" : "Not Available"));
                System.out.println();
            }
        }
    }
}