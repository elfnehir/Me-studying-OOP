package melearningoop.day43;

public class Student2 {
    private int id;
    private String name;
    private int age;

    // Constructor
    public Student2(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Graduate method
    public void graduate() {
        if (age < 22) {
            System.out.println("You are too young to graduate!");
        } else {
            System.out.println("Congratulations, you have graduated!");
        }
    }

    // List function to display student details
    public void list() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }
}
