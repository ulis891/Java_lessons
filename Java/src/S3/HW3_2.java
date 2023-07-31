package S3;

import java.util.Arrays;

public class HW3_2 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        removeEvenNumbers(arr);
    }

    public static void removeEvenNumbers(Integer[] arr){
        StringBuilder newList = new StringBuilder();
        for (Integer integer: arr) {
            if (integer % 2 != 0) {
                newList.append(integer).append(",");
            }
        }
        Integer[] result = Arrays.stream(newList.toString()
                                 .split(","))
                                 .map(Integer::parseInt)
                                 .toArray(Integer[]::new);
        System.out.println(Arrays.toString(result));
    }
}
