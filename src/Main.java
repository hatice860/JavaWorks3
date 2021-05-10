public class Main {

    public static void main(String[] args) {
        User user = new User("Hatice", "Ay", "haticeay@email.com", "12345");
        System.out.println(user.getFirstName());
        Student student = new Student("", "", "", "", "12345");

        StudentManager studentManager = new StudentManager();
        studentManager.delete(student);
        UserManager userManager = new UserManager();
        userManager.add(user);



    }
}
