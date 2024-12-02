package Shapes;

public class Square extends Shapes {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Perimeter of square is: " + perimeter() + ", area of square is: " + area();
    }

}
