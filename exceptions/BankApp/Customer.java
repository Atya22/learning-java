package BankApp;

public class Customer {
    private String name;
    private int id;
    private double balance;

    public Customer(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount){
        if (amount > 0){
            balance += amount;
        } else {
            throw new InvalidAmountException("Amount must be greater than zero");
        }
        return balance;
    }

    public double withdraw(double amount){
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be greater than zero.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance.");
        }
        balance -= amount;
        return balance;
    }

    public String toString(){
        return "Customer:" + " name = " + name +
                " id = " + id + " balance = " + balance;
    }
}
