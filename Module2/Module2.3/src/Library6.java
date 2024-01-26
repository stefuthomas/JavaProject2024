import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.ArrayList;
import java.util.HashMap;

class Book6 {
    private String title;
    private String author;
    private int publicationYear;

    ArrayList<String> reviews = new ArrayList<>();
    ArrayList<Double> ratings = new ArrayList<>();

    public Book6(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.ratings = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    public String getTitle() {
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

class User {
    private String name;
    private int age;
    ArrayList<Book6> borrowedBooks = new ArrayList<>();

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void userBorrowsBook(Book6 book) {
        if (borrowedBooks.contains(book)) {
            System.out.println("You have already borrowed this book.");
        } else {
            borrowedBooks.add(book);
        }
    }

    public void userReturnsBook(Book6 book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
        } else {
            System.out.println("You have not borrowed this book.");
        }
    }

    public void displayBooks() {
        int num = 0;
        if (borrowedBooks.size() == 0) {
            System.out.println(getName() + " has not borrowed any books.");
        } else {
            System.out.println(getName() + " has borrowed:");
            for (Book6 book : borrowedBooks) {
                System.out.print(++num + ". Title: " + book.getTitle() + ", ");
                System.out.print("Author: " + book.getAuthor() + ", ");
                System.out.println("Year: " + book.getPublicationYear() + ", ");
            }
        }
    }

}


public class Library6 {
    private ArrayList<Book6> books = new ArrayList<>();
    private ArrayList<Book6> borrowedBooks = new ArrayList<>();
    private HashMap<User, ArrayList> libraryUsers = new HashMap<>();

    public void addBook(Book6 book) {
        if (!books.contains(book)) {
            books.add(book);
        } else {
            System.out.println(book + " has already been added.");
        }
    }

    public void displayBooks() {
        System.out.println("Library Catalog:");
        int num = 0;
        for (Book6 book : books) {
            System.out.print(++num + ". Title: " + book.getTitle() + ", ");
            System.out.print("Author: " + book.getAuthor() + ", ");
            System.out.println("Year: " + book.getPublicationYear() + ", ");
        }
    }

    public void findBooksByAuthor(String author) {
        for (Book6 book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println("Books by Author " + author);
                System.out.print("Title: " + book.getTitle() + ", ");
                System.out.println("Year: " + book.getPublicationYear());
            }
        }
    }

    public void borrowBook(Book6 book) {
        if (books.contains(book)) {
            books.remove(book);
            borrowedBooks.add(book);
        } else {
            System.out.println("Book not found.");
        }
    }

    public void returnBook(Book6 book) {
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
        for (Book6 book : borrowedBooks) {
            System.out.print(++num + ". Title: " + book.getTitle() + ", ");
            System.out.print("Author: " + book.getAuthor() + ", ");
            System.out.println("Year: " + book.getPublicationYear() + ", ");
        }
    }

    public boolean isBookAvailable(String title) {
        for (Book6 book : books) {
            if (book.getTitle().equals(title)) {
                return true;
            }
        }
        return false;

    }

    public double getAverageRating() {
        int totalRatings = 0;
        double sum = 0;
        for (Book6 book : books) {
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
        for (Book6 book : books) {
            if (book.ratings.size() > mostReviews) {
                mostReviews = book.reviews.size();
                title = book.getTitle();
            }
        }
        return title;
    }

    public void addUser(User user) {
        if (!libraryUsers.containsKey(user)) {
            libraryUsers.put(user, user.borrowedBooks);
        } else {
            System.out.println("User already exists.");
        }
    }

    public void removeUser(User user) {
        if (libraryUsers.containsKey(user)) {
            libraryUsers.remove(user);
        } else {
            System.out.println("User not found.");
        }
    }

    public void displayUsers() {
        System.out.println("Library Users and borrowed books:");
        for (User user : libraryUsers.keySet()) {
            user.displayBooks();
        }
    }
}

class LibraryMain6 {
    public static void main(String[] args) {
        Library6 library6 = new Library6();
        Book6 firstBook = new Book6("Introduction to Java Programming", "John Smith", 2020);
        Book6 secondBook = new Book6("Data Structures and Algorithms", "Jane Doe", 2018);
        Book6 thirdBook = new Book6("The Art of Fiction", "Alice Johnson", 2019);

        library6.addBook(firstBook);
        library6.addBook(secondBook);
        library6.addBook(thirdBook);

        library6.displayBooks();
        // Creating users:
        User firstUser = new User("First User", 25);
        User secondUser = new User("Second User", 30);
        User thirdUser = new User("Third User", 35);
        // Users borrow books:
        firstUser.userBorrowsBook(firstBook);
        secondUser.userBorrowsBook(secondBook);
        thirdUser.userBorrowsBook(thirdBook);
        // Displaying users and their borrowed books:
        library6.addUser(firstUser);
        library6.addUser(secondUser);
        library6.addUser(thirdUser);
        // First user returns their book:
        firstUser.userReturnsBook(firstBook);
        // Second user borrows the first book:
        secondUser.userBorrowsBook(firstBook);

        // Displaying users and their borrowed books(Only second user and third user should have books):
        library6.displayUsers();
    }
}