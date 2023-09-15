package OOP.S5.presenters;

import java.util.Date;

public interface ViewObserver {
    void onReservationTable(Date reservationDate, int tableId, String name);
    void changeReservationTable(int oldReservation, Date reservationDate, int tableId, String name);

}
