package melearningoop.day51;

public class Person {
    int id;
    String firstName;
    String lastName;
    int age;
    String email;

    public Person(int id, String firstName, String lastName, int age, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    public void list() {
        System.out.println("ID: " + id + ", First Name: " + firstName + ", Last Name: " + lastName + ", Age: " + age + ", Email: " + email);
        System.out.println("Person details listed");
    }
}
