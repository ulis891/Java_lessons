package S3;

import java.util.*;

public class S3 {
    public static void main(String[] args) {
//        task1(10,2, 12);
        task2();
    }
    static void task1(int size, int min, int max){
        /*
        Заполнить список случайными числами. Отсортировать методом sort().
        Вывести его на экран
         */

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size  ; i++) {
            list.add((int) (Math.random() * (max - min +1) + min));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

    static void task2(){
        /*
        Создать список типа ArrayList<String>.
        Поместить в него как строки так и целые числа.
        Пройтись по циклу и удалить числа.
         */

        List list = new ArrayList<>();
        list.add(13);
        list.add("HIU");
        list.add(135);
        list.add("135");
        list.add(18);
        list.add("18");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){     // Проверяет, есть ли следующий элемент
            Object el = iterator.next();
            if (el instanceof Integer){     // Проверяет, является ли элемент челым числом
                iterator.remove();
            }
        }

        System.out.println(list);

    }

    static void task3(){
        /*
        Каталог товаров книжного магазина хранится в двумерном массива List<ArrayList<String>> так, что на 0-ой позиции
        находится жанр а на остальных названия книг.
         */

        List<List<String>> list = new ArrayList<>();
        addbook("ужасы", "Хребты безумия", list);
    }

    static void addbook (String ganre, String book, List<List<String>> shop){
        for (int i = 0; i < shop.size(); i++) {
            if (shop.get(i).get(0).equals(ganre)){
                shop.get(i).add(book);
                return;
            }

        }
        List<String> list = new ArrayList<>();
        list.add(ganre);
        list.add(book);
        shop.add(list);


    }
}
