package HashMap_HashSet;

import java.util.HashMap;
import java.util.Map;

public class MapStudents {
    private Integer id;
    private Student student;

    Map<Integer, Student> students = new HashMap<>();

    public MapStudents() {
    }

    public MapStudents(Integer id, Student student) {
        this.student = student;
        this.id = id;
    }

    public void addStudent(Integer id, Student student) {
        students.put(id, student);
        System.out.println("Student added:" + student.getName());
    }

    public void removeStudent(Integer id) {
        students.remove(id);
    }


    public void allStudents() {
        System.out.println(students.values());
    }
}
