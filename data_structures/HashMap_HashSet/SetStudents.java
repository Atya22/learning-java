package HashMap_HashSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SetStudents {
    private final HashSet<Student> students = new HashSet<>();

    public SetStudents() {
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) throws StudentNotFound {
        if (!students.contains(student)) {
            throw new StudentNotFound("Student: = " + student + " not found");
        }
        students.remove(student);
    }

    //    get student by the ID
    public Student getStudent(int id) throws StudentNotFound {
        for (Student st : students) {
            if (st.getId() == id) {
                return st;
            }
        }
        throw new StudentNotFound("The student with ID = " + id + " not found");
    }

    public void printStudents() {
        for (Student st : students) {
            String str = String.format("Student with ID = %s is called %s %s.",
                    st.getId(), st.getName(), st.getSureName());
            System.out.println(str);
        }
    }
}
