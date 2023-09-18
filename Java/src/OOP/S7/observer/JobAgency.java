package OOP.S7.observer;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher{

    private List<Observer> observers = new ArrayList<>();


    @Override
    public void sendOffer(Vacancy vacancy) {
        for (Observer observer: observers) {
            if (vacancy.isFreelance()){
                observer.receiveOffer(vacancy.getCompanyName(), vacancy.getPost(), vacancy.getSalary());
            } else if (observer.getClass() != Freelancer.class) {
                observer.receiveOffer(vacancy.getCompanyName(), vacancy.getPost(), vacancy.getSalary());
            }
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
