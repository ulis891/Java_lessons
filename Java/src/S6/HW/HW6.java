package S6.HW;

import java.util.HashSet;
import java.util.Set;

public class HW6 {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("Apple", "macbook pro", "122d58626", "MacOs" , 8, 1000, 15.7, 3000);
        Notebook notebook2 = new Notebook("Asus", "zenbook", "23456jh4k", "win11" , 16, 500, 15.7, 1500);
        Notebook notebook3 = new Notebook("Asus", "TUF", "3456jhkg42jkh", "win11" , 32, 1000, 17.0, 2000);
        Notebook notebook4 = new Notebook("Lenovo", "Legion 7", "43kjl5h67g", "win11" , 64, 2000, 16.5, 2500);
        Notebook notebook5 = new Notebook("Lenovo", "Legion 5 pro", "j2lh34g6", "win11" , 32, 1500, 15.7, 1700);
        Notebook notebook6 = new Notebook("Huawei", "matebook X pro", "2kl43hj5g6", "win11" , 16, 500, 17.0, 1200);
        Notebook notebook7 = new Notebook("Huawei", "matebook 16s", "j6lky3245", "win11" , 8, 256, 14.5, 700);
        Notebook notebook8 = new Notebook("Xiaomi", "mi notebook pro", "3465kjhyg23", "win11" , 32, 500, 15.7, 1100);
        Notebook notebook9 = new Notebook("Xiaomi", "redmibook 14", "jk3457lk3j4h5", "win11" , 8, 256, 14.2, 800);
        Notebook notebook10 = new Notebook("Apple", "macbook air", "4537ghhjk34g", "MacOs" , 4, 128, 13.0, 2000);

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
        System.out.println(set);
    }
}







