package melearningoop.week1.video27;

public class Main {
    public static void main(String[] args) {
        //reference type
        CustomerManager customerManager = new CustomerManager();
        //class çağırımı (nesne adı)
        CustomerManager customerManager2 = new CustomerManager();
        //bu şekilde iki tane nesne tanımlarsak heap(bellek gibi düşün)'de ayrı ayrı
        //add remove oluşuyor stack'de de cm ve cm2 şeklinde nesneler ayrı ayrı tanımlanıyor
        customerManager = customerManager2;
        //cm2'yi cm'ye atadığımızda cm de cm2'nin heap'ini kullanıyor.
        //cm'ın referans no=cm2 oldu cm2 nin referans numarasnı aldı.
        //javaGarbageCollector cm'in referans numarasındaki heap'i kullanan biri olmadığı için siler
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

    }
}
