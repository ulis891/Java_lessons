package S10.HW;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        ArrayList<Apple> apples = new ArrayList<>();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        apples.add(apple1);
        apples.add(apple2);
        apples.add(apple3);

        ArrayList<Orange> oranges = new ArrayList<>();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        oranges.add(orange1);
        oranges.add(orange2);
//        oranges.add(orange3);

        Box<Apple> appleBox = new Box<>(apples);
        Box<Orange> orangeBox = new Box<>(oranges);


        System.out.println(orangeBox);
        System.out.println(appleBox);
        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(orangeBox.compare(appleBox));

    }
}
