package OOP.S2.HW8;

import java.util.Objects;
import java.util.Scanner;

public class HW8 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 10),
                new Cat("Murzik", 15),
                new Cat("Boris", 20),
                new Cat("Mysh", 5),
                new Cat("Tiger", 50)
        };

        Plate plate = new Plate(22);



        for (Cat cat: cats) {
            if (Objects.equals(cat.getName(), "Boris")) {
                cat.setSatiety(true); // Борис постоянно подкармливется у соседей и всегда сыт))).
            }
            if (!cat.getSatiety()) {
                cat.eat(plate.setFood(plate.getFood(), cat.getAppetite()));
                cat.info();
                plate.info();
            }
            else {
                cat.info();
            }

        }

        System.out.println("Добавить ещё еды? Y/N");
        String res = scanner.nextLine().toUpperCase();
        switch (res) {
            case "Y" -> {
                System.out.print("Сколько добавить еды? : ");
                int supplement = Integer.parseInt(scanner.nextLine());
                plate.addFood(supplement);
                plate.info();
            }
            case "N" -> {
            }
        }
    }
}
