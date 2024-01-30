package Tehtavat3;

import java.util.ArrayList;

class Book2 {
    private String title;
    private String author;
    private int publicationYear;

    public Book2(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}

public class Library2 {
    private ArrayList<Book2> books = new ArrayList<>();
    private ArrayList<Book2> borrowedBooks = new ArrayList<>();

    public void addBook(Book2 book) {
        if (!books.contains(book)) {
            books.add(book);
        } else {
            System.out.println(book + " has already been added.");
        }
    }

    public void displayBooks() {
        System.out.println("Tehtavat3.Library Catalog:");
        int num = 0;
        for (Book2 book : books) {
            System.out.print(++num + ". Title: " + book.getTitle() + ", ");
            System.out.print("Author: " + book.getAuthor() + ", ");
            System.out.println("Year: " + book.getPublicationYear() + ", ");
        }
    }

    public void findBooksByAuthor(String author) {
        for (Book2 book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println("Books by Author " + author);
                System.out.print("Title: " + book.getTitle() + ", ");
                System.out.println("Year: " + book.getPublicationYear());
            }
        }
    }

    public void borrowBook(Book2 book) {
        if (books.contains(book)) {
            books.remove(book);
            borrowedBooks.add(book);
        } else {
            System.out.println("Tehtavat3.Book not found.");
        }
    }

    public void returnBook(Book2 book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            books.add(book);
        } else {
            System.out.println("Tehtavat3.Book not found.");
        }
    }

    public void displayBorrowedBooks() {
        System.out.println("Borrowed Books:");
        int num = 0;
        for (Book2 book : borrowedBooks) {
            System.out.print(++num + ". Title: " + book.getTitle() + ", ");
            System.out.print("Author: " + book.getAuthor() + ", ");
            System.out.println("Year: " + book.getPublicationYear() + ", ");
        }
    }
}

class LibraryMain2 {
    public static void main(String[] args) {
        Library2 library2 = new Library2();
        Book2 firstBook = new Book2("Introduction to Java Programming", "John Smith", 2020);
        Book2 secondBook = new Book2("Data Structures and Algorithms", "Jane Doe", 2018);
        Book2 thirdBook = new Book2("The Art of Fiction", "Alice Johnson", 2019);

        library2.addBook(firstBook);
        library2.addBook(secondBook);
        library2.addBook(thirdBook);

        library2.displayBooks();

        System.out.println("Borrowing books " + firstBook.getTitle() + " and " + secondBook.getTitle() + "...");
        library2.borrowBook(firstBook);
        library2.borrowBook(secondBook);

        library2.displayBooks();
        library2.displayBorrowedBooks();

        System.out.println("Returning book " + firstBook.getTitle() + "...");
        library2.returnBook(firstBook);

        library2.displayBooks();
        library2.displayBorrowedBooks();
    }
}