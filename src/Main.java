public class Main {

    public static void main(String[] args) {
        User user = new User("Hatice", "Ay", "haticeay@email.com", "12345");

        Student student = new Student("", "", "", "", "12345");
        Instructor instructor = new Instructor("", "", "", "");
        StudentManager studentManager = new StudentManager();
        studentManager.delete(student);
        UserManager userManager = new UserManager();
        userManager.add(user);
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.list(instructor);


    }
}
