package ie.atu.abstraction;

public class Student extends Person implements Teachable {
    public Student(String name, int age) {
        super(name, age);
    }

        @Override
    public void introduce() {
        System.out.println("Hello my name is " +name+" and i am "+age+" years old");
    }

    @Override
    public void study() {
        System.out.println(name+" is studying" );
    }

    @Override
    public void doHomework() {
        System.out.println(name+" is doing their homework" );
    }

}
