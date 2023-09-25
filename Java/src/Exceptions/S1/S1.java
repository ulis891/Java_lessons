package Exceptions.S1;

import java.util.Arrays;

public class S1 {
    public static void main(String[] args) {
        int[] a = new int[]{12, 8, 16};
        int[] b = new int[]{4, 2, 4, 5};

        System.out.println(Arrays.toString(subArrays(a, b)));
    }

    public static int[] subArrays(int[] a, int[] b) {
        try {
            if (a.length != b.length) {
                return new int[]{0};
            } else {
                int[] c = new int[a.length];
                for (int i = 0; i < a.length; i++) {
                    c[i] = a[i] / b[i];
                }
                return c;
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }


    }
}