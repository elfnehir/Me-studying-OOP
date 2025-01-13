package melearningoop.week61;

public class Main02 {
    public static void main(String[] args) {
        CreditUI creditUI = new CreditUI();
        
        // Using polymorphism: passing different subclasses of BaseCreditManager
        creditUI.CalculateCredit(new AgricultureCreditManager());
        creditUI.CalculateCredit(new TeacherCreditManager());
        creditUI.CalculateCredit(new StudentCreditManager());
    }
}
