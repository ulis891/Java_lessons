package S11.models;

import java.util.ArrayList;
import java.util.Collection;

public class Table {

    private  static int counter;
    private final int id;
    private final Collection<Reservation> reservations = new ArrayList<>();


    public static int getCounter() {
        return counter;
    }

    public Collection<Reservation> getReservations() {
        return reservations;
    }

    public int getId() {
        return id;
    }

    {
        id = ++counter;
    }

    @Override
    public String toString() {
        return "Столик: " + id;
    }
}
