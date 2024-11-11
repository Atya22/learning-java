import java.util.Scanner;
/*
 * This program prompts the user to enter a month and then determines the corresponding season.
 */

public class WhatSeasonIsIt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month: ");
        String month = input.nextLine().toLowerCase();

        switch (month) {
            case "december":
            case "january":
            case "february":
                System.out.println("The season is winter.");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("The season is spring.");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("The season is summer.");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println("The season is autumn.");
                break;
            default:
                System.out.println("The season is not found.");
        }
    }
}