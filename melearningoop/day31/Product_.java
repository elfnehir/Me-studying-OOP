package melearningoop.day31;

// Constructor
public class Product_ {

    public Product_(int id, String name, String description, double price, int stockAmount, String colour) {
        System.out.println("Yapıcı blok çalıştı.");
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.colour = colour;
    }

    public Product_(){
        //overloading
    }

    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String colour;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return this.name.substring(0, 1) + id;
    }
}
