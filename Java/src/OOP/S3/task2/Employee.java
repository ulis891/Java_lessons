package OOP.S3.task2;


/**
 * Сотрудник
 */
public abstract class Employee implements Comparable<Employee>{
    /**
     * Имя
     */
    protected String name;

    /**
     * Фамилия
     */
    protected String surname;

    /**
     * Ставка заработной платы
     */
    protected double salary;

    protected int age;



    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Работник {" +
                "имя ='" + name + '\'' +
                ", фамилия ='" + surname + '\'' +
                ", возраст ='" + age + '\'' +
                ", зарплата =" + salary +
                '}';
    }

    /**
     * Конструктор сотрудника
     * @param name имя
     * @param surname фамилия
     * @param age возраст
     * @param salary зарплата
     */
    public Employee(String name, String surname, int age, double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        int res = surname.compareTo(o.surname);
        if (res == 0) {
            return name.compareTo(o.name);
        }
        return res;
    }
}
