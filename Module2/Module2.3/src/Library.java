import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
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

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
        } else {
            System.out.println(book + " has already been added.");
        }
    }

    public void displayBooks() {
        System.out.println("Library Catalog:");
        int num = 0;
        for (Book book : books) {
            System.out.print(++num + ". Title: " + book.getTitle() + ", ");
            System.out.print("Author: " + book.getAuthor() + ", ");
            System.out.println("Year: " + book.getPublicationYear() + ", ");
        }
    }

    public void findBooksByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println("Books by Author " + author);
                System.out.print("Title: " + book.getTitle() + ", ");
                System.out.println("Year: " + book.getPublicationYear());
            }
        }
    }
}

class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        Book firstBook = new Book("Introduction to Java Programming", "John Smith", 2020);
        Book secondBook = new Book("Data Structures and Algorithms", "Jane Doe", 2018);
        Book thirdBook = new Book("The Art of Fiction", "Alice Johnson", 2019);

        library.addBook(firstBook);
        library.addBook(secondBook);
        library.addBook(thirdBook);

        library.displayBooks();

        library.findBooksByAuthor("Jane Doe");
    }
}