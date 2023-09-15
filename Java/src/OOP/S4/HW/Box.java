package OOP.S4.HW;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    protected ArrayList<T> fruits;


    public Box() {
        this.fruits = new ArrayList<>();
    }


    @Override
    public String toString() {
        if (fruits.isEmpty()) {
            return "Ящик пустой";

        }
        return String.valueOf(this.fruits.get(0).getClass()).split("\\.")[2] +
                "Box" + " весом = " + getWeight() + " кг.";
    }


    protected float getWeight() {
        if (fruits == null)
            return 0;
        else {
            return fruits.size() * fruits.get(0).getWeight();
        }
    }


    protected void add(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    protected void add2(T fruit) {
        this.fruits.add(fruit);
    }

    protected boolean compare(Box box) {
        if (this.getWeight() == box.getWeight()) {
            System.out.printf("Вес обоих ящиков %.2f кг.\n", this.getWeight());
            return true;
        } else {
            System.out.println("Вес ящиков разный.");
            return false;
        }
    }


    protected void relocate(Box boxOut) {
        if (this.fruits.get(0).getClass().equals(boxOut.fruits.get(0).getClass())) {
            this.fruits.addAll(boxOut.fruits);
            boxOut.fruits = new ArrayList<T>();
            String frt = String.valueOf(this.fruits.get(0).getClass()).split("\\.")[2];
            System.out.printf("Теперь ящик %sBox весит %.2f кг.\n", frt, this.getWeight());
        } else {
            System.out.println("Нельзя смешивать фрукты!");

        }
    }
}




