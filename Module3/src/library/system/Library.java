package library.system;
import library.model.Book;
import library.model.LibraryMember;
import java.util.ArrayList;

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
}