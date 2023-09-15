package OOP.S6.SRP2;

public class Program {

    public static void main(String[] args) {

        Order order1 = new Input().inputFromConsole();
        order1.saveTo("txt");

        Order order2 = new Order("www", "wwww", 2,2);
        order2.saveTo();

        Order order3 = new Order("Order3", "Prod3", 500,29);
        order3.saveTo("json");

        Order order4 = new Input().inputFromConsole();
        order4.saveTo("txt");

        Order order5 = new Order("Order5", "Prod5", 50000,100);
        order5.saveTo("exe");

    }
}
