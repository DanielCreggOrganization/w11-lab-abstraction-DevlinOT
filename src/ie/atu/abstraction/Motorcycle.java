package ie.atu.abstraction;

public class Motorcycle extends Vehicle {

    public Motorcycle(String brand, String modle){
        super(brand, modle);
        
    }

    @Override
    public void startEngine(){
        System.out.println("This Motorcycleis starting its engine ");
    }

    @Override
    public void stopEngine(){
        System.out.println("This Motorcycle is stopping its engine ");
    }

}
