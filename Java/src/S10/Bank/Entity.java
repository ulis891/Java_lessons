package S10.Bank;

public class Entity implements PersonalData {

    private final String name;
    private final String inn;


    public Entity(String name, String inn) {
        this.name = name;
        this.inn = inn;
    }

    public String getFio() {
        return name;
    }

    @Override
    public String getInn() {
        return inn;
    }

    @Override
    public String toString() {
        return String.format("%s: %s" , inn, name);
    }
}
