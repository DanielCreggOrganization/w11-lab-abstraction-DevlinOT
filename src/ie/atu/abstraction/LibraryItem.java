package ie.atu.abstraction;

public abstract class LibraryItem {
    protected String title;
    protected String author;
    protected boolean isCheckedOut;
    
    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
        this.isCheckedOut = false;
    }
    
    public abstract void displayInfo();
}
