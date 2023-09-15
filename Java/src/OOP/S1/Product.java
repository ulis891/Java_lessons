package OOP.S1;

public class Product {
    protected String name;
    protected String brand;
    protected double price;

    public Product(){
        /* Конструктор по умолчанию */
        this("NoName");
    }

    public Product(String name){
        /* Конструктор по умолчанию */
        this(name, "NoName");
    }

    public Product(String name, String brand){
        /* Конструктор по умолчанию */
        this(name,brand, 100);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        checkName(name);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        checkBrand(brand);
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        checkPrice(price);
    }

    public Product(String name, String brand, double price){
        /* свой конструктор */
        checkName(name);
        checkBrand(brand);
        checkPrice(price);
    }

    private void checkName(String name){
        if (name == null || name.length() < 3){
            this.name = "NoName";
        }
        else {
            this.name = name;
        }
    }

    private void checkBrand(String brand){
        if (brand == null || brand.length() < 3){
            this.brand = "NoName";
        }
        else {
            this.brand = brand;
        }
    }

    private void checkPrice(double price){
        if (price < 100){
            throw new RuntimeException("Некорректная цена товара.");
        }
        else {
            this.price = price;
        }
    }

    String displayInfo(){
        return String.format("%s - %s - %.2f", name,brand,price);
    }
}
