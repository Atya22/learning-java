import java.util.Scanner;

public class MathUtilities {

        public int NumberPower(int number, int power){
            int product = 1;
            while(power != 0){
                product *= number;
                power--;
            }
            return product;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input the number: ");
            int number = sc.nextInt();

            System.out.print("Input the power: ");
            int power = sc.nextInt();

            MathUtilities result = new MathUtilities();
            System.out.println(result.NumberPower(number, power));
        }
    }