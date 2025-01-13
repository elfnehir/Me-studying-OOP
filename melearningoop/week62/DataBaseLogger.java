package melearningoop.week62;

// DatabaseLogger subclass
public class DataBaseLogger extends BaseLogger {
    @Override
    public void log(String message) {
        System.out.println("Logged to database: " + message);
    }
}
