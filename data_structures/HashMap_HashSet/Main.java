package HashMap_HashSet;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Gafar", "Jey");
        Student student2 = new Student("Milana", "Grey");
//MapSet
        MapStudents mapStudents = new MapStudents();

        mapStudents.addStudent(4, student1);
        mapStudents.addStudent(1, student2);
        mapStudents.allStudents();
        mapStudents.removeStudent(4);
        mapStudents.allStudents();

//HashSet
        SetStudents setStudents = new SetStudents();
        setStudents.addStudent(7, student1);
        setStudents.addStudent(3, student2);

        setStudents.removeStudent(3);

        try {
            setStudents.removeStudent(20);
        } catch (StudentNotFound e) {
            System.out.println(e.getMessage());
        }

        setStudents.allStudents();
    }
}
