package melearningoop.day51;

public class Student extends Person{
    private int gpa;
    public Student(int id, String firstName, String lastName, int age, String email, int gpa) {
        super(id, firstName, lastName, age, email);
        this.gpa = gpa;
    }
    public int getGpa() {
        return gpa;
    }
    public void setGpa(int gpa) {
        this.gpa = gpa;
    }
    public void graduate() {
        if (age < 22) { 
            System.out.println("You are too young to graduate!");
        } else if (gpa < 2.0) { 
            System.out.println("You need to improve your GPA to graduate!");
        } else { 
            System.out.println("Congratulations, you have graduated!");
        }
    }
    public void list() {
        System.out.println("ID: " + id + ", First Name: " + firstName + ", Last Name: " + lastName + ", Age: " + age + ", GPA: " + gpa + ", Email: " + email);
        System.out.println("Student's details listed");
    }
}
    
