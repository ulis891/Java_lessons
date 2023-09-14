package S12.LSP;

public class Penguin extends Bird{

    public Penguin() {
    }

    public Penguin(int flySpeed) {
        super(false,0);
    }

    @Override
    public void fly() {
        System.out.println("Пингвины не умеют летать!");
//        throw new RuntimeException("Пингвины не умеют летать!");
    }
}
