import java.util.ArrayList;

class Book3 {
    private String title;
    private String author;
    private int publicationYear;

    public Book3(String title, String author, int publicationYear) {
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

public class Library3 {
    private ArrayList<Book3> books = new ArrayList<>();
    private ArrayList<Book3> borrowedBooks = new ArrayList<>();

    public void addBook(Book3 book) {
        if (!books.contains(book)) {
            books.add(book);
        } else {
            System.out.println(book + " has already been added.");
        }
    }

    public void displayBooks() {
        System.out.println("Library Catalog:");
        int num = 0;
        for (Book3 book : books) {
            System.out.print(++num + ". Title: " + book.getTitle() + ", ");
            System.out.print("Author: " + book.getAuthor() + ", ");
            System.out.println("Year: " + book.getPublicationYear() + ", ");
        }
    }

    public void findBooksByAuthor(String author) {
        for (Book3 book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println("Books by Author " + author);
                System.out.print("Title: " + book.getTitle() + ", ");
                System.out.println("Year: " + book.getPublicationYear());
            }
        }
    }

    public void borrowBook(Book3 book) {
        if (books.contains(book)) {
            books.remove(book);
            borrowedBooks.add(book);
        } else {
            System.out.println("Book not found.");
        }
    }

    public void returnBook(Book3 book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            books.add(book);
        } else {
            System.out.println("Book not found.");
        }
    }

    public void displayBorrowedBooks() {
        System.out.println("Borrowed Books:");
        int num = 0;
        for (Book3 book : borrowedBooks) {
            System.out.print(++num + ". Title: " + book.getTitle() + ", ");
            System.out.print("Author: " + book.getAuthor() + ", ");
            System.out.println("Year: " + book.getPublicationYear() + ", ");
        }
    }

    public boolean isBookAvailable (String title) {
        for (Book3 book : books) {
            if (book.getTitle().equals(title)) {
                return true;
            }
        }
        return false;

    }
}

class LibraryMain3 {
    public static void main(String[] args) {
        Library3 library3 = new Library3();
        Book3 firstBook = new Book3("Introduction to Java Programming", "John Smith", 2020);
        Book3 secondBook = new Book3("Data Structures and Algorithms", "Jane Doe", 2018);
        Book3 thirdBook = new Book3("The Art of Fiction", "Alice Johnson", 2019);

        library3.addBook(firstBook);
        library3.addBook(secondBook);
        library3.addBook(thirdBook);

        library3.displayBooks();

        System.out.println("Is Introduction to Java Programming available? " + library3.isBookAvailable("Introduction to Java Programming"));
        System.out.println("Borrowing Introduction to Java Programming...");
        library3.borrowBook(firstBook);

        System.out.println("Is Introduction to Java Programming available? " + library3.isBookAvailable("Introduction to Java Programming"));
    }
}