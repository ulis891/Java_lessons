package S6.HW;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HW6 {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("Apple", "macbook pro", "122d58626", "macos" , 8, 1000, 15.7, 3000);
        Notebook notebook2 = new Notebook("Asus", "zenbook", "23456jh4k", "win11" , 16, 500, 15.7, 1500);
        Notebook notebook3 = new Notebook("Asus", "TUF", "3456jhkg42jkh", "win11" , 32, 1000, 17.0, 2000);
        Notebook notebook4 = new Notebook("Lenovo", "Legion 7", "43kjl5h67g", "win11" , 64, 2000, 16.5, 2500);
        Notebook notebook5 = new Notebook("Lenovo", "Legion 5 pro", "j2lh34g6", "win11" , 32, 1500, 15.7, 1700);
        Notebook notebook6 = new Notebook("Huawei", "matebook X pro", "2kl43hj5g6", "win11" , 16, 500, 17.0, 1200);
        Notebook notebook7 = new Notebook("Huawei", "matebook 16s", "j6lky3245", "win11" , 8, 256, 14.5, 700);
        Notebook notebook8 = new Notebook("Xiaomi", "mi notebook pro", "3465kjhyg23", "win11" , 32, 500, 15.7, 1100);
        Notebook notebook9 = new Notebook("Xiaomi", "redmibook 14", "jk3457lk3j4h5", "win11" , 8, 256, 14.2, 800);
        Notebook notebook10 = new Notebook("Apple", "macbook air", "4537ghhjk34g", "macos" , 4, 128, 13.0, 2000);

        Set<Notebook> set = new HashSet<Notebook>();
        set.add(notebook1);
        set.add(notebook2);
        set.add(notebook3);
        set.add(notebook4);
        set.add(notebook5);
        set.add(notebook6);
        set.add(notebook7);
        set.add(notebook8);
        set.add(notebook9);
        set.add(notebook10);

        


        boolean menuFlag = true;

        while (menuFlag) {
            String option = doOption();
            switch (option) {
                case "1":
                    System.out.println(set);;
                    break;
                case "2":
                    findNoutbook(set);
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
        System.out.println("1 - вывести все ноутбуки");
        System.out.println("2 - подобрать ноутбук");
        System.out.println("0 - выход");
        return readConsole();
    }

    static String readConsole(){
        Scanner scanner = new Scanner(System.in);
        System.out.print(">");
        return scanner.next();
    }

    private static int readInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(">");
        return scanner.nextInt();
    }

    private static String choiseOs(String os){
        switch (os) {
            case "1":
                return "win11";
            case "2":
                return "macos";
            default:
                return "";
        }
    }

    public static void findNoutbook(Set<Notebook> set){
        System.out.println("Выберете операционную систему" + "\n" + "1 - Windos 11" + "\n" + "2 - MacOs" + "\n" + "3 - любая");
        String os = choiseOs(readConsole());
        System.out.println("Введите количество оперативной памяти");
        int ram = readInt();
        System.out.println("Введите минимальный объем постояной памяти");
        int memory = readInt();
        System.out.println("Введите минимальный размер экрана");
        double display = (double)readInt();
        System.out.println("Введите максимальную стоймость");
        int price = readInt();
        
        Set<Notebook> findSet = new HashSet<Notebook>();
        if (os == "") {
            for (Notebook notebook : set) {
            if (notebook.getRam() >= ram &&
                notebook.getHardDisk() >= memory &&
                notebook.getDisplay() >= display &&
                notebook.getPrice() <= price) {
            findSet.add(notebook);
            }
        }
            
        } else{
            for (Notebook notebook : set) {
                if (notebook.getOperatingSystem().equals(os) &&
                    notebook.getRam() >= ram &&
                    notebook.getHardDisk() >= memory &&
                    notebook.getDisplay() >= display &&
                    notebook.getPrice() <= price) {
                findSet.add(notebook);
                }
            }
        }   

        if (findSet.isEmpty()) {
            System.out.println("Такой ноутбук не существует");
        }
        else {
            System.out.printf("Найдено %d ноутбуков.", findSet.size());
            System.out.println(findSet);
        }
    }
}







