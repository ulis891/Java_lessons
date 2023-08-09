package S4;

public class S4_myStack {
    /*
    Реализовать стек с помощью массива. Нужно реализовать методы:
    size(), empty(), push(), peek(), pop()
     */
    private Integer[] arr = new Integer[10];
    private int size = 0;

    public int size(){
        return size;
    }

    public boolean empty(){
        return size==0;
    }

    public void push(int num){
        if (size == arr.length) {
            Integer[] arr2 = new Integer[arr.length * 2];
            System.arraycopy(arr, 0, arr2,0, arr.length);
            arr = arr2;
        }
        arr[size++] = num;
    }

    public int peek(){
        return arr[size-1];
    }

    public int pop(){
        return arr[--size];
    }
}
