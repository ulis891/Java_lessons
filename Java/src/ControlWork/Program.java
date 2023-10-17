package ControlWork;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        ToyStore toyShop = new ToyStore();
        toyShop.addToy(new Toy("Плюшевый мишка", 10, 0.5));
        toyShop.addToy(new Toy("Машинка", 5, 0.3));
        toyShop.addToy(new Toy("PlayStation 5 Slim", 8, 0.2));

        for (int i = 0; i < 5; i++) {
            Toy prizeToy = toyShop.choosePrizeToy();
            System.out.println("Prize toy: " + prizeToy.getName());
            System.out.println(toyShop);
        }


    }
}
