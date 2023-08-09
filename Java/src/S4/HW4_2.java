package S4;

public class HW4_2 {
    public static void main(String[] args) {
        HW4_2_MyQueue queue;
        queue = new HW4_2_MyQueue();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);
        System.out.println(queue.getElements());
        System.out.println(queue.first());
        System.out.println(queue.dequeue());
        System.out.println(queue.getElements());
    }
}

