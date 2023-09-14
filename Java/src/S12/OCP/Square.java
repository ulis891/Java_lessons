package S12.OCP;

public class Square implements Shape{

    public Square(int said) {
        this.said = said;
    }

    public int getSaid() {
        return said;
    }

    private final int said;


    @Override
    public double getArea() {
        return said * said;
    }
}
