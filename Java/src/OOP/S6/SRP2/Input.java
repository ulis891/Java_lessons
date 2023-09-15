package OOP.S6.SRP2;

import java.util.Scanner;

public class Input {

    String clientName;
    String product;
    int qnt;
    int price;


    public Order inputFromConsole(){
        clientName = prompt("Client name: ");
        product = prompt("Product: ");
        qnt = Integer.parseInt(prompt("Quantity: "));
        price = Integer.parseInt(prompt("Price: "));
        return new Order(clientName,product,qnt,price);
    }

    private String prompt (String massage){
        Scanner in = new Scanner(System.in);
        System.out.println(massage);
        return in.nextLine();
    }
}
