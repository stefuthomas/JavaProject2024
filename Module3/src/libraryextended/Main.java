package libraryextended;

import libraryextended.model.Book;
import libraryextended.model.LibraryMember;
import libraryextended.system.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", "9780544003415");
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", "9780547928227");
        Book book3 = new Book("The Fellowship of the Ring", "J.R.R. Tolkien", "9780547928210");

        LibraryMember member1 = new LibraryMember("Stef", "0001");
        LibraryMember member2 = new LibraryMember("Roosa", "0002");
        LibraryMember member3 = new LibraryMember("Sampo", "0003");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.addMember(member1);
        library.addMember(member2);
        library.addMember(member3);

        library.reserveBook(member1, book1);
        library.reserveBook(member2, book2);
        library.reserveBook(member3, book3);

        library.displayReservedBooks(member1);
        library.displayReservedBooks(member2);
        library.displayReservedBooks(member3);


        library.cancelReservation(member1, book1);
        library.cancelReservation(member2, book2);
        library.cancelReservation(member3, book3);
    }
}