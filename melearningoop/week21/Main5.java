package melearningoop.week21;

//video31
public class Main5 {
    public static void main(String[] args) {
        Product product =new Product();
        ProductManager productManager =new ProductManager();
        product.name = "Laptop";
        product.id=1;
        product.descripciton="Asus Laptop";
        product.price=40000;
        product.stockAmount=3;
        System.out.println(product.name);
        System.out.println(product.id);
        productManager.add();
    } 
}
