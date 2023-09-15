package OOP.S1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S7 {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Product product1 = new Product();
        /* Используем конструктор по умолчанию */
//        product1.name = "ProdName";
//        product1.brand = "ProdBrand";
//        product1.price = 200;

        Product product2 = new Product("ProdName2", "ProdBrand2", 220);
        /* Используем свой конструктор */

        Product milk1 = new BottleOfMilk("Костромское", "Костромской молочный завод", 150, 0.9, 15);
        Product milk2 = new BottleOfMilk("Вологодское", "Вологодский молочный завод", 200, 1, 20);
        Product water1 = new BottleOfWater("Лужа", "Лужнецкий источник", 1500, 20);
        Product water2 = new BottleOfWater("Исток", "КМВ", 500, 0.5);
        Product nut1 = new Nuts("Белкины орешки", "Алтайский лес", 300, 0.500);
        Product nut2 = new Nuts("Белкины орешки", "Алтайский лес", 550, 1);

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(milk1);
        products.add(milk2);
        products.add(water1);
        products.add(water2);
        products.add(nut1);
        products.add(nut2);


        boolean flag = true;

        while (flag) {
            System.out.println("Выберите действие: ");
            System.out.println("Посмотреть все товары - 1");
            System.out.println("Купить товар - 2");
            System.out.println("Закрыть приложение - 0");
            int num = Integer.parseInt(scanner.nextLine());
            switch (num) {
                case 0: {
                    System.out.println("Завершение работы");
                    flag = false;
                    break;
                }
                case 1: {
                    System.out.println("----------------------------");
                    for (Product product : products) {
                        System.out.println(product.displayInfo());
                    }
                    System.out.println("----------------------------\n");

                    break;
                }
                case 2: {
                    System.out.println("Какой товар вы хотите купить?");
                    System.out.println("Воду - 1");
                    System.out.println("Молоко - 2");
                    System.out.println("Орехи - 3");
                    System.out.println("Другое - 4");
                    System.out.println("Отмена пркупки - 0");
                    int merch = Integer.parseInt(scanner.nextLine());
                    switch (merch) {
                        case 1 : {
                            VendingMachine vendingMachine = new VendingMachine(products);
                            System.out.println("Введите название воды: ");
                            String inputName = scanner.nextLine();
                            System.out.println("Введите объем воды: ");
                            double inputVolume = Integer.parseInt(scanner.nextLine());
                            BottleOfWater bottleOfWater = vendingMachine.getBottleOfWater(inputName, inputVolume);
                            if (bottleOfWater != null) {
                                System.out.println("Вы купили: ");
                                System.out.println(bottleOfWater.displayInfo());
                                String result = String.format("С вас %.2f рублей", bottleOfWater.getPrice());
                                System.out.println(result);
                                System.out.println("----------------------------\n");
                            } else {
                                System.out.println("Такой воды нет!");
                            }
                            break;
                        }


                        case 2 : {
                            VendingMachine vendingMachine = new VendingMachine(products);
                            System.out.println("Введите название молка: ");
                            String inputName = scanner.nextLine();
                            System.out.println("Введите жирность молока: ");
                            int inputFat = Integer.parseInt(scanner.nextLine());
                            BottleOfMilk bottleOfMilk = vendingMachine.getBottleOfMilk(inputName, inputFat);
                            if (bottleOfMilk != null) {
                                System.out.println("Вы купили: ");
                                System.out.println(bottleOfMilk.displayInfo());
                                String result = String.format("С вас %.2f рублей", bottleOfMilk.getPrice());
                                System.out.println(result);
                                System.out.println("----------------------------\n");
                            } else {
                                System.out.println("Такого молока нет!");
                                System.out.println("----------------------------\n");
                            }
                            break;
                        }
                        case 3 : {
                            VendingMachine vendingMachine = new VendingMachine(products);
                            System.out.println("Введите название орехов: ");
                            String inputName = scanner.nextLine();
                            System.out.println("Введите вес орехов: ");
                            double inputWeight = Double.parseDouble(scanner.nextLine());
                            Nuts nut = vendingMachine.getNuts(inputName, inputWeight);
                            if (nut != null) {
                                System.out.println("Вы купили: ");
                                System.out.println(nut.displayInfo());
                                String result = String.format("С вас %.2f рублей", nut.getPrice());
                                System.out.println(result);
                                System.out.println("----------------------------\n");
                            } else {
                                System.out.println("Таких орехов нет!");
                                System.out.println("----------------------------\n");
                            }
                            break;
                        }
                        case 4 : {
                            VendingMachine vendingMachine = new VendingMachine(products);
                            System.out.println("Введите название товара: ");
                            String inputName = scanner.nextLine();
                            Product product = vendingMachine.getProduct(inputName);
                            if (product != null) {
                                System.out.println("Вы купили: ");
                                System.out.println(product.displayInfo());
                                String result = String.format("С вас %.2f рублей", product.getPrice());
                                System.out.println(result);
                                System.out.println("----------------------------\n");
                            } else {
                                System.out.println("Такого товара нет!");
                                System.out.println("----------------------------\n");
                            }
                            break;
                        }
                        case 0 : {
                            break;
                        }

                    }
                    break;

                }
                default:
                    System.out.println("Укажите корректный пункт меню");
            }


        }
    }
}
