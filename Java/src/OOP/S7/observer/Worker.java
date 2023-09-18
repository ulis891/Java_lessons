package OOP.S7.observer;

public class Worker implements Observer{
    private String name;

    private int salary = 80000;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String companyName, String post, int salary) {
        if (this.salary <= salary){
            System.out.printf("Рабочий: %s: Мне нужна эта работа! (Компания: %s; Должность: %s; Заработная плата: %d)\n",
                    name, companyName, post, salary);
            this.salary = salary;
        }
        else{
            System.out.printf("Рабочий: %s: Я найду работу получше! (Компания: %s; Должность: %s; Заработная плата: %d)\n",
                    name, companyName, post, salary);
        }
    }
}
