package OOP.S7.observer;

public class Vacancy {
    private final String companyName;
    private final String post;
    private boolean freelance = true;
    private final int salary;

    public String getCompanyName() {
        return companyName;
    }

    public String getPost() {
        return post;
    }

    public boolean isFreelance() {
        return freelance;
    }

    public int getSalary() {
        return salary;
    }

    public Vacancy(Company company, String post,  boolean freelance) {
        this.companyName = company.getName();
        this.post = post;
        this.salary = company.getMaxSalary();
        this.freelance = freelance;
    }

    public Vacancy(Company company, String post) {
        this.companyName = company.getName();
        this.post = post;
        this.salary = company.getMaxSalary();
    }
}
