package melearningoop.day72;

public class Main07 {
    public static void main(String[] args) {
        ICustomerDal customerDal = new MySqlCustomerDal();
        customerDal.Add();
    }
}
