public class Student extends User {


    private String studentNo;

    public Student(String firstName, String lastName, String eMail, String password, String studentNo) {
        super(firstName, lastName, eMail, password);
        this.setStudentNo(studentNo);
    }


    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }
}
