package ie.atu.abstraction;

public class Main {
    public static void main(String[] args) {
        
        Shape circle = new Circle("Red", 5.0);
        Shape square = new Square("Blue", 4.0);
        Vehicle car = new Car("Toyota", "ft5675");
        Vehicle motorcycle = new Motorcycle("Harley-Davidson", "ht54645");
        GameCharacter hero = new Hero();
        GameCharacter villian = new Villian();
        Teachable student = new Student("Devlin", 21);
        Borrowable book = new Book("Harry Potter", "JK Rowling", false);

        
        
        circle.displayColor();
        square.displayColor();
       
        System.out.println("Area of circle: " + circle.getArea());
        System.out.println("Area of square: " + square.getArea());

        car.displayInfo();
        motorcycle.displayInfo();

        
        car.startEngine();
        car.stopEngine();
        
        motorcycle.startEngine();
        motorcycle.stopEngine();

        hero.move();
        villian.move();

        hero.speak();
        villian.speak();

        hero.useItem();
        villian.useItem();

        ((Student) student).introduce();
        student.study();
        student.doHomework();

        ((Book)book).displayInfo();
        book.checkOut();
        book.returnItem();
        book.isAvailable();


    }
    }


