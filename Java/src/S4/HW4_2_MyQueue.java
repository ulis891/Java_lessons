package S4;

import java.util.LinkedList;

public class HW4_2_MyQueue {
    private LinkedList<Integer> linkedList = new LinkedList<Integer>();

    public void enqueue(int num){
        linkedList.add(num);
    }

    public Integer dequeue(){
        return linkedList.pollFirst();
    }

    public Integer first(){
        return linkedList.getFirst();
    }

    public LinkedList<Integer> getElements(){
        return linkedList;
    }
}
