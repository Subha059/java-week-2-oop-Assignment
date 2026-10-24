import java.util.ArrayList;
import java.util.Scanner;

abstract class Book {
    private String title;
    private boolean borrowed;

    Book(String title) {
        this.title = title;
        this.borrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void borrowBook() {
        borrowed = true;
    }

    public void returnBook() {
        borrowed = false;
    }

    abstract void display();
}

class LibraryBook extends Book {
    LibraryBook(String title) {
        super(title);
    }

    @Override
    void display() {
        System.out.println(
            getTitle() + (isBorrowed() ? " (Borrowed)" : " (Available)")
        );
    }
}

class User {
    private String name;

    User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Library {
    private ArrayList<LibraryBook> books = new ArrayList<>();

    public void addBook(LibraryBook book) {
        books.add(book);
        System.out.println("Book added successfully");
    }

    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available");
            return;
        }

        for (LibraryBook book : books) {
            book.display();
        }
    }

    public void borrowBook(String title, User user) {
        for (LibraryBook book : books) {
            if (book.getTitle().equalsIgnoreCase(title)
                    && !book.isBorrowed()) {
                book.borrowBook();
                System.out.println(user.getName()
                        + " borrowed " + title);
                return;
            }
        }

        System.out.println("Book not available");
    }

    public void returnBook(String title) {
        for (LibraryBook book : books) {
            if (book.getTitle().equalsIgnoreCase(title)
                    && book.isBorrowed()) {
                book.returnBook();
                System.out.println("Book returned successfully");
                return;
            }
        }

        System.out.println("Borrowed book not found");
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Library library = new Library();
        User user = new User("Subhadeep");

        int choice;

        do {
            System.out.println("\n--- LIBRARY MENU ---");
            System.out.println("1. Add Book");
            System.out.println("2. Show Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    library.addBook(new LibraryBook(title));
                    break;

                case 2:
                    library.showBooks();
                    break;

                case 3:
                    System.out.print("Enter book title: ");
                    title = sc.nextLine();
                    library.borrowBook(title, user);
                    break;

                case 4:
                    System.out.print("Enter book title: ");
                    title = sc.nextLine();
                    library.returnBook(title);
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);

        sc.close();
    }
}
