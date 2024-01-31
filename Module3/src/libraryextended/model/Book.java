package libraryextended.model;
public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean reserved;

    public Book(String title, String author, String  isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.reserved = false;
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

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }
}
