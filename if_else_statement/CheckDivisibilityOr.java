import java.util.Scanner;

/**
 * This program checks if an entered integer is divisible by 3 or 4.
 *
 * Steps:
 * - Prompt the user to enter an integer.
 * - Use an if statement to check if the integer is divisible by 3 or 4.
 * - Print an appropriate message indicating whether the number is:
 *   - Divisible by both 3 and 4
 *   - Divisible by 3 only
 *   - Divisible by 4 only
 *   - Not divisible by either 3 or 4
 */

public class CheckDivisibilityOr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 3 == 0 && number % 4 == 0) {
            System.out.println( number + " is divisible by both 3 and 4.");
        }
        else if (number % 3 == 0 ) {
            System.out.println( number + " is divisible by 3.");
        }
        else if (number % 4 == 0 ) {
            System.out.println( number + " is divisible by 4.");
        }
        else {
            System.out.println( number + " is not a divisible by 3 or 4.");
        }
    }
}