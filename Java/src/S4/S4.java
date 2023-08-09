package S4;

import java.util.*;

public class S4 {
    public static void main(String[] args) {
//        task0();
//        task1();
//        task2();
//        task3();
        S4_myStack stack = new S4_myStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.empty());

    }

    static void task0() {
        /*
        Замерить время, за которое добавится 10000 элементов в ArrayList и LinkedList
         */
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list1.add(0, i);
        }
        long middle = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list2.add(0, i);
        }
        long finish = System.currentTimeMillis();
        System.out.println(middle - start);
        System.out.println(finish - middle);
    }

    static void task1() {
        /*
        Принимает от пользователя строку вида text~num
        Нужно расплитить строку по ~, сохранить text в связанный список на позицию num.
        Если введено print~num, выводит строку из позиции num в связаном списке и удаляет её из списка.
         */
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("Введите команду: ");
            String line = scanner.nextLine();
            String[] arr = line.split("~");
            int num = Integer.parseInt(arr[1]);
            String text = arr[0];
            switch (text) {
                case "print":
                    System.out.println(list.remove(num));
                    break;
                case "exit":
                    System.out.println("Досвидания!");
                    work = false;
                    break;
                default:
                    list.add(num, text);
                    System.out.printf("Текст %s добавлено на позицию %d\n", text, num);
            }
        }
    }

    static void task2() {
        /*
        Принимает от пользователя и запоминает строки.
        Если введено print, выводит строки так, чтобы последняя введённая была превой в списке, а первая - последней.
        Если введено revert, удаляет предведущую строку из памяти.
         */
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("Введите команду: ");
            String text = scanner.nextLine();
            switch (text) {
                case "print":
                    ListIterator listIterator = list.listIterator(list.size());
                    while (listIterator.hasPrevious()) {
                        System.out.println(listIterator.previous());
                    }
                    break;
                case "exit":
                    System.out.println("Досвидания!");
                    work = false;
                    break;
                case "revert":
                    list.removeLast();
                    System.out.println("Последний элемент удалён");
                    break;
                default:
                    list.add(text);
                    System.out.printf("Текст %s добавлено\n", text);
            }
        }
    }

    static void task3(){
        /*
        Написать метод, который принимает массив элементов,
        помещает их в стек и выводит на консоль содержимое стека

        Написать метод, который принимает массив элементов,
        помещает их в очередь и выводит на консоль содержимое очереди.
         */
        Integer[] array = {1,2,3,4,5,6};
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
            queue.offer(array[i]);
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}