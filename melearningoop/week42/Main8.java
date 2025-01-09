package melearningoop.week42;

//video36
public class Main8 {
    public static void main(String[] args) {

        Customer customer = new Customer();
        Employee employee = new Employee();

        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();
        
        customer.age=20;
        customer.email="xyz@gmail.com";
        customer.firstName="John";
        customer.lastName="Doe";
        customer.id=1;
        customerManager.Add();

        employee.age=30;
        employee.firstName="Jane";
        employee.lastName="Doe";
        employee.id=2;
        employeeManager.Add();

        System.out.println(customer);
        System.out.println(employee);
        
        customerManager.List();
        employeeManager.List();
        employeeManager.BestEmployee();
    }
}
