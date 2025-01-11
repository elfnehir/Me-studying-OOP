package melearningoop.week51;

public class Teacher extends Person {  
    private String subject;
    private int yearsOfExperience;

    public Teacher(int id, String firstName, String lastName, int age, String email, String subject, int yearsOfExperience) {
        super(id, firstName, lastName, age, email);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
    }

    public void retire() {
        if (yearsOfExperience < 30 || age < 55) {
            System.out.println("You are not eligible to retire yet!");
        } else {
            System.out.println("Congratulations, you are eligible to retire!");
        }
    }
    public void list() {
        System.out.println("ID: " + id + ", First Name: " + firstName + ", Last Name: " + lastName + ", Email: " + email + ", Subject: " + subject + ", Years of Experience: " + yearsOfExperience);
        System.out.println("Teacher's details listed");
    }
}
