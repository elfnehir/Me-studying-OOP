package melearningoop.week42;

public class CustomerManager extends PersonManager {
    @Override
    public void List() {
        System.out.println("Customer listed");
    }

    @Override
    public void Add() {
        System.out.println("Customer added");
    }
}
