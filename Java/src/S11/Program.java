package S11;

import S11.models.TableModel;
import S11.presenters.BookingPresenters;
import S11.views.BookingView;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        TableModel model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenters presenters = new BookingPresenters(model, view);

        presenters.updateTablesUI();

        view.reservationTable(new Date(), 2, "Aleksander");
        view.reservationTable(new Date(), 3, "Nikolay");
        view.changeReservationTable(101,new Date(), 2, "Olga");

    }
}
