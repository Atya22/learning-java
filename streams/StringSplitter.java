import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringSplitter {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        List<String> strings2 = new ArrayList<>();

        strings.add("Hello how");
        strings.add("are you");
        strings.add("doing");

        strings2.add("Bye");

        var stringLists = Arrays.asList(strings, strings2);

        List<String> result = strings.stream()
                .flatMap(x -> Arrays.stream(x.split(" ")))
                .collect(Collectors.toList());

        System.out.println(result);

        List<Stream<String[]>> resLists = stringLists.stream()
                .map(list -> list.stream())
                .map(x -> (x.map(res -> res.split(" "))))
                .collect(Collectors.toList());

        for(String[] res : resLists){
            System.out.println(Arrays.toString(res));
        }
    }
}
