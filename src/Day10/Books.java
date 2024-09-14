package Day10;

public class Books {
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    public Books(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getIsbn() {
        return isbn;
    }
    public boolean isAvailable() {
        return available;
    }
    public void borrowBook() {
        available = false;
    }
    public void returnBook() {
        available = true;
    }

}
