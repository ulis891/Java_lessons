package Exceptions.S2;

/*
Задание 2
 */

public class S2_HW_task_1 {
    public static void main(String[] args) {
        try {
            int d = 0;
            double catchedRes1 = (double) 8 / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

}
