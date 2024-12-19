import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerOperation {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Xz", "Xzov", 765);
        Customer customer2 = new Customer("Hmm", "Hmmov", 300);
        Customer customer3 = new Customer("Ok", "Okyov", 890);
        Customer customer4 = new Customer("Ld", "Ldov", 10000);
        Customer customer5 = new Customer("Jr", "Jrov", 0);

        var debtPeople = Arrays.asList(customer1, customer2, customer3, customer4, customer5);

        debtPeople.stream()
                .filter(x -> x.getDebt() > 350)
                .peek(x -> {
                    int l = x.getDebt() + (x.getDebt() / 2);
                    x.setDebt(l);// Modify the debt
                }).forEach(System.out::print);

//        System.out.println();
//        System.out.println(debtPeople);
    }
}
