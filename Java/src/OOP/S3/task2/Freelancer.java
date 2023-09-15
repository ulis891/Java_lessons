package OOP.S3.task2;

/**
 * Фрилансер с почасовой оплатой
 */
public class Freelancer extends Employee{


    public Freelancer(String name, String surname, int age, double salary) {
        super(name, surname, age,  salary);
    }

    @Override
    public double calculateSalary() {
        return salary * 15 * 5;
    }

    @Override
    public String toString() {
        return "Фрилансер {" + name + " " + surname + ", " +
                "возраст - " + age +
                " (Зарплата = " + calculateSalary() +
                ")}";
    }
}
