package S12.OCP;

public class RightTriangle implements Shape{

    public RightTriangle(int katet1, int katet2) {
        this.katet1 = katet1;
        this.katet2 = katet2;
        this.gipo = Math.sqrt(Math.pow(katet1,2) + Math.pow(katet2, 2));


    }

    public int getKatet1() {
        return katet1;
    }

    public int getKatet2() {
        return katet2;
    }

    public double getGipo() {
        return gipo;
    }

    private int katet1;
    private int katet2;
    private double gipo;

    @Override
    public double getArea() {
        return this.getKatet1() * this.getKatet2() / 2.0;
    }
}
