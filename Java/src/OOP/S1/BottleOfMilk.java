package OOP.S1;

public class BottleOfMilk extends Product{

    private double volume;
    private  int fat;

    public double getVolume() {
        return volume;
    }

    public int getFat() {
        return fat;
    }

    public BottleOfMilk(String name, String brand, double price, double volume, int fat){
        super(name,brand,price);
        this.volume = volume;
        this.fat = fat;
    }

    @Override
    String displayInfo() {
        return String.format("[Бутылка с молоком] %s - %s - %.2f - v: %.2f - f: %d", name, brand, price, volume, fat);
    }
}
