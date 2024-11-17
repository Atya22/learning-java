import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int lengthArr = sc.nextInt();
        int[] arr = new int[lengthArr];
        int sum = 0;
        int average = 0;

        System.out.println("Enter elements for the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        average = sum / lengthArr;

        String str = String.format("The sum of the numbers: %s, The average of the numbers: %s", sum, average);
        System.out.println(str);
    }
}