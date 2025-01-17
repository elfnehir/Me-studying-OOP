package melearningoop.day03;
//ex1
public class Main3{
    
    public static void main(String[] args){

        Student student= new Student();
        student.age=21;
        student.id=01;
        student.name="Emily";
        System.out.println("Student's name: " + student.name + ", age: " + student.age + ", id: " + student.id );
        student.addStudent();
    }
}
