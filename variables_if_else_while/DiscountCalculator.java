import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the purchase amount: ");
        int bill = sc.nextInt(); //900
        int discount = 0;
        int totalbill = bill;  //900
        int discountRate = 5; // rate when <= 300

        while (bill > 300) { //900, 450
            discountRate += 5; //10, 15
            bill /= 2; //for the iteration /450, 225
        }

        discount = totalbill * discountRate / 100;
        totalbill = totalbill - discount;

        var str = String.format("Your total bill is: %s₼, amount of discount is: %s₼" , totalbill, discount);
        System.out.println(str);
    }
}
