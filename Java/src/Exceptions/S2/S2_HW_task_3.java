package Exceptions.S2;

import java.util.Scanner;

/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class S2_HW_task_3 {
    public static void text(){
        Scanner scanner = new Scanner(System.in);
            System.out.println("Введите текст: ");
            String num = scanner.nextLine();
        if (num == null || num.isEmpty()) {
            throw new  RuntimeException ("Нельзя вводить пустые строки");
        }
            System.out.println(num);
    }

    public static void main(String[] args) {
        text();
    }
}
