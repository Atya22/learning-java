package CalculatorApp;
import java.util.Scanner;

public class Calculator {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the first number:");
            int number1 = sc.nextInt();
            System.out.print("Enter the operator ");
            char operator = sc.next().charAt(0);
            System.out.print("Enter the second number:");
            int number2 = sc.nextInt();
            int result;


            if (operator == '+'){
                Plus numbers = new Plus();
                result = numbers.plus(number1, number2);
            } else if (operator == '-'){
                Minus numbers = new Minus();
                result = numbers.minus(number1, number2);
            } else if (operator == '*'){
                Multiply numbers = new Multiply();
                result = numbers.multiply(number1, number2);
            } else if (operator == '/'){
                Divide numbers = new Divide();
                result = numbers.divide(number1, number2);
            } else {
                System.out.println("Invalid operator");
                return;
            }

            var str = String.format("The result: %s %s %s = %s", number1, operator, number2, result);
            System.out.println(str);
        }
}
