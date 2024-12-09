package HashMap_HashSet;

import java.util.HashMap;
import java.util.Map;

public class MapStudents {
    private final Map<Integer, Student> students = new HashMap<>();

    public MapStudents() {
    }

    public void putStudent(Student student) {
        students.put(student.getId(), student);
        System.out.println("Student added: " + student);
    }

    public void removeStudent(int id) throws StudentNotFound {
        if (!students.containsKey(id)) {
            throw new StudentNotFound("Student with ID = " + id + " not found");
        }
        students.remove(id);
        System.out.println("Student with ID = " + id + " removed");
    }

    public Student getStudent(int id) throws StudentNotFound {
        if (!students.containsKey(id)) {
            throw new StudentNotFound("Student with ID = " + id + " not found");
        }
        return students.get(id);
    }

    public void printStudents() {
        System.out.println(students.values());
    }
}
