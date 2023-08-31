package S8.HW8;

public class Cat {
    private String name;
    private int appetite;

    private boolean satiety;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void eat(boolean feed) {
        this.satiety = feed;
    }

    public void info(){
        String status = "Голоден";
        if (this.satiety) {
             status = "Сыт";
        }
        System.out.println(this.name + " : " + status);
    }
}
