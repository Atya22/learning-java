public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int target = 4;
        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (arr[mid] == target) {
                System.out.println(mid);
                return;
            } else if (arr[mid] < target) {
                min = mid + 1; // Search in the right half
            } else {
                max = mid - 1; // Search in the left half
            }
        }
    }
}
