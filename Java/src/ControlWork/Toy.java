package ControlWork;

public class Toy {
    protected int id;
    protected String name;
    private int quantity;
    private double probability;

    private static int nextId = 0;

    public Toy(String name, int quantity, double probability) {
        this.id = ++nextId;
        this.name = name;
        this.quantity = quantity;
        this.probability = probability;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(float probability) {
        this.probability = probability;
    }

    @Override
    public String toString() {
        return "id = " + id + ", " + name +
                ", Осталось в магазине = " + quantity +
                ", вероятность выйграть = " + probability * 100 + "%\n";
    }
}




