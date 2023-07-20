package S1;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class S1 {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        System.out.println(task4("Добро пожаловать на курс по Java"));
        System.out.println(task5(2, 0));



    }
    static void task1() {
        /*
        Запросить имя и вывести приветствие в зависимости от текущего времен
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввидите имя");
        String name = scanner.nextLine();
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if (hour >= 5 && hour < 12) {
            System.out.println("Доброе утро, " + name + "!");
        }
        if (hour >= 12 && hour < 18) {
            System.out.println("Добрый день, " + name + "!");
        }
        if (hour >= 18 && hour < 23) {
            System.out.println("Добрый вечер, " + name + "!");
        }
        if (hour >= 23 || hour < 5) {
            System.out.println("Добой ночи, " + name + "!");
        }
        scanner.close();
    }

    static void task2(){
        /*
         посчитать максимальную последовательность 1
         */
        Integer[] array = {1, 1, 0, 1, 1, 1};
        int count = 0;
        int maxOnes = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1){
                count++;
            } else {
                count = 0;
            }
            if (count > maxOnes) {
                maxOnes = count;
                }
            }
        System.out.println(maxOnes);
    }


    static void task3() {
        /*
        Дан массив и число.
        Если в массиве есть числа, равные заданному, нужно перевнести эти элементы в конец массива.
        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного. а остальные
        равны ему.
         */
        Integer[] nums = {3, 2, 2, 3};
        int val = 3;
        int current = 0;
        int[] res = new int[nums.length];
        Arrays.fill(res, val);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                res[current++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(res));


    }

    static String task4(String str){
        /*
        Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке
         */
        StringBuilder stringBuilder = new StringBuilder();
        str = str.toLowerCase();
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            stringBuilder.append(words[words.length - 1 - i]).append(" ");

        }
        return stringBuilder.toString();
    }

    static double task5(int a, int b){
        /*
        Реализовать функцию возведения числа а в степень b. а,b из Z. Сводя количество выполняемых действий к минимуму.
        Пример: а = 3, b = 2. Ответ: 9
        Пример: а = 2, b = -2. Ответ: 0,25
         */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число а:");
//        Integer a = Integer.valueOf(scanner.nextLine());
//        System.out.println("Введите число b:");
//        Integer b = Integer.valueOf(scanner.nextLine());
        double temp = 1;
        for (int i = 0; i < Math.abs(b); i++) {
            temp *= a;
        }
        return b > 0 ? temp : 1/temp;
//        if (b == 0) {
//            return 1;
//        }
//        if (b > 0) {
//            for (int i = 0; i < b; i++) {
//                temp = temp * a;
//            }
//            return temp;
//        }
//        else {
//            b = -b;
//            for (int i = 0; i < b; i++) {
//                temp = temp * a;
//            }
//        }
//
//        return 1/temp;
    }
}
