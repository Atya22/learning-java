import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringSplitter {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("Hello how");
        strings.add("are you");
        strings.add("doing");

        List<String> result = strings.stream()
                .flatMap(x -> Arrays.stream(x.split(" ")))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
