package SalaryManagement;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Employee {
    private int number;
    private String name;
    private LocalDate startingYear;
    private String department;
    private static final double BASE_SALARY = 500;

    public static double getBaseSalary() {
        return BASE_SALARY;
    }

    public Employee(int number, String name, int year, int month, int day, String department) {
        this.name = name;
        this.startingYear = LocalDate.of(year, month, day);
        this.number = number;
        this.department = department;
    }

    public Employee() {
    }

    public long calculateExperience() {
        LocalDate currentDate = LocalDate.now();
        return ChronoUnit.YEARS.between(startingYear, currentDate);
    }

    public double calculateSalary() {
        return calculateExperience() * BASE_SALARY;
    }

    ;

    @Override
    public String toString() {
        return "Employee{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", working experience=" + calculateExperience() +
                ", department='" + department + '\'' +
                ", salary=" + calculateSalary() +
                '}';
    }

}
