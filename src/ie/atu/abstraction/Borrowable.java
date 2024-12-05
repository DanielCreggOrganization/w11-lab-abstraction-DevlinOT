package ie.atu.abstraction;

public interface Borrowable {
    void checkOut();
    void returnItem();
    boolean isAvailable();
}
