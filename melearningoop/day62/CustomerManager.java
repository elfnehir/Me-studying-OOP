package melearningoop.day62;

public class CustomerManager {
    private BaseLogger logger;

    // Constructor to inject a specific logger
    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    }

    public void add() {
        System.out.println("Customer added.");
        this.logger.log("Log message.");
    }
}
