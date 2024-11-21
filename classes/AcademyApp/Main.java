package AcademyApp;

public class Main {
    public static void main(String[] args) {
        Academy academyInfo = new Academy("ItAcademy", "3968 Nickel Road, Los Angeles");
        academyInfo.displayInfo();
        System.out.println();

        Teacher teacherInfo = new Teacher(45, "Java back-end", academyInfo);
        teacherInfo.teach();
        teacherInfo.displayInfo();
        System.out.println();

        Student studentInfo = new Student(2, "Python", academyInfo);
        studentInfo.study();
        studentInfo.displayInfo();
    }
}
