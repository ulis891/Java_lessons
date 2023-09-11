package S11.presenters;

import S11.models.Reservation;

import java.util.Collection;
import java.util.Date;

public interface ViewObserver {
    void onReservationTable(Date reservationDate, int tableId, String name);
    void changeReservationTable(int oldReservation, Date reservationDate, int tableId, String name);

}
