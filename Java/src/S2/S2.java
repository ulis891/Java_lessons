package S2;

import java.io.FileWriter;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class S2 {
    public static void main(String[] args) {
//        task0(8, 'r', 'o');
//        task1("aaaadddccccc");
//        System.out.println(task2("aaaadddccccc"));
        task3("test2", 10);

    }

    static void task0(int n, char c1, char c2) {
        /*
        Дано четное число N > 0 и символы с1 и с2. Написать метод, который вернет строку длины N, которая состоит из
        чередующихся символов с1 и с2, начиная с с1
         */
        StringBuilder stringBuilder = new StringBuilder();
        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                stringBuilder.append(c1).append(c2);
            }
            System.out.println(stringBuilder);

        } else {
            System.out.println("N is not even number. ");
        }
    }

    static void task1(String str) {
        /*
        Напишите метод, который сжимает строку.
        Пример: вход aaaabbbcdd
        Результат: a4b3c1d2
         */
        char[] characters = str.toCharArray();
        Arrays.sort(characters);
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < characters.length; i++) {
            if (characters[i] == characters[i - 1]) {
                count++;
            } else {
                stringBuilder.append(characters[i - 1]).append(count + 1);
                count = 0;
            }

        }
        stringBuilder.append(characters[characters.length - 1]).append(count);
        System.out.println(stringBuilder);

    }

    static boolean task2(String str) {
        /*
        Проверяет строку на полиндром
         */
        StringBuilder stringBuilder = new StringBuilder(str);
        String str2 = stringBuilder.reverse().toString();
        return str.equalsIgnoreCase(str2);
    }

    static public void task3(String str, int n) {
        saveToFile(str, n);
    }

    static private String repeat(String str, int n) {
        /*
        Повторяет введённый текст заданное количество раз
         */
        return str.repeat(n);
    }

    static private void saveToFile(String str, int n) {
        /*
        Напишите метод, котрый запишет жту строку в простой файл, обработайте исключения
         */
        Logger logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;

        try {
            fileHandler = new FileHandler("log.txt", true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        logger.addHandler(fileHandler);
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        fileHandler.setFormatter(simpleFormatter);

        String path = "text.txt"; // todo исправить путь
        try {
            FileWriter writer = new FileWriter(path, true);
            writer.write(repeat(str, n) + "\n");
            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
            logger.log(Level.INFO, e.getMessage());
        }
        fileHandler.close(); // закрытие файла
        logger.getHandlers()[0].close(); // закрытие логера
    }
}


