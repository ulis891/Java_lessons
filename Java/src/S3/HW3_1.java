package S3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class HW3_1 {
    public static void main(String[] args) {
        Integer[] nums = new Integer[] {5,9,5,1,4,5,8,7,3,1,3,5};
       printAnalitic(nums);
    }

    static void printAnalitic (Integer[] arr){
        StringBuilder stringBuilder = new StringBuilder();
        Integer[] sort = sortArray(arr);
        stringBuilder.append(Arrays.toString(sort))
                     .append("\n")
                     .append("Minimum is ")
                     .append(sort[0])
                     .append("\n")
                     .append("Maximum is ")
                     .append(sort[sort.length-1])
                     .append("\n")
                     .append("Average is ")
                     .append(sum(arr)/sort.length);
        System.out.println(stringBuilder);

    }

    private static Integer[] sortArray(Integer[] arr){
        return Arrays.stream(arr).sorted().toArray(Integer[]::new);

    }
    private static Integer sum (Integer[] arr){
        Iterator<Integer> iterator = Arrays.stream(arr).iterator();
        Integer summa = 0;
        while (iterator.hasNext()){
            Integer el = iterator.next();
            summa +=  el;
        }
        return summa;
    }

}
