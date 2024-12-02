package BankApp;

public class BankCustomer extends BankOperation implements PaymentService {
    private final Customer customer;

    public BankCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void deposit(double amount) throws InvalidAmountException {
        customer.deposit(amount);
        System.out.println("✅ Deposit Successful: " +
                amount + " added to account.");
    }

    @Override
    public double checkBalance() {
        System.out.println("💰 Current Balance: " + customer.getBalance());
        return customer.getBalance();
    }

    @Override
    public void pay(double amount) throws InsufficientFundsException, InvalidAmountException {
        customer.withdraw(amount);
        System.out.println("📤 Payment Processed: " +
                amount + " debited from account");
    }

    @Override
    public void refund(double amount) throws InvalidAmountException {
        customer.deposit(amount);
        System.out.println("♻️ Refund Processed: " +
                amount + " credited to account.");
    }

    @Override
    public String toString() {
        return "BankCustomer Details: " + "customer=" + customer;
    }
}
