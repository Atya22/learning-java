import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the number: ");
            int input = sc.nextInt();
            if (input == -1){
                break;
            } else {
                int product = 1;
                for (int i = input; i > 0; i--){
                    product *= i;
                }
                System.out.println("Factorial of " + input + " is: " + product);
            }
        }
    }
}
