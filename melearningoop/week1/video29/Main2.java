package melearningoop.week1.video29;

public class Main2 {
    public static void main(String[] args) {
        // reference type
        CustomerManager2 customerManager = new CustomerManager2();
        CustomerManager2 customerManager2 = new CustomerManager2();

        customerManager = customerManager2;

        System.out.println("Referans tip işlemleri başlıyor...");
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        // value type
        System.out.println("Primitive tip işlemleri başlıyor...");
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println("sayi2: " + sayi2);

        // arrays
        System.out.println("Dizi işlemleri başlıyor...");
        int[] sayilar1 = new int[]{1, 2, 3};
        int[] sayilar2 = new int[]{4, 5, 6};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println("sayilar2[0]: " + sayilar2[0]);
    }
}
