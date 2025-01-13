package melearningoop.week62;

// FileLogger subclass
public class FileLogger extends BaseLogger {
    @Override
    public void log(String message) {
        System.out.println("Logged to file: " + message);
    }
}
