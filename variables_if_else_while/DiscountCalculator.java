import java.util.Scanner;

/**
 * DiscountCalculator is a simple program that calculates a discount
 * based on the initial purchase amount entered by the user.
 * 
 * The discount is calculated in such a way that for every increment
 * of purchase amount exceeding a base of 300 AZN, an additional 5%
 * discount is added. The rate increases as long as the adjusted 
 * amount is greater than 300.
 * 
 * The program outputs both the total payable amount after applying 
 * the discount and the amount of the discount itself.
 */

public class DiscountCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the purchase amount: ");
        float bill = sc.nextInt(); //900
        float discount = 0;
        float totalbill = bill;  //900
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
