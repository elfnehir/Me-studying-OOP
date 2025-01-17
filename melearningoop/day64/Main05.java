package melearningoop.day64;

public class Main05 {
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.calculate();
        womanGameCalculator.gameOver();

        BaseGameCalculator baseGameCalculator = new ManGameCalculator();
        baseGameCalculator.calculate();

    }
}
