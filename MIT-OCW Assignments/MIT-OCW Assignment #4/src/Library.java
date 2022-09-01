import java.util.ArrayList;

public class Library {

    String address;
    ArrayList<Book> availableBooks = new ArrayList<Book>();
    ArrayList<Book> borrowedBooks = new ArrayList<Book>();
    String title;

    public Library(String address) {
        this.address = address;
        }

    public static void printOpeningHours() {
        System.out.println("Libraries are open daily from 9am to 5pm.");
    }

    public void printAddress() {
        System.out.println(address);
    }

    public void borrowBook(String bookTitle) {

        if (availableBooks.contains(new Book(""))) {
            System.out.println("You successfully borrowed " + bookTitle);
        } else if (borrowedBooks.contains( new Book(""))) {
            System.out.println("Sorry, this book is already borrowed.");
        } else {
            System.out.println("Sorry, this book is not in our catalog.");
        }

        availableBooks.remove( new Book(""));
        borrowedBooks.add( new Book(""));
    }

    public void addBook(Book book) {
        availableBooks.add( new Book(""));
    }
    
    public String toString() {
        return title;
    }

    public void printAvailableBooks() {

        for (int i = 0; i < availableBooks.size(); i++) {
            System.out.println(availableBooks.get(i));
        }
        if (availableBooks.isEmpty()) {
            System.out.println("No book in catalog");
        }
           
                
    }

    


    public void returnBook(String bookTitle) {
        borrowedBooks.remove( new Book(""));
        availableBooks.add( new Book(""));
            System.out.println("You successfully returned " + bookTitle);
    }



    public static void main(String[] args) {
        // Create two libraries
         Library firstLibrary = new Library("10 Main St.");
         Library secondLibrary = new Library("228 Liberty St.");
        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));
        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();
        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();
        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();
        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();
        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();
        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        }
    }

