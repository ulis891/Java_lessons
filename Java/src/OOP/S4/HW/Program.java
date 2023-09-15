package OOP.S4.HW;

public class Program {
    public static void main(String[] args) {

        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        appleBox1.add2(apple1);
        appleBox1.add2(apple2);
        appleBox1.add2(apple3);

        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();
        Apple apple7 = new Apple();
        Apple apple8 = new Apple();
        appleBox2.add2(apple4);
        appleBox2.add2(apple5);
        appleBox2.add2(apple6);
        appleBox2.add2(apple7);
        appleBox2.add2(apple8);

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        orangeBox.add2(orange1);
        orangeBox.add2(orange2);


        System.out.println(orangeBox);
        System.out.println(appleBox1);
        System.out.println(appleBox2);

        System.out.println(orangeBox.compare(appleBox1));
        System.out.println(appleBox1.compare(appleBox2));

        appleBox1.relocate(appleBox2);
        System.out.println(appleBox1);
        System.out.println(appleBox2);

        appleBox1.relocate(orangeBox);


    }
}
