import java.util.Scanner;
/**
 * This program takes two numbers from the user, determines the range between them,
 * and counts the number of odd and even numbers within that range (exclusive),
 * along with calculating the sum of those odd and even numbers.
 * The entered numbers themselves are not included in the range.
 */

public class OddEvenCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        int countEven = 0;
        int countOdd = 0;
        int sumOdd = 0;
        int summEven = 0;

        if (number > number2) {
            number = number + number2;
            number2 = number - number2;
            number = number - number2;
        }
        for ( int i = number + 1; i < number2; i++){
            if (i % 2 == 0){
                countOdd += 1;
                sumOdd += i;
            } else {
                countEven += 1;
                summEven += i;
            }
        }
        String str = String.format("Count of odds: %s count of evens: %s. Sum of odds: %s sum of evens: %s.", countOdd, countEven, sumOdd, summEven);
        System.out.println(str);
    }
}