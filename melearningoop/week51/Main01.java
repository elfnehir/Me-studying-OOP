package melearningoop.week51;

public class Main01 {
    public static void main(String[] args) {

        Student[] student = new Student[]{
            new Student(1, "John", "Doe", 20, "x@email.com", 3),
            new Student(2, "Jane", "Doe", 21, "y@email.com", 2),
            new Student(3, "Bob", "Doe", 22, "z@email.com",4)
        };
        
        Teacher[] teacher = new Teacher[]{
            new Teacher(1, "Chris", "Doe", 30,"xyz@email.com","Math", 10),
            new Teacher(2, "Jamie", "Doe", 55,"yzx@email.com","Science", 20),
            new Teacher(3, "Bobby", "Doe", 50,"zyx@email.com","English", 25),
            new Teacher(4, "Jenny", "Doe", 60,"xzy@email.com","History", 30),
            new Teacher(5,"Jill","Doe", 40,"zxy@email.com","Art", 15)
        };

        for (Student s : student) {
            System.out.println("________________________");
            s.list();
            s.graduate();
        }
        for (Teacher t : teacher) {
            System.out.println("________________________");
            t.list();
            t.retire();
        }
    }
}
