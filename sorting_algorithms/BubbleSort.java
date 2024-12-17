public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1};
        int max = 0;
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] > arr[j]) {
                    max = arr[i];
                    arr[i] = arr[i + j];
                    arr[i + j] = max;
                }
            }
        }
//        print elements of the array
        for (int i : arr) {
            System.out.print(i);
        }
    }
}
