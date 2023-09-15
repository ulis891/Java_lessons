package OOP.S2.HW8;

public class Plate {
        private int food;
        public Plate(int food) {
            this.food = food;
        }

    public int getFood() {
        return food;
    }

    public boolean setFood(int food, int appetite) {
        if (food - appetite < 0) {
            System.out.println("Need more food!!!");
            this.food = food;
            return false;
        }
        else {
            this.food = food - appetite;
            return true;
        }

    }

    public void addFood(int food){
            this.food += food;
    }

    public void info() {
            System.out.println("Осталось еды: " + food);
        }

}
