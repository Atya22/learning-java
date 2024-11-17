import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int lengthArr = sc.nextInt();
        float[] arr = new float[lengthArr];
        float sum = 0;
        float average;

        System.out.println("Enter elements for the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        average = sum / lengthArr;

        String str = String.format("The sum of the numbers: %,.0f, The average of the numbers: %.2f", sum, average);
        System.out.println(str);
    }
}