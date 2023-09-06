package S10.HW;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    protected ArrayList<T> fruits;

    private int size;

    public Box(ArrayList<T> fruits) {
        this.fruits = fruits;
    }



    @Override
    public String toString() {
        return "Box{" + " weight=" + getWeight() +
                '}';
    }



    protected float getWeight(){
        if (fruits == null)
            return 0;
        else {
            return fruits.size() * fruits.get(0).getWeight();
        }
    }



    protected void add(ArrayList<T> fruits){
        this.fruits = fruits;
    }

    protected boolean compare(Box box){
        if (this.getWeight() == box.getWeight()) {
            return true;
        }
        else return false;
    }

//    protected void relocate(Box<T> boxOut){
//        if (T  instanceof boxOut.fruits ) {
//            // todo доделать
//        }
//        else {
//            System.out.println("Нельзя смешивать фрукты!");
//        }
//    }

}


