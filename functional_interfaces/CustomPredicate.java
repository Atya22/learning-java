@FunctionalInterface
public interface CustomPredicate<T> {
    boolean test(T t);


    static void main(String[] args) {
        CustomPredicate<Integer> isEven = (number) -> number % 2 == 0;

        System.out.println(isEven.test(4));
        System.out.println(isEven.test(5));
    }
}
