package SalaryManagement;

public class Main {
    public static void main(String[] args) {
        Employee worker1 = new Employee(34, "Edward", 2022, 10, 20, "Sweets");
        System.out.println(worker1.toString());
        System.out.println(worker1.calculateExperience());
        System.out.println(worker1.calculateSalary());


        Employee manager1 = new Manager(2, "John", 2020, 11, 24, "Food", 300);

        System.out.println(manager1.toString());
        System.out.println(manager1.calculateExperience());
        System.out.println(manager1.calculateSalary());


        Employee director = new Director(1, "Victor", 2016, 9, 5, "Market", 500);
        System.out.println(director.toString());
        System.out.println(director.calculateExperience());
        System.out.println(director.calculateSalary());

    }
}
