package ControlWork;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        ToyStore toyStore = new ToyStore();
        toyStore.addToy(new Toy("Плюшевый мишка", 10, 0.5));
        toyStore.addToy(new Toy("Машинка", 5, 0.3));
        toyStore.addToy(new Toy("PlayStation 5 Slim", 8, 0.2));

        for (int i = 0; i < 5; i++) {
            Toy prizeToy = toyStore.choosePrizeToy();
            System.out.println("Prize toy: " + prizeToy.getName());
            System.out.println(toyStore);
        }


    }
}
