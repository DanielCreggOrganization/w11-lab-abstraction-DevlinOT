package ie.atu.abstraction;

public class Square extends Shape{
    private double Width;

    public Square(String color, double Width){
        super(color);
        this.Width = Width;
    }

    @Override
    public double getArea() {
        return   Width * Width;
    }

}
