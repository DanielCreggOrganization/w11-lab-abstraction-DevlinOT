package ie.atu.abstraction;

public abstract class Vehicle {
    protected String brand;
    protected String model;
    
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    
    public abstract void startEngine();
    public abstract void stopEngine();
    
    public void displayInfo() {
        System.out.println("This is a " + brand + " " + model);
    }
}
