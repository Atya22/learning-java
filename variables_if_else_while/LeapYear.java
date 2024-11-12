import java.util.Scanner;
/*
 * This script checks if a given year is a leap year.
 * An extra leap day occurs in each year
 * that is a multiple of 4,
 * except for years that are evenly divisible by 100 but not by 400.
 */

public class LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            System.out.println("Leap Year");
        } else{
            System.out.println("Not a Leap Year");
        }
    }
}