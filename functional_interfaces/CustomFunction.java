
@FunctionalInterface
public interface CustomFunction<T, R> {
    R apply(T t);

    static void main(String[] args) {
        CustomFunction<String, Integer> stringLength = str -> str.length();
        System.out.println("Length of 'Java': " + stringLength.apply("Java"));
    }
}
