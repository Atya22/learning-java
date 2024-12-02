package Shapes;

public abstract class Shapes {
    public abstract double perimeter();

    public abstract double area();

    public void test() {
        System.out.println("This is an abstract class");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
