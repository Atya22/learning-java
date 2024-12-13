@FunctionalInterface
public interface CustomBiConsumer<T, U> {
    void accept(T t, U u);

    static void main(String[] args) {
        CustomBiConsumer<String, Integer> printDetails = (name, age) -> System.out.println("Name: " + name + ", age: " + age);
        printDetails.accept("Aytaj", 22);
    }
}
