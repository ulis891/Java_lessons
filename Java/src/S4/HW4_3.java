package S4;

import java.util.LinkedList;

public class HW4_3 {
    LinkedList<Integer> results = new LinkedList<>();
    public static void main(String[] args) {
        LinkedList<Integer> results = new LinkedList<>();
        System.out.println(calculate('+', 15, 5 ,results));
        System.out.println(calculate('*', 15, 5, results));
        System.out.println(calculate('<', 15, 5, results));
    }

    public static Integer calculate(char op, int a, int b, LinkedList<Integer> results) {


        //String text = "Некорректный оператор: ";
        if (op == '+') {
            results.add(a + b);
            return a + b;
        } else if (op == '-') {
            results.add(a - b);
            return a - b;
        } else if (op == '*') {
            results.add(a * b);
            return a * b;
        } else if (op == '/') {
            results.add(a / b);
            return a / b;
        } else if (op == '<') {
            results.removeLast();
            return results.getLast();
        } else {
            return 0;
        }
    }
}
