package OOP.S7.adapter;

import java.time.LocalDateTime;

public class AdapterST500 implements MeteoSensor {

    private SensorTemperature sensor;

    public AdapterST500(SensorTemperature sensor) {
        this.sensor = sensor;
    }

    @Override
    public int getId() {
        return sensor.getId();
    }

    @Override
    public double getTemperature() {
        return sensor.temerature();
    }

    @Override
    public double getHumidity() {
        return 0;
    }

    @Override
    public double getPressure() {
        return 0;
    }

    @Override
    public LocalDateTime getDateTime() {
        return LocalDateTime.now();
    }
}
