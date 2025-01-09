package melearningoop.week43;

public class Main9 {
    public static void main(String[] args) {
        // Array of students
        Student2[] students = new Student2[] {
            new Student2(1, "John", 21),
            new Student2(2, "Jane", 22),
            new Student2(3, "Bob", 23)
        };

        // Loop through each student
        for (Student2 student : students) {
            System.out.println("________________________");
            student.list(); // Call the list() function to display details
            student.graduate(); // Check if the student can graduate
        }
    }
}
