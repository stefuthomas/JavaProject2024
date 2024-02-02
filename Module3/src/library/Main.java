package library;
import library.model.*;
import library.system.*;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Lord of the Rings", "J. R. R. Tolkien", "978-951-31-2503-6");
        Book book2 = new Book("The Hobbit", "J. R. R. Tolkien", "978-951-31-2502-9");
        Book book3 = new Book("The Silmarillion", "J. R. R. Tolkien", "978-951-31-2504-3");

        LibraryMember member1 = new LibraryMember("Stefu", "AA-412");
        LibraryMember member2 = new LibraryMember("Jaska", "BA-541");
        LibraryMember member3 = new LibraryMember("Masa", "CC-123");

        library.addMember(member1);
        library.addMember(member2);
        library.addMember(member3);

        member1.borrow(book1);
        member1.borrow(book2);
        member2.borrow(book3);

        library.displayUsers();

    }
}