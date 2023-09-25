package Exceptions.S2;

import java.util.Scanner;

public class S2_HW_task_0 {
    /*
    Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
    вместо этого, необходимо повторно запросить у пользователя ввод данных.
     */

    public static void text(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            try {
                System.out.println("Введите число: ");
                double num = Double.parseDouble(scanner.next());
                System.out.println(num);
                flag = false;
            } catch (NumberFormatException e) {
                text();
            }
        }
    }
    public static void main(String[] args) {
        text();
    }




}
