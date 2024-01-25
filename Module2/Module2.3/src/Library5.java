import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.ArrayList;

class Book5 {
    private String title;
    private String author;
    private int publicationYear;

    private double rating;
    private ArrayList<Double> totalRatings = new ArrayList<>();
    private int numberOfReviews;
    private String review;

    public Book5(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.numberOfReviews = 0;
        this.totalRatings = new ArrayList<>();
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
        totalRatings.add(rating);

    }

    public void addReview(String review) {
        this.numberOfReviews++;
        this.review = review;
    }

    public double getRating() {
        return rating;
    }

    public String getReview() {
        return review;
    }

    public int getNumberOfReviews() {
        return numberOfReviews;
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
        int sum = 0;
        for (Book5 book : books) {
            sum += book.getRating();
        }
        return sum / books.size();
    }

    public String getMostReviewedBook() {
        int max = 0;
        Book5 mostReviewedBook = null;
        for (Book5 book : books) {
            if (book.getNumberOfReviews() > max) {
                max = book.getNumberOfReviews();
                mostReviewedBook = book;
            }
        }
        return mostReviewedBook.getTitle();
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
        firstBook.setRating(4.9);
        firstBook.addReview("I liked it.");
        firstBook.setRating(3.5);
        firstBook.addReview("It was okay.");
        firstBook.setRating(2.1);
        firstBook.addReview("I didn't like it.");
        firstBook.setRating(1.5);

        secondBook.addReview("Great book!");
        secondBook.setRating(4.2);
        secondBook.addReview("I liked it.");
        secondBook.setRating(3.8);
        secondBook.addReview("It was okay.");
        secondBook.setRating(2.5);

        thirdBook.addReview("Great book!");
        thirdBook.setRating(4.5);
        thirdBook.addReview("I liked it.");
        thirdBook.setRating(3.2);

        // Reviews: firtBook = 4, secondBook = 3, thirdBook = 2
        // Introduction to Java Programming has the most reviews:
        System.out.println("Highest amount of reviews: " + library5.getMostReviewedBook());


    }
}