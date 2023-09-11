package S11.presenters;

import S11.models.Reservation;
import S11.models.Table;

import java.util.Collection;
import java.util.Date;

public class BookingPresenters implements ViewObserver {

    private final Model model;
    private final View view;

    public BookingPresenters(Model model, View view) {
        this.model = model;
        this.view = view;
        this.view.setObserver(this);
    }

    public Collection<Table> loadTables(){
       return model.loadTables();
    }

    public void updateTablesUI(){
        view.showTables(loadTables());
    }
    public void updateReservationResultUI(int reservationID){
        view.showReservationResult(reservationID);
    }
    public void changeReservationResultUI(Table table, int reservationID){
        Collection<Reservation> reservation = table.getReservations();
        for (Reservation res: reservation) {
            if (res.getId() == reservationID) {
                view.showReservation(res);
            }
        }
    }
    public void updateReservationResultUI3(Table table, int reservationID){
        Collection<Reservation> reservation = table.getReservations();
        for (Reservation res: reservation) {
            if (res.getId() == reservationID) {
                view.showOldReservation(res);
            }
        }
    }


    @Override
    public void onReservationTable(Date reservationDate, int tableId, String name) {
        int reservationID = model.reservationTable(reservationDate, tableId, name);
        updateReservationResultUI(reservationID);
    }

    @Override
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableId, String name) {
        updateReservationResultUI3(model.getTable(tableId), oldReservation);
        int reservationID = model.changeReservationTable(oldReservation,reservationDate, tableId, name);
        changeReservationResultUI(model.getTable(tableId), reservationID);
    }
}
