
public class Book {

String title;
boolean rented;
// Creates a new Book

public Book(String bookTitle) {
    this.title = bookTitle;
}

// Marks the book as rented
public void rented() {
    rented = true;
}

// Marks the book as not rented

public void returned() {
    rented = false;
}

// Returns true if the book is rented, false otherwise

public boolean isBorrowed() {
  if (rented == true) {
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
    System.out.println("Rented? (should be false): " + example.isBorrowed());
    example.rented();
    System.out.println("Rented? (should be true): " + example.isBorrowed());
    example.returned();
    System.out.println("Rented? (should be false): " + example.isBorrowed());
    }
}
