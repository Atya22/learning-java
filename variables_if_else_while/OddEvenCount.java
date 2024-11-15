import java.util.Scanner;

public class OddEvenCountSum {
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
        for(int i = number; i <= number2; i++){
            if(i % 2 == 0){
                countOdd += 1;
                sumOdd += i;
            } else{
                countEven += 1;
                summEven += i;
            }
        }
        String str = String.format("Count of odds: %s count of evens: %s. Sum of odds: %s sum of evens: %s.", countOdd, countEven, sumOdd, summEven);
        System.out.println(str);
    }
}