package BankApp;

public class Main {
    public static void main(String[] args) {
        try {
            Customer customer = new Customer(1, "John Lee", 500.0);

            BankCustomer bankCustomer = new BankCustomer(customer);

            bankCustomer.checkBalance();

            bankCustomer.deposit(200.0);

            bankCustomer.pay(100.0);

            try {
                bankCustomer.pay(700.0);
            } catch (InsufficientFundsException e) {
                System.out.println("❌ Error: " + e.getMessage());
            }

            bankCustomer.refund(150.0);

            bankCustomer.checkBalance();

            System.out.println(bankCustomer);

        } catch (InvalidAmountException e) {
            System.out.println("❌ Invalid amount: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ Unexpected error: " + e.getMessage());
        }
    }
}
