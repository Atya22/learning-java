package HashMap_HashSet;

public class Student {
    private String name;
    private String sureName;
    private int id;

    public Student(String name, String sureName, int id) {
        this.name = name;
        this.sureName = sureName;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sureName='" + sureName + '\'' +
                ", id=" + id +
                '}';
    }
}
