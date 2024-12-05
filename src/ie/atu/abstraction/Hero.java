package ie.atu.abstraction;

public class Hero implements GameCharacter {
    @Override
    public void move() {
        System.out.println("The hero rushes to the scene");
    }

    @Override
    public void speak() {
        System.out.println("I will save the day");
    }

    @Override
    public void useItem() {
        System.out.println("The hero uses potion");
    }

}
