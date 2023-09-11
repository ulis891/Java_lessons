package S11.models;

import java.util.Date;

public class Reservation {
    private static  int counter = 100;
    private final int id;

    private final Date data;
    private final String name;

    {
        id = ++counter;
    }

    public Reservation(Date data, String name) {
        this.data = data;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Бронирование: " + id +
                "\nна дату: " + data +
                "\nна имя: " + name;
    }
}
