package SalaryManagement;

public class Manager extends Employee {
    private static final double MANAGER_PAYMENT = 5000;
    private double bonus;

    public Manager(int number, String name, int year, int month, int day, String department, double bonus) {
        super(number, name, year, month, day, department);
        this.bonus = bonus;
    }

    public static double getManagerPayment() {
        return MANAGER_PAYMENT;
    }

    public Manager(int number, String name, int year, int month, int day, String department) {
        super(number, name, year, month, day, department);
    }

    @Override
    public double calculateSalary() {
        return super.calculateExperience() * getBaseSalary() + MANAGER_PAYMENT + bonus;
    }

    ;
}
