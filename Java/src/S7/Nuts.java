package S7;

public class Nuts extends Product {
    private double weight;

    public double getWeight() {
        return weight;
    }

    public Nuts(String name, String brand, double price, double weight) {
        super(name, brand, price);
        this.weight = weight;
    }

    @Override
    String displayInfo() {
        return String.format("[Орехи] %s - %s - %.2f - w: %.2f", name, brand, price, weight);
    }
}
