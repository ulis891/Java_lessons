package OOP.S7.factory;

public class Freelancer extends Employee{


    public Freelancer(String name, String surName, double salary) {
        super(name, surName, salary);
    }

    @Override
    public double calculateSalary() {
        return salary * 20.8 * 8;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилоансер; Зарплата договорная %.2f", name,surName,salary);
    }
}
