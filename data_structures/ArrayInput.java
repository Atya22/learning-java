import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int lengthArr = sc.nextInt();
        int[] arr = new int[lengthArr];

        System.out.println("Enter elements for the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array elements are: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[lengthArr - 1]) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
    }
}
