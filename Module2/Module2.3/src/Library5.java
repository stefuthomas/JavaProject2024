import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.ArrayList;

class Book5 {
    private String title;
    private String author;
    private int publicationYear;

    ArrayList<String> reviews = new ArrayList<>();
    ArrayList<Double> ratings = new ArrayList<>();

    public Book5(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.ratings = new ArrayList<>();
        this.reviews = new ArrayList<>();
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
        this.ratings.add(rating);
    }

    public void addReview(String review) {
        this.reviews.add(review);
    }

    }
    

public class Library5 {
    private ArrayList<Book5> books = new ArrayList<>();
    private ArrayList<Book5> borrowedBooks = new ArrayList<>();

    public void addBook(Book5 book) {
        if (!books.contains(book)) {
            books.add(book);
        } else {
            System.out.println(book + " has already been added.");
        }
    }

    public void displayBooks() {
        System.out.println("Library Catalog:");
        int num = 0;
        for (Book5 book : books) {
            System.out.print(++num + ". Title: " + book.getTitle() + ", ");
            System.out.print("Author: " + book.getAuthor() + ", ");
            System.out.println("Year: " + book.getPublicationYear() + ", ");
        }
    }

    public void findBooksByAuthor(String author) {
        for (Book5 book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println("Books by Author " + author);
                System.out.print("Title: " + book.getTitle() + ", ");
                System.out.println("Year: " + book.getPublicationYear());
            }
        }
    }

    public void borrowBook(Book5 book) {
        if (books.contains(book)) {
            books.remove(book);
            borrowedBooks.add(book);
        } else {
            System.out.println("Book not found.");
        }
    }

    public void returnBook(Book5 book) {
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
        for (Book5 book : borrowedBooks) {
            System.out.print(++num + ". Title: " + book.getTitle() + ", ");
            System.out.print("Author: " + book.getAuthor() + ", ");
            System.out.println("Year: " + book.getPublicationYear() + ", ");
        }
    }

    public boolean isBookAvailable (String title) {
        for (Book5 book : books) {
            if (book.getTitle().equals(title)) {
                return true;
            }
        }
        return false;

    }

    public double getAverageRating() {
        int totalRatings = 0;
        double sum = 0;
        for (Book5 book : books) {
            for (double rating : book.ratings) {
                sum += rating;
                totalRatings++;
            }
        }
        return sum / totalRatings;
    }

    public String getMostReviewedBook() {
        int mostReviews = 0;
        String title = null;
        for (Book5 book : books) {
            if (book.ratings.size() > mostReviews) {
                mostReviews = book.reviews.size();
                title = book.getTitle();
            }
        }
        return title;
    }
}

class LibraryMain5 {
    public static void main(String[] args) {
        Library5 library5 = new Library5();
        Book5 firstBook = new Book5("Introduction to Java Programming", "John Smith", 2020);
        Book5 secondBook = new Book5("Data Structures and Algorithms", "Jane Doe", 2018);
        Book5 thirdBook = new Book5("The Art of Fiction", "Alice Johnson", 2019);

        library5.addBook(firstBook);
        library5.addBook(secondBook);
        library5.addBook(thirdBook);

        library5.displayBooks();

        firstBook.addReview("Great book!");
        firstBook.setRating(5.0);
        firstBook.addReview("I liked it.");
        firstBook.setRating(4.2);
        firstBook.addReview("It was okay.");
        firstBook.setRating(3.3);
        firstBook.addReview("I didn't like it.");
        firstBook.setRating(1.8);

        secondBook.addReview("Great book!");
        secondBook.setRating(4.8);
        secondBook.addReview("I liked it.");
        secondBook.setRating(3.3);
        secondBook.addReview("It was okay.");
        secondBook.setRating(2.5);

        thirdBook.addReview("Great book!");
        thirdBook.setRating(4.5);
        thirdBook.addReview("I liked it.");
        thirdBook.setRating(3.1);

        // Reviews: firtBook = 4, secondBook = 3, thirdBook = 2
        // Introduction to Java Programming has the most reviews:
        System.out.println("Highest amount of reviews: " + library5.getMostReviewedBook());
        // Total ratings: 9, Sum of ratings: 32.5
        System.out.printf("Average rating of all the books in the library %.1f ", library5.getAverageRating());


    }
}