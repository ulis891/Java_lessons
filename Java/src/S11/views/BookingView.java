package S11.views;

import S11.models.Reservation;
import S11.models.Table;
import S11.presenters.View;
import S11.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private ViewObserver observer;

    /**
     * Установить наблюдателя, отслеживающего действия пользователя
     * @param observer наблюдатель
     */
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    public void showTables(Collection<Table> tables){
        for (Table table: tables) {
            System.out.println(table);
        }
    }

    @Override
    public void showReservationResult(int reservationID) {
        if (reservationID > 0){
            System.out.printf("Столик успешно забронирован. Номер вашей брони: %d\n", reservationID);
        }
        else {
            System.out.println("Не удалось забронировать столик. Попробуйте ещё раз.");
        }
    }

    public void showReservation(Reservation reservation){
        System.out.println(reservation);
    }

    @Override
    public void showOldReservation(Reservation res) {
        System.out.println("\nБыло бронирование: \n" + res );
        System.out.println("\nСтало бронирование: " );
    }


    /**
     * Клиент нажал на кнопку бронирования столика
     * @param reservationDate Дата бронирования
     * @param tableId ID столика
     * @param name Имя клиента
     */
    public void reservationTable(Date reservationDate, int tableId, String name){
        if (observer != null){
            observer.onReservationTable(reservationDate, tableId, name);
        }
    }

    /**
     * Клиент нажал на кнопку изменения бронирования
     * @param oldReservation
     * @param reservationDate
     * @param tableId
     * @param name
     */
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableId, String name){
        if (observer != null){
            observer.changeReservationTable(oldReservation, reservationDate, tableId, name);
        }
//todo HW
    }
}
