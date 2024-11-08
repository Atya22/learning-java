import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 6 == 0 && number % 4 == 0) {
            System.out.println( number + " is a divisible number.");
        }
        else {
            System.out.println( number + " is not a divisible number.");
        }
    }
}