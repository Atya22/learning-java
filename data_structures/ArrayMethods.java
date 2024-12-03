import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class ArrayMethods {
    public int[] numbers = {12, 45, 7, 89, 23};
    public String[] fruits = {"apple", "orange", "banana", "grape"};

    public int findMin() {
        int min = Arrays.stream(numbers).min().getAsInt();
        return min;
    }

    public int findMax() {
        int max = Arrays.stream(numbers).max().getAsInt();
        return max;
    }

    public String[] sort() {
        Arrays.sort(fruits);
        return fruits;
    }

    public boolean findElement(String fruit) {
        return Arrays.stream(fruits).anyMatch(element -> element == fruit);
    }

    public int calculateSum() {
        int sum = Arrays.stream(numbers).sum();
        return sum;
    }

//orElse() used to handle the case when the array is empty
    public double calculateAvg(){
        double avg = Arrays.stream(numbers).average().orElse(0.0);
        return avg;
    }

    public String[] reverse(){
        String[] reversed = new String[fruits.length];
        for (int i = 0; i < fruits.length; i ++){
            reversed[i] = fruits[fruits.length - 1 -i];
        }
        return reversed;
    }

    public static void main(String[] args) {
        ArrayMethods arrayMethods = new ArrayMethods();
        System.out.println(Arrays.toString(arrayMethods.sort()));
        System.out.println(arrayMethods.findElement("orange"));
        System.out.println(arrayMethods.findMax());
        System.out.println(arrayMethods.findMin());
        System.out.println(arrayMethods.calculateSum());
        System.out.println(arrayMethods.calculateAvg());
        System.out.println(Arrays.toString(arrayMethods.reverse()));
    }
}

