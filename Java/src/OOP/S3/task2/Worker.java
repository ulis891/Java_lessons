package OOP.S3.task2;

public class Worker extends Employee{

    public Worker(String name, String surname, int age, double salary) {
        super(name, surname, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Рабочий {" + name + " " + surname + ", " +
                "возраст - " + age +
                " (Зарплата = " + salary +
                ")}";
    }
}
