package OOP.S7.observer;

public class Freelancer implements Observer{

    private String name;

    private int salary = 55000;

    public Freelancer(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String companyName, String post, int salary) {
        if (this.salary <= salary){
            System.out.printf("Фрилансер: %s: Мне нужна эта работа! (Компания: %s; Должность: %s; Заработная плата: %d)\n",
                    name, companyName, post, salary);
            this.salary = salary;
        }
        else{
            System.out.printf("Фрилансер: %s: Я найду работу получше! (Компания: %s; Должность: %s; Заработная плата: %d)\n",
                    name, companyName, post, salary);
        }
    }
}
