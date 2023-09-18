package OOP.S7.adapter;

public class ST500 implements SensorTemperature{

    private int id;

    public ST500(int id) {
     this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public double temerature() {
        return 0;
    }
}
