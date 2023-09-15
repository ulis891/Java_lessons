package OOP.S5.presenters;

import OOP.S5.models.Reservation;
import OOP.S5.models.Table;

import java.util.Collection;

public interface View {
    void setObserver(ViewObserver observer);
    void showTables(Collection<Table> tables);
    void showReservationResult(int reservationID);

    void showReservation(Reservation reservation);

    void showOldReservation(Reservation res);
}
