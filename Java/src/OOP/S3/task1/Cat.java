package OOP.S3.task1;

public class Cat extends Animal{

    private static int counter;

    public static int getCounter() {
        return counter;
    }
    public Cat(String name) {
        super(name, 200, 0);
        System.out.println("Construction - Cat");
    }

    {
        System.out.println("Initializer - Cat");
        counter++;
    }


    @Override
    public void swim(int distance) {
        System.out.printf("%s не умеет плавать.\n", name);
    }
}
