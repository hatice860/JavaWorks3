public class InstructorManager extends UserManager{
 public void add(Instructor instructor){
  System.out.println("Kullanıcı eklendi"+instructor.getFirstName());
 }

 public void update(Instructor instructor){
  System.out.println("Kullanıcı güncellendi"+instructor.getFirstName());
 }

 public void delete(Instructor instructor){
  System.out.println("Kullanıcı silindi"+instructor.getFirstName());
 }

 public void list(Instructor instructor){
  System.out.println("Kullanıcı listelendi"+instructor.getFirstName());
    }
 }




