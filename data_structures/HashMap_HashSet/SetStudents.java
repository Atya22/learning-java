package HashMap_HashSet;

import java.util.HashMap;
import java.util.Map;

public class SetStudents {
    private int id;
    private Student student;

    public SetStudents() {
    }

    Map<Integer, Student> students = new HashMap<>();

    public SetStudents(int id, Student student) {
        this.id = id;
        this.student = student;
    }

    public void addStudent(int id, Student student){
        students.put(id, student);
        System.out.println("Student added: " + student);
    }

    public void removeStudent(int id) throws StudentNotFound {
        if (!students.containsKey(id)){
            throw new StudentNotFound("Student with ID" + id + " not found");
        }
        students.remove(id);
        System.out.println("Student with ID = " + id + " removed");
    }

    public void allStudents(){
        System.out.println(students.values());
    }
}
