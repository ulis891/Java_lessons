package S5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        static Map<String, List<String>> phoneBook = new HashMap<>();
        boolean menuFlag = true;
        String name = "";
        String phone = "";

        while (menuFlag) {
            String option = doOption();
            switch (option) {
                case "1":
                    // add();
                    System.out.println("add");
                    break;
                case "2":
                    // find();
                    System.out.println("find");
                    break;

                case "3":
                    // print();
                    System.out.println("print");
                    break;

                case "0":
                    // print();
                    System.out.println("Bye bye!");
                    menuFlag = false;
                    break;


                default:
                    System.out.println("Неизвестная комонда");
                    break;
            }
        }
    }

    static String doOption(){
        System.out.println("1 - добавить запись");
        System.out.println("2 - найти телефон");
        System.out.println("3 - напечатать книгу");
        System.out.println("0 - выход");
        return readConsole();
    }

    static String readConsole(){
        Scanner scanner = new Scanner(System.in);
        System.out.print(">");
        return scanner.next();
    }

    static void add(){
        System.out.println("Введите имя");
        name = readConsole();
        System.out.println("Введите телефон");
        phone = readConsole();
        if (phoneBook.containsKey(name)) {
            if (!phoneBook.get(name).contains(phone)) {
                phoneBook.get(name).add(phone);
            }
        } else {
            List<String> phoneList = new ArrayList<>();
            phoneList.add(phone);
            phoneBook.put(name, phoneList);
        }

        static void print(){
            System.out.println(phoneBook);
        }
    }





    
    


}
