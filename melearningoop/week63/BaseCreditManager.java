package melearningoop.week63;

public class BaseCreditManager {
    public double calculate(double amount) {
        return amount * 1.18;
    }
 /* 
 * If we use:
 * public final double calculate(double amount) {
 * instead of:
 * public double calculate(double amount) {
 * 
 * We cannot override the calculate method in the subclasses 
 * because the 'final' keyword prevents method overriding.
 */
}
