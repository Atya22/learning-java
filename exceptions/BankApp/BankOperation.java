package BankApp;

public abstract class BankOperation {
    public abstract void deposit(double amount) throws InvalidAmountException;
    public abstract double checkBalance();
}

