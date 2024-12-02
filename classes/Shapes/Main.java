package Shapes;

public class Main {
    public static void main(String[] args) {
        Shapes mySquare = new Square (4.25);
        Shapes myTriangle = new Triangle(3, 6, 9);

        System.out.println(mySquare);
        System.out.println(myTriangle);

        System.out.println(mySquare.area());
        System.out.println(mySquare.perimeter());
    }
}
