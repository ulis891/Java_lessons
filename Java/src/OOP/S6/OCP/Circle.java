package OOP.S6.OCP;

public class Circle implements Shape{
    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    private final int radius;


    @Override
    public double getArea() {
        return Math.PI * this.getRadius() * this.getRadius();
    }
}
