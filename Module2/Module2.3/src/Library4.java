import java.util.ArrayList;

class Book4 {
    private String title;
    private String author;
    private int publicationYear;

    private double rating;
    private String review;

    public Book4(String title, String author, int publicationYear) {
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

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void addReview(String review) {
        this.review = review;
    }

    public double getRating() {
        return rating;
    }

    public String getReview() {
        return review;
    }
}

public class Library4 {
    private ArrayList<Book4> books = new ArrayList<>();
    private ArrayList<Book4> borrowedBooks = new ArrayList<>();

    public void addBook(Book4 book) {
        if (!books.contains(book)) {
            books.add(book);
        } else {
            System.out.println(book + " has already been added.");
        }
    }

    public void displayBooks() {
        System.out.println("Library Catalog:");
        int num = 0;
        for (Book4 book : books) {
            System.out.print(++num + ". Title: " + book.getTitle() + ", ");
            System.out.print("Author: " + book.getAuthor() + ", ");
            System.out.println("Year: " + book.getPublicationYear() + ", ");
        }
    }

    public void findBooksByAuthor(String author) {
        for (Book4 book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println("Books by Author " + author);
                System.out.print("Title: " + book.getTitle() + ", ");
                System.out.println("Year: " + book.getPublicationYear());
            }
        }
    }

    public void borrowBook(Book4 book) {
        if (books.contains(book)) {
            books.remove(book);
            borrowedBooks.add(book);
        } else {
            System.out.println("Book not found.");
        }
    }

    public void returnBook(Book4 book) {
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
        for (Book4 book : borrowedBooks) {
            System.out.print(++num + ". Title: " + book.getTitle() + ", ");
            System.out.print("Author: " + book.getAuthor() + ", ");
            System.out.println("Year: " + book.getPublicationYear() + ", ");
        }
    }

    public boolean isBookAvailable (String title) {
        for (Book4 book : books) {
            if (book.getTitle().equals(title)) {
                return true;
            }
        }
        return false;

    }
}

class LibraryMain4 {
    public static void main(String[] args) {
        Library4 library4 = new Library4();
        Book4 firstBook = new Book4("Introduction to Java Programming", "John Smith", 2020);
        Book4 secondBook = new Book4("Data Structures and Algorithms", "Jane Doe", 2018);
        Book4 thirdBook = new Book4("The Art of Fiction", "Alice Johnson", 2019);

        library4.addBook(firstBook);
        library4.addBook(secondBook);
        library4.addBook(thirdBook);

        System.out.println("Books are being rated...");
        firstBook.setRating(4.8);
        secondBook.setRating(3.5);
        thirdBook.setRating(1.8);

        System.out.println("Books are being reviewed...");
        firstBook.addReview("Very good book! Would recommend.");
        secondBook.addReview("Good book! Nothing special.");
        thirdBook.addReview("Not a good book. Don't borrow this.");

        System.out.println("Title: " + firstBook.getTitle());
        System.out.print("Rating: " + firstBook.getRating());
        System.out.println(", Review: " + firstBook.getReview());

        System.out.println("Title: " + secondBook.getTitle());
        System.out.print("Rating: " + secondBook.getRating());
        System.out.println(", Review: " + secondBook.getReview());

        System.out.println("Title: " + thirdBook.getTitle());
        System.out.print("Rating: " + thirdBook.getRating());
        System.out.println(", Review: " + thirdBook.getReview());

    }
}