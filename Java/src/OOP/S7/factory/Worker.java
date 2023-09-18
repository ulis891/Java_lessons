package OOP.S7.factory;

public class Worker extends Employee{
    public Worker(String name, String surName, double salary) {
        super(name, surName, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Зарплата фикс %.2f", name,surName,salary);
    }
}
