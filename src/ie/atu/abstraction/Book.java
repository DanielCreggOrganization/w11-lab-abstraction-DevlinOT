package ie.atu.abstraction;

public class Book extends LibraryItem implements Borrowable {
    public Book(String title, String author, Boolean isCheckedOut) {
        super(title, author);
    }

    @Override
    public void displayInfo() { 
        System.out.println("The book"+title+" by "+author+" is checked out"+isCheckedOut);
    }

    @Override
    public void checkOut(){
        if (!isCheckedOut) {
        isCheckedOut = true;
        System.out.println("You have checked out the book: " + title);
    } else {
        System.out.println("Sorry, the book is already checked out.");
    }
}

@Override
public void returnItem() {
    if (isCheckedOut) {
        isCheckedOut = false;
        System.out.println("You have returned the book: " + title);
    } else {
        System.out.println("This book was not checked out.");
    }
}

@Override
public boolean isAvailable() {
    return !isCheckedOut;
}


}
