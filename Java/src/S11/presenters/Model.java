package S11.presenters;

import S11.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {
    public Collection<Table> loadTables();
    int reservationTable(Date reservationData, int tableId, String name);

    int changeReservationTable(int oldReservation, Date reservationDate, int tableId, String name);

    Table getTable(int tableID);
}
