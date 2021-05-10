public class User {

    private String firstName;
    private String lastName;
    private String eMail;
    private String password;

    public  User(String firstName, String lastName, String eMail, String password){

        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.seteMail(eMail);
        this.setPassword(password);
    }

    public User(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
