package S11.presenters;

import S11.models.Reservation;
import S11.models.Table;

import java.util.Collection;

public interface View {
    void setObserver(ViewObserver observer);
    void showTables(Collection<Table> tables);
    void showReservationResult(int reservationID);

    void showReservation(Reservation reservation);

    void showOldReservation(Reservation res);
}
