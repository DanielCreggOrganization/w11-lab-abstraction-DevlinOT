package ie.atu.abstraction;

public class Car extends Vehicle {

    public Car(String brand, String modle){
        super(brand, modle);
        
    }

    @Override
    public void startEngine(){
        System.out.println("This Car is starting its engine ");
    }

    @Override
    public void stopEngine(){
        System.out.println("This Car is stopping its engine ");
    }

  

}
