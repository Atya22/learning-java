import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int result = 0;

    System.out.print("Enter the first number:");
    int number1 = sc.nextInt();
    System.out.print("Enter the operator");
    char operator = sc.next().charAt(0);
    System.out.print("Enter the second number:");
    int number2 = sc.nextInt();


    if (operator == '+'){
        result = number1 + number2;
    } else if (operator == '-'){
        result = number1 - number2;
    } else if (operator == '*'){
        result = number1 * number2;
    } else if (operator == '/'){
        result = number1 / number2;
    } else {
        System.out.println("Invalid operator");
        return;
    } 

    var str = String.format("The result: " + "%s" + " %s " + "%s" + " = " + "%s", number1, operator, number2, result);
    System.out.println(str);
}
}