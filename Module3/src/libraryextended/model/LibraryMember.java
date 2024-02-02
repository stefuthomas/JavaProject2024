package libraryextended.model;
import libraryextended.model.Book;
import libraryextended.system.Library;
import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private String name;
    private String memberId;
    private ArrayList<libraryextended.model.Book> borrowedBooks;
    private List<Book> reservedBooks = new ArrayList<>();

    public LibraryMember(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<libraryextended.model.Book>();
    }

    public void borrow(libraryextended.model.Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(libraryextended.model.Book book) {
        borrowedBooks.remove(book);
    }

    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    public void getBorrowedBooks() {
        if (!borrowedBooks.isEmpty()) {
            for (Book book : borrowedBooks) {
                System.out.println(book.getTitle() + " by " + book.getAuthor() + " ISBN: " + book.getIsbn());
            }
        } else {
            System.out.println("No books borrowed.");
        }
    }

    public void addReservedBook(Book book) {
        reservedBooks.add(book);
    }

    public void removeReservedBook(Book book) {
        reservedBooks.remove(book);
    }

    public boolean hasReservedBook(Book book) {
        return reservedBooks.contains(book);
    }

    public List<Book> getReservedBooks() {
        return reservedBooks;
    }
}