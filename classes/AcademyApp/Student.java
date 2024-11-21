package AcademyApp;

public class Student extends Academy {
    private int studentId;
    private String course;
    private Academy academy; // Ссылка на академию


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Academy getAcademy() {
        return academy;
    }

    public void setAcademy(Academy academy) {
        this.academy = academy;
    }

    public Student() {
    }


    public Student(int studentId, String course) {
        this.studentId = studentId;
        this.course = course;
    }

    public Student(int studentId, String course, Academy academy) {
        this.studentId = studentId;
        this.course = course;
        this.academy = academy;
    }

    public void study() {
        System.out.println("Student with ID " + studentId + " is studying " + course);
    }

    public void displayInfo() {
        System.out.println("Student with ID " + studentId + " is studying " + course +
                " at academy " + academy.getName());
    }

}
