
public interface CustomSupplier<T> {
    T get();

    static void main(String[] args) {
        CustomSupplier<String> messageSupplier = () -> "Supplier!";
        System.out.println(messageSupplier.get());
    }
}
