package melearningoop.day21;

public class Product {
    //attribute & field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String colour;
    private String code;
    //to generate getters/setters Ctrl + .
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

    //getter
    public int getId(){
        return id;
    }

    //setter
    public void setId(int id) {
    this.id = id; // 'this' refers to the current object's 'id' field
    }

    public String getCode() {
        return this.name.substring(0,1) + id;
    } //read-only
    
    /*
    public void setCode(String code) {
        this.code = code;
    }
     */
}
  