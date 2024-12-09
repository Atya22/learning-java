package HashMap_HashSet;

public class Student {
    private String name;
    private String sureName;

    public Student(String name, String sureName) {
        this.name = name;
        this.sureName = sureName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sureName='" + sureName + '\'' +
                '}';
    }
}
