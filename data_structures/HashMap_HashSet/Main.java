package HashMap_HashSet;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Gafar", "Jey", 4);
        Student student2 = new Student("Milana", "Grey", 43);
        Student student4 = new Student("Alla", "Puqacova", 43);
        Student student5 = new Student("Alla", "Puqacova", 42);

//HashSet
        SetStudents setStudents = new SetStudents();
        setStudents.addStudent(student1);
        setStudents.addStudent(student2);
        setStudents.addStudent(student4);
        setStudents.addStudent(student5);

        setStudents.printStudents();

//HashMap
        MapStudents mapStudents = new MapStudents();
        mapStudents.putStudent(student1);
        mapStudents.putStudent(student2);
        mapStudents.putStudent(student4);
        mapStudents.putStudent(student5);

        mapStudents.printStudents();

//        get student with a specific ID.
        try {
            var student = mapStudents.getStudent(5);
            System.out.println(student);
        } catch (StudentNotFound e) {
            System.out.println(e.getMessage());
        }

//        remove student by the ID.
        try {
            mapStudents.removeStudent(20);
            mapStudents.removeStudent(4);
        } catch (StudentNotFound e) {
            System.out.println(e.getMessage());
        }

        try {
            mapStudents.removeStudent(4);
        } catch (StudentNotFound e) {
            System.out.println(e.getMessage());
        }

        mapStudents.printStudents();
    }
}
