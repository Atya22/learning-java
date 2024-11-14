import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int digitCount = 0;

        if (number == 0) {
            digitCount = 1;
        } else {
            while (number > 0) {
                number /= 10;
                digitCount++;
            }
        }
        System.out.println("Amount of numbers: " + digitCount);
        }
    }
