package ie.atu.abstraction;

public class Villian implements GameCharacter {
    @Override
    public void move() {
        System.out.println("The villian appears at the the scene");
    }

    @Override
    public void speak() {
        System.out.println("I will ruin the day");
    }

    @Override
    public void useItem() {
        System.out.println("The villian uses a spell");
    }

}
