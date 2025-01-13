package melearningoop.week62;

// EmailLogger subclass
public class EmailLogger extends BaseLogger {
    @Override
    public void log(String message) {
        System.out.println("Logged to email: " + message);
    }
}
