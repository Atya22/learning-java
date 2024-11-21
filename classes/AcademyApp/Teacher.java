package AcademyApp;

public class Teacher extends Academy {
    private int teacherId;
    private String subject;
    private Academy academy; // Ссылка на академию


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public Academy getAcademy() {
        return academy;
    }

    public void setAcademy(Academy academy) {
        this.academy = academy;
    }

    public Teacher() {
    }

    public Teacher(int teacherId, String subject) {
        this.teacherId = teacherId;
        this.subject = subject;
    }

    public Teacher(int teacherId, String subject, Academy academy) {
        this.teacherId = teacherId;
        this.subject = subject;
        this.academy = academy;
    }

    public void teach() {
        System.out.println("Teacher with ID " + teacherId + " is teaching " + subject);
    }

    public void displayInfo() {
        System.out.println("Teacher with ID " + teacherId + " is teaching " + subject +
                " at academy " + academy.getName());
    }

}
