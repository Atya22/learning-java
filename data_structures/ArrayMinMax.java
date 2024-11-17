import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int lengthArr = sc.nextInt();
        int[] arr = new int[lengthArr];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println("Enter elements for the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //finding the max and min values;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            } else if (arr[i] > max){
                max = arr[i];
            }
        }
        String str = String.format("The minimum value is: %s, the maximum value is %s", min, max);
        System.out.println(str);
    }
}
