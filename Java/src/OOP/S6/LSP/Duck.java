package OOP.S6.LSP;

public class Duck extends Bird{
    public Duck() {
        flySpeed = 15;
    }

    @Override
    public void fly() {
        System.out.printf("Утка летит со скоростью %d\n" , flySpeed);
    }
}
