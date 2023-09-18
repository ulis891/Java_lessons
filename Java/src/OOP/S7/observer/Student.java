package OOP.S7.observer;

public class Student implements Observer{
    private String name;

    private int salary = 2000;

    public Student(String name) {
        this.name = name;
    }


    @Override
    public void receiveOffer(String companyName, String post, int salary) {
        if (this.salary <= salary){
            System.out.printf("Студент: %s: Мне нужна эта работа на должноти %s! (Компания: %s; Должность: %s; Заработная плата: %d)\n",
                    name, post, companyName, post, salary);
            this.salary = salary;
        }
        else{
            System.out.printf("Студент: %s: Я найду работу получше! (Компания: %s; Должность: %s; Заработная плата: %d)\n",
                    name, companyName, post, salary);
        }
    }
}
