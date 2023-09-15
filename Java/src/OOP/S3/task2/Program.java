package OOP.S3.task2;

import java.util.Arrays;
import java.util.Random;

public class Program {

    private static final Random random = new Random();
    public static Employee generateEmployee(){
        String[] names = new String[] {"Александр", "Борис", "Владимир", "Глеб", "Дмитрий", "Елисей", "Замир", "Илья", "Константин", "Леонид"};
        String[] surnames = new String[] {"Яковлев", "Юдин", "Эскимосов", "Щукин", "Шамиров", "Чичерин", "Целиков", "Хабибулин", "Фокин", "Устюгов"};

        int age = random.nextInt(20, 80);
        int salaryIndex = random.nextInt(500,900);
        int empolyeeType = random.nextInt(0, 2);


        if (empolyeeType == 1) {
            return new Worker(names[random.nextInt(names.length)],
                    surnames[random.nextInt(surnames.length)],
                    age,
                    salaryIndex*100);
        }

        else return new Freelancer(names[random.nextInt(names.length)],
                surnames[random.nextInt(surnames.length)],
                age,
                salaryIndex);

    }

    public static  Employee[] generateEmployees(int counter){
        Employee[] employees = new Employee[counter];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }
        return employees;
    }
    public static void main(String[] args) {
        Employee[] employees = generateEmployees(10);


        System.out.println();
        System.out.println("Печать списка сотрудников\n");
        for (Employee employee: employees) {
            System.out.println(employee);
        }
        System.out.println();


        System.out.println("Печать списка сотрудников с сортировкой по зарплате\n");
        Arrays.sort(employees, new SalaryComparator());
        for (Employee worker: employees) {
            System.out.println(worker);
        }
        System.out.println();


        System.out.println();
        System.out.println("Печать списка сотрудников с сортировкой по фамилии\n");
        Arrays.sort(employees);
        for (Employee employee: employees) {
            System.out.println(employee);
        }
        System.out.println();

        System.out.println();
        System.out.println("Печать списка сотрудников с сортировкой по типу работы\n");
        Arrays.sort(employees, new TypeComparator());
        for (Employee employee: employees) {
            System.out.println(employee);
        }
        System.out.println();

        System.out.println();
        System.out.println("Печать списка сотрудников с сортировкой по возрасту\n");
        Arrays.sort(employees, new AgeComporator());
        for (Employee employee: employees) {
            System.out.println(employee);
        }
        System.out.println();

    }
}
