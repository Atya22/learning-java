package SalaryManagement;

public class Director extends Manager {
    private double bonus;

    public Director(int number, String name, int year, int month, int day, String department, double bonus) {
        super(number, name, year, month, day, department);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateExperience() * getBaseSalary() + getManagerPayment() + bonus;
    }
}
