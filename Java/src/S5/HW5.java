package S5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class HW5 {

    private static final Map<String, List<String>> PhoneBook = null;
    static Map<String, List<String>> phoneBook = new HashMap<>();    
    static String name = "";
    static String phone = "";
    public static void main(String[] args) {

        boolean menuFlag = true;

        while (menuFlag) {
            String option = doOption();
            switch (option) {
                case "1":
                    add();
                    break;
                case "2":
                    find();
                    break;

                case "3":
                    printPoneBook();
                    break;

                case "0":
                    
                    System.out.println("Bye bye!");
                    menuFlag = false;
                    break;


                default:
                    System.out.println("Неизвестная команда");
                    break;
            }
        }
    }

    static String doOption(){
        System.out.println("1 - добавить контакт");
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

    public static void add(){
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
    }

        static void printPoneBook(){
            StringBuilder stringBuilder = new StringBuilder();
             for (Map.Entry<String, List<String>> entry: phoneBook.entrySet()) {
                stringBuilder.append(entry.getKey());
                stringBuilder.append(" : ");
                stringBuilder.append(entry.getValue());
                stringBuilder.append(entry.getValue().size());
                stringBuilder.append("\n");
            }
            
            // System.out.println(phoneBook);
            System.out.println(stringBuilder);
        }

        public static void find(){
            System.out.println("Введите имя контакта");
            name = readConsole();
            System.out.println(phoneBook.getOrDefault(name, new ArrayList<>()));
        }
        
}   






    
    



