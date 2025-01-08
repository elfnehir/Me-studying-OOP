package melearningoop.week31;
//video34
public class Main6 {
public static void main(String[] args) {
        Product_ product_ = new Product_(1,"Asus","Tuf Gaming",50000,8,"black");
        ProductManager_ productManager_ = new ProductManager_();

        System.out.println(product_.getCode());
        System.out.println(product_.getColour());
        System.out.println(product_.getDescription());
        System.out.println(product_.getId());
        System.out.println(product_.getName());
        System.out.println(product_.getPrice());
        System.out.println(product_.getStockAmount());
    }
}
