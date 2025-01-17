package melearningoop.day21;

//video31
public class Main5 {
    
    public static void main(String[] args) {
        Product product =new Product();
        ProductManager productManager =new ProductManager();
      /*  product.name = "Laptop";
        product.id=1;
        product.description="Asus Laptop";
        product.price=40000;
        product.stockAmount=3;
        System.out.println(product.name);
        System.out.println(product.id);
        productManager.Add(product);
         */
        product.setName("Laptop");
        product.setColour("Black");
        product.setId(1);
        product.setPrice(50000);
        product.setStockAmount(8);
        product.setDescription("null");

        System.out.println(product.getCode());
        System.out.println(product.getColour());
        System.out.println(product.getDescription());
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getStockAmount());
        productManager.Add(product);
    } 
}