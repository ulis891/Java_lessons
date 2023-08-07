package S6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class S6 {
    public static void main(String[] args) {
        // task0();
        // task1(createArr(100, 0, 24));
        Cat cat1 = new Cat("Мурзик", "Василий Петрович", "Мейкун", 8);
        Cat cat2 = new Cat("Тушка", "Василий Петрович", "Девон-рекс", 6);
        Cat cat3 = new Cat("Мышь", "Василий Васильевич", "Д", 5);
        Cat cat4 = new Cat("Кот", "Петр Петрович", "Мей", 8);
        Cat cat5 = new Cat("Мурзик", "Василий Петрович", "Мейкун", 8);

        Set<Cat> set = new HashSet<>();
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        set.add(cat4);
        set.add(cat5);

        System.out.println(cat1.equals(cat5));


        System.out.println(set);
        
    }

    static void task0(){
        /*
         * 1. Создайте HashSet, заполниете его следующими числами {1,2,3,2,4,5,6,3}
         * Распечатайте содержимое данного множества.
         * 
         * 2. Создайте LinkedListSet, заполниете его следующими числами {1,2,3,2,4,5,6,3}
         * Распечатайте содержимое данного множества.
         * 
         * 3. Создайте TreeSet, заполниете его следующими числами {1,2,3,2,4,5,6,3}
         * Распечатайте содержимое данного множества.
         */
        Integer[] integers = {1,2,3,2,4,5,6,3};

        Set<Integer> set1 = new HashSet<>(Arrays.asList(integers));
        Set<Integer> set2 = new TreeSet<>(Arrays.asList(integers));
        Set<Integer> set3 = new LinkedHashSet<>(Arrays.asList(integers));

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    }

    static void task1(Integer[] arr){
        /*
         * 1. Напишите метод, которыый заполнит массив из 1000 жлементов случайными цифрами от 0 до 24.
         * 
         * 2. Создайте метод, в который передайте заполненный выше массив
         * и с помощью Set вычислите процент уникальных значений в данном массиве и верните его.
         * 
         * процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве
         */
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        double percent = set.size() * 100.0 / arr.length;
        System.out.println(percent);

    }
    static Integer[] createArr(int size, int max, int min){
        Integer[] arr = new Integer[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * (max - min + 1) + min);
        }
        return arr;
    }
    
}
