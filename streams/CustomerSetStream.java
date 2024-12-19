import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SetStreamFilterSorter {
    public static void main(String[] args) {
        Set<Customer> mySet = new HashSet<>();

        Customer customer1 = new Customer("Xz", "Xzov", 765);
        Customer customer2 = new Customer("Hmm", "Hmmov", 300);
        Customer customer3 = new Customer("Ok", "Okoyeva", 890);
        Customer customer4 = new Customer("Ld", "Ldov", 10000);
        Customer customer5 = new Customer("Jr", "Jirova", 0);

        mySet.add(customer1);
        mySet.add(customer2);
        mySet.add(customer3);
        mySet.add(customer4);
        mySet.add(customer5);
        System.out.println(mySet);

        mySet.stream().filter(x -> x.getSurename().length() >= 5).collect(Collectors.toSet()).stream().sorted().forEach(System.out::println);
    }
}

