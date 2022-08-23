
public class Book {

String title;
boolean borrowed;
boolean rented;
// Creates a new Book

public Book(String bookTitle) {

}

// Marks the book as rented
public void borrowed() {
    rented = true;
}

// Marks the book as not rented

public void returned() {
    rented = false;
}

// Returns true if the book is rented, false otherwise

public boolean isBorrowed() {
    if (borrowed = true) {
        return true;
    } else {
        return false;
    }
}

// Returns the title of the book

public String getTitle() {
    
    return title;
}

public static void main(String[] args) {
    // Small test of the Book class
    Book example = new Book("The Da Vinci Code");
    System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
    System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    System.out.println("Borrowed? (should be true): " + example.isBorrowed());
    System.out.println("Borrowed? (should be false): " + example.isBorrowed());
    }
}
