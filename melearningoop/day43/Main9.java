package melearningoop.day43;

public class Main9 {
    public static void main(String[] args) {
        // students is an array of Student2 objects
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

/*students is an array of objects.
student is a temporary variable used in the loop to refer to the current object.
Enhanced for loop iterates through each element in the array, one by one.
student is a variable like x in a for loop, it is used to refer to the current object in the array.
*/