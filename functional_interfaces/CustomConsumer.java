import java.util.function.Consumer;

@FunctionalInterface
public interface CustomConsumer<T> {
    void accept(T t);


    static void main(String[] args) {
        CustomConsumer<String> withoutReturn = (message) -> System.out.println("Message:" + message);
        withoutReturn.accept("Hello");
    }
}
