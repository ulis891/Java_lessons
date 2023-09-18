package OOP.S7.observer;

import java.util.Random;

public class Company {

    private Random random = new Random();

    private String name;
    private Publisher jobAgency;
    private int maxSalary;

    public String getName() {
        return name;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public Company(String name, Publisher jobAgency, int maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
    }

    public void needEmployee(String post){
        int salary = random.nextInt(maxSalary);
        Vacancy vacancy = new Vacancy(this, post);
        jobAgency.sendOffer(vacancy);
    }

    public void needEmployee(String post, boolean freelance){
        int salary = random.nextInt(maxSalary);
        Vacancy vacancy = new Vacancy(this,post,freelance);
        jobAgency.sendOffer(vacancy);
    }
}

