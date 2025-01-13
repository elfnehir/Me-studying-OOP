package melearningoop.week64;

public abstract class BaseGameCalculator {
    public abstract void calculate();
        // This method is abstract, so it must be overridden.
    public final void gameOver() {
        System.out.println("Game over!");
        // This method is final, so it cannot be overridden.
    }
}
