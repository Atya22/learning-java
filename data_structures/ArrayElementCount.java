import java.util.Scanner;

public class ArrayElementCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int lengthArr = sc.nextInt();
        int[] arr = new int[lengthArr];
        int count = 0;

        System.out.println("Enter elements for the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter a number to count: ");
        int countNumber = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == countNumber) count++;
        }

        String str = String.format("The number %s appears %s times", countNumber, count);
        System.out.println(str);
    }
}
