package S3;

import java.util.Arrays;

public class HW3_1 {
    public static void main(String[] args) {
        int[] nums = new int[] {5,9,5,1,4,5,8,7,3,1,3,5}; // todo передалать под Intrger
        System.out.println(printAnalitic(nums));
    }

    static StringBuilder printAnalitic (int[] arr){
        StringBuilder stringBuilder = new StringBuilder();
        int[] sort = sortArray(arr);
        stringBuilder.append(Arrays.toString(sort))
                     .append("\n")
                     .append("Minimum is ")
                     .append(sort[0])
                     .append("\n")
                     .append("Maximum is ")
                     .append(sort[sort.length-1])
                     .append("\n")
                     .append("Average is ")
                     .append(Arrays.stream(arr).sum()/sort.length);
        return stringBuilder;

    }

    private static int[] sortArray(int[] arr){
        return Arrays.stream(arr).sorted().toArray();
    }

}
