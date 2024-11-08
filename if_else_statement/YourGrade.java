import java.util.Scanner;

public class YourGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = input.nextInt();

        if (score >= 90) {
            System.out.println("Your grade is A");
        } else if (score >= 80) {
            System.out.println("Your grade is B");
        } else if (score >= 70) {
            System.out.println("Your grade is C");
        } else if (score >= 60) {
            System.out.println("Your grade is D");
        } else if (score >= 50) {
            System.out.println("Your grade is E");
        } else if (score >= 40) {
            System.out.println("Your grade is F");
        } else if (score >= 30) {
            System.out.println("Your grade is G");
        } else {
            System.out.println("Your grade is H");
        }
    }
}
