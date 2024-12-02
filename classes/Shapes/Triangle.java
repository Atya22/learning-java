package Shapes;

public class Triangle extends Shapes {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double area() {
//        perimeter according to Heron's formula
        double result = Math.sqrt(perimeter() * (perimeter() - side1) * (perimeter() - side2) * (perimeter() - side3));
        return result;
    }

    @Override
    public String toString() {
        return "Perimeter of square is: " + perimeter() + ", area of square is: " + area();
    }
}
