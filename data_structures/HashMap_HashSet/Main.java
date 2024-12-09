package HashMap_HashSet;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Gafar", "Jey");
        Student student2 = new Student("Milana", "Grey");
        Student student3 = new Student("Ali", "AA");

////HashSet
//        SetStudents setStudent = new SetStudents();
//
//        setStudent.addStudent(4, student1);
//        setStudent.addStudent(1, student2);
//        setStudent.allStudents();
//        setStudent.removeStudent(4);
//        setStudent.allStudents();



//HashMap
        System.out.println();
        System.out.println();;
        MapStudents mapStudents = new MapStudents();
        mapStudents.putStudent(7, student1);
        mapStudents.putStudent(3, student2);
        mapStudents.putStudent(3, student3);

        try {
            var student = mapStudents.getStudent(3);
            System.out.println(student);
        } catch (StudentNotFound e){
            System.out.println(e.getMessage());
        }

//        setStudents.removeStudent(3);

        try {
            mapStudents.removeStudent(20);
        } catch (StudentNotFound e) {
            System.out.println(e.getMessage());
        }

        mapStudents.printStudents();
    }
}
