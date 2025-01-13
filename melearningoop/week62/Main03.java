package melearningoop.week62;

public class Main03 {
    public static void main(String[] args) {
        // Array of loggers to demonstrate polymorphism
        BaseLogger[] loggers = new BaseLogger[]{
            new DataBaseLogger(),
            new EmailLogger(),
            new FileLogger()
        };

        // Iterate over loggers and call log method
        for (BaseLogger logger : loggers) {
            logger.log("Log message");
        }

        // Inject a specific logger into CustomerManager
        CustomerManager customerManager = new CustomerManager(new DataBaseLogger());
        customerManager.add();
    }
}

