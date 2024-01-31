package libraryextended.system;
import java.util.ArrayList;
import libraryextended.model.Book;
import libraryextended.model.LibraryMember;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<LibraryMember> members;
    public Library() {
        books = new ArrayList<Book>();
        members = new ArrayList<LibraryMember>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(LibraryMember member) {
        members.add(member);
    }

    public void borrowBook(LibraryMember member, Book book) {
        member.borrow(book);
    }

    public void returnBook(LibraryMember member, Book book) {
        member.returnBook(book);
    }

    public void displayUsers() {
        for (LibraryMember member : members) {
            System.out.println(member.getName() + " " + member.getMemberId());
            System.out.println("Borrowed books:");
            member.getBorrowedBooks();
        }
    }

    public void reserveBook(LibraryMember member, Book book) {
        if (!book.isReserved()) {
            book.setReserved(true);
            member.addReservedBook(book);
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    public void cancelReservation(LibraryMember member, Book book) {
        if (book.isReserved() && member.hasReservedBook(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println("Reservation canceled successfully.");
        } else {
            System.out.println("Book was not reserved by this member.");
        }
    }

    public void displayReservedBooks(LibraryMember member) {
        System.out.println("Reserved books for " + member.getName() + ":");
        for (Book book : member.getReservedBooks()) {
            System.out.println(book.getTitle());
        }
    }
}