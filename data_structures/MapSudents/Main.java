package MapSudents;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Gafar", "Jey");
        Student student2 = new Student("Milana", "Grey");
        Students students = new Students();

        students.addStudent(4, student1);
        students.addStudent(1, student2);
        students.allStudents();
        students.removeStudent(4);
        students.allStudents();
    }
}
