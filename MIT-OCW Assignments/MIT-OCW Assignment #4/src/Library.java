import java.util.ArrayList;

public class Library {

    String address1;
    ArrayList<Book> availableBooks = new ArrayList<Book>();
    ArrayList<Book> borrowedBooks = new ArrayList<Book>();
    String title;

    public Library(String address) {
        this.address1 = address;
        }

    public static void printOpeningHours() {
        System.out.println("Libraries are open daily from 9am to 5pm.");
    }

    public void printAddress() {
        System.out.println(address1);
    }

    public String borrowBook(String bookTitle) {

        Book book;
        String title;

        for(int i = 0; i < availableBooks.size(); i++) {
            
            book = availableBooks.get(i);
            title = book.getTitle();

            if(title.equals(bookTitle)) {
                if(!(book.isBorrowed())) {
                    book.rented();
                    System.out.println("You successfully borrowed " + title);
                    return null;

                } else {
                    System.out.println("Sorry, this book is already borrowed.");
                    return null;
                }
            }


        }

        System.out.println("Sorry, this book is not in our catalog.");
        return null;
    }

    public void addBook(Book book) {
        availableBooks.add(book);
    }

    public void printAvailableBooks() {

        Book book;
        boolean libraryIsEmpty = true;

        for (int i = 0; i < availableBooks.size(); i++) {

            book = availableBooks.get(i);

            if(!(book.isBorrowed())) {

                System.out.println(book.getTitle());
                libraryIsEmpty = false;

            }

            }

        if (libraryIsEmpty) {
            System.out.println("No book in catalog");
        }
           
    }

    public void returnBook(String bookTitle) {
        Book book;
        String title;
        boolean found = false;

        for(int i = 0; i < availableBooks.size(); i++) {

            book = availableBooks.get(i);
            title = book.getTitle();

            if(title.equals(bookTitle)) {
                if(book.isBorrowed()) {
                    book.returned();
                    System.out.println("You successfully returned " + title);
                    found = true;
                    break;
                }
            }
        }

        if(!found) {
            System.out.println("Book not found.");
        }
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

