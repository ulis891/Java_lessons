package S4;

import java.util.LinkedList;

public class HW4_1 {
    public static void main(String[] args) {
        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add("One");
        linkedList.add(2);
        linkedList.add("Two");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        LinkedList<Object> result = revert(linkedList);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }


    static LinkedList<Object> revert (LinkedList arr){
        LinkedList<Object> linkedList = new LinkedList<>();
        int size = arr.size();
        for (int i = 0; i < size; i++) {
            linkedList.add(arr.pollLast());
        }
        return linkedList;

    }
}
