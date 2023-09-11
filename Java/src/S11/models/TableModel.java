package S11.models;

import S11.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {
    private static Collection<Table> tables;

    public Collection<Table> loadTables(){
        if (tables == null){
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    /**
     *Бронирование столика
     * @param reservationData Дата бронирования
     * @param tableID номер столика
     * @param name Имя клиента
     * @return номер брони
     */
    public int reservationTable(Date reservationData, int tableID, String name){
        for (Table t:tables){
            if (t.getId() == tableID){
                Reservation reservation = new Reservation(reservationData, name);
                t.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        return -1;
    }

    /**
     *Изменение брони
     * @param oldReservation старый ID бронирования
     * @param tableID номер столика
     * @param name Имя клиента
     * @return номер брони
     */
    public int changeReservationTable(int oldReservation, Date reservationData, int tableID, String name) {
        for (Table t : tables) {
            if (t.getId() == tableID) {
                for (Reservation res : t.getReservations()) {
                    if (res.getId() == oldReservation) {
                        Reservation reservation = new Reservation(reservationData, name);
                        t.getReservations().add(reservation);
                        return reservation.getId();
                    }
                }
            }
        }
        return -1;
    }

    public Table getTable(int tableID) {
        for (Table t: tables) {
            if (t.getId() == tableID) {
                return t;
            }
        }
        return null;
    }
}
