package OOP.S7.observer;

public class Program {

    /**
     * TODO: Доработать приложение, которое разрабатывалось на семинаре, поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании),
     *  например, добавить тип вакансии (enum), учитывать тип вакансии при отправке предложения соискателю.
     *
     */
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        Company google = new Company("Google",  jobAgency,120000);
        Company yandex = new Company("Yandex",  jobAgency,90000);
        Company geekBrains = new Company("GeekBrains",  jobAgency,95000);

        Student student1 = new Student("Student1");
        Worker worker1 = new Worker("Worker1");
        Worker worker2 = new Worker("Worker2");
        Freelancer freelancer1 = new Freelancer("Freelancer1");

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(worker1);
        jobAgency.registerObserver(worker2);
        jobAgency.registerObserver(freelancer1);

        for (int i = 0; i < 3; i++){
            yandex.needEmployee("Driver", false);
            geekBrains.needEmployee("Teacher");
            google.needEmployee("Manager");
        }


    }
}
