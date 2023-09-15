package OOP.S5;

import OOP.S5.models.TableModel;
import OOP.S5.presenters.BookingPresenters;
import OOP.S5.views.BookingView;

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
