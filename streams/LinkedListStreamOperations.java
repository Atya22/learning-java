
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LinkedListStreamOperations {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(7);
        numbers.add(8);
        numbers.add(14);
        numbers.add(18);

        LinkedList<Integer> sortedList = numbers.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 2)
                .filter(x -> x > 20)
                .sorted()
                .collect(Collectors.toCollection(() -> new LinkedList<>()));

        System.out.println(sortedList);
    }
}
