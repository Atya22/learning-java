import java.util.Scanner;

public class DigitSeparator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number between 10-99: ");
        int number = sc.nextInt();

        if (number < 10 || number > 99) {
            System.out.println("Please enter a two-digit number.");
        } else {
            int tens = number / 10;
            int ones = number % 10;

            System.out.println(tens + " " + ones);
        }
    }
}
