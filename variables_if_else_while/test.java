import java.util.Scanner;

/**
 * 300 - 5%
 * 600 - 10%
 * ...
 * 900 (for every 300 manats  +5 %) - 15
 */
public class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the purchase amount: ");
        int bill = sc.nextInt(); //1000
        int rateAmount = 5; // if 300
        int totalBill = bill;

        while (bill >= 300){
            rateAmount += 5;
            bill /= 2;
        }
        System.out.println(rateAmount + "bill:" + bill );

        int discountAmount = totalBill * rateAmount / 100;
        int totallbill = totalBill - discountAmount;
        String sr = String.format("amount of discount: %s manats, " +
        "total bill %s manats", discountAmount, totallbill);
        System.out.println (sr);
    }
}