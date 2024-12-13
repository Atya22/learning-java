@FunctionalInterface
public interface CustomBiFunction<T, U, R> {
    R apply(T t, U u);

    static void main(String[] args) {
        CustomBiFunction<Integer, Integer, Integer> addNumbers = (a, b) -> a + b;
        System.out.println("Sum: " + addNumbers.apply(5, 3));
    }
}
