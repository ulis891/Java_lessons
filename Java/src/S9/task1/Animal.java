package S9.task1;

public abstract class Animal {
    protected String name;
    private int maxRun;
    private int maxSwim;

    private static int idCounter = 1000;

    private static int counter;
    private final int id;

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxSwim() {
        return maxSwim;
    }

    {
        System.out.println("Initializer - Animal");
        id = ++idCounter;
        counter++;
    }

    public Animal(String name, int maxRun, int maxSwim) {
        System.out.println("Constructor - Animal");
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public void run(int distance){
        if (distance <= maxRun){
            System.out.printf("%s пробежал %d метров.\n", name, distance);
        }
        else System.out.printf("%s не смог пробежать %d метров.\n", name, distance);
    }
    public void swim(int distance){
        if (distance <= maxSwim){
            System.out.printf("%s проплыл %d метров.\n", name, distance);
        }
        else System.out.printf("%s не смог проплыть %d метров.\n", name, distance);
    }
}
