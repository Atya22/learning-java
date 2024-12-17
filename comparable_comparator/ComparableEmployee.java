public class ComparableEmployee implements Comparable<ComparableEmployee> {
    private String name;
    private Integer age;
    private Integer salary;


    public ComparableEmployee(String name, Integer age, Integer salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSalary() {
        return salary;
    }

    @Override
    public int compareTo(ComparableEmployee emp) {
//        return Integer.compare(this.salary, emp.salary);
        return emp.getName().compareTo(this.getName());
    }

    @Override
    public String toString() {
        return "ComparableEmployee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
