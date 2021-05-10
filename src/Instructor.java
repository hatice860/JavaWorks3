public class Instructor extends User{
    private String ınstructorId;
    public Instructor(String firstName, String lastName, String eMail, String password) {
        super(firstName, lastName, eMail, password);
    }

    public String getInstructorId() {
        return ınstructorId;
    }

    public void setInstructorId(String ınstructorId) {
        this.ınstructorId = ınstructorId;
    }
}
