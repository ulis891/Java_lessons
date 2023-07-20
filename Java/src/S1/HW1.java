package S1;

public class HW1 {
    public static void main(String[] args) {
//        System.out.println(countNTriangle(10));
//        printPrimeNums();
//        System.out.println(calculate('*', 5, 10));

    }
    static int countNTriangle(int n){
        /*
        Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n).
         */
        return ((n + 1) * n) / 2;
    }
    public static void printPrimeNums(){
        /*
        Напишите функцию printPrimeNums, которая выведет на экран все простые числа от 1 до 1000,
        каждое на новой строке.
         */
        for (int i = 1; i <= 1000; i++) {
            if (checkSimple(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean checkSimple(int i){
        /*
        Прверяет число на "Простоту"
         */
        if (i<1)
            return false;
        else if (i <=3)
            return true;
        else if (i%2==0 || i %3 ==0)
            return false;
        int n = 5;
        while (n*n <=i){
            if (i % n ==0 || i % (n+2) == 0)
                return false;
            n=n+6;
        }
        return true;
    }

    public static Object calculate(char op, int a, int b) {
        String text = "Некорректный оператор: ";
        if (op == '+') {
            return a + b;
        }
        else if (op == '-') {
            return a - b;
        }
        else if (op == '*') {
            return a * b;
        }
        else if (op == '/') {
            return a / b;
        }
        else {
           return text + op;
        }
    }
}

