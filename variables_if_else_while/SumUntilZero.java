/**
 * This program calculates the sum of entered numbers.
 * The program prompts the user to enter numbers and continues to sum them until the user enters 0.
 * When the user enters 0, the program displays the total sum of all entered numbers and terminates.
 */

import java.util.Scanner;

 public class SumUntilZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter the number or enter 0 to stop: ");
            int input = sc.nextInt();
            if (input == 0){
                System.out.println("Total sum" + sum);
                break;
            } else {
                    sum += input;
                }
            }
        }
    }
