package melearningoop.week42;

public class EmployeeManager extends PersonManager {
    @Override
    public void List() {
        System.out.println("Employee listed");
    }

    @Override
    public void Add() {
        System.out.println("Employee added");
    }

    public void BestEmployee() {
        System.out.println("Best employee of the month!");
    }
}
