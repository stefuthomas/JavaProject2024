package library.model;

import java.util.ArrayList;

public class LibraryMember {
    private String name;
    private String memberId;
    private ArrayList<Book> borrowedBooks;

    public LibraryMember(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<Book>();
    }

    public void borrow(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
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


}
