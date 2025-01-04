package melearningoop.week11.video30;

public class DortIslem {

    public int Sum(int sayi1, int sayi2){
        return sayi1 + sayi2;
    } //toplama

    public int Subtract(int sayi1, int sayi2){
        return sayi1 - sayi2;
    } //çıkarma

    public int Multiply(int sayi1, int sayi2){
        return sayi1 * sayi2;
    } //çarpma

    
    public int Divide(int sayi1, int sayi2) {
        if (sayi2 != 0) {
            return sayi1 / sayi2;
        } else {
            throw new ArithmeticException("Sıfıra bölme hatası!");
        }
     }
        
    
}
