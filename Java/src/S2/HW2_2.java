package S2;

import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class HW2_2 {

    static class BubbleSort {
        public static void main(String[] args) {

            sort(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1});
        }

        private static File log;
        private static FileWriter fileWriter;

        public static void sort(int[] mas) {
            for (int out = mas.length - 1; out >= 1; out--) {
                for (int in = 0; in < out; in++) {
                    if (mas[in] > mas[in + 1]) {
                        int temp = mas[in];
                        mas[in] = mas[in + 1];
                        mas[in + 1] = temp;
                    }

                }
                String date = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date());
                System.out.println(date + " " + Arrays.toString(mas));

                String path = "log2.txt"; // todo исправить путь
                try {
                    StringBuilder stringBuilder = new StringBuilder();
                    FileWriter writer = new FileWriter(path, true);
                    stringBuilder.append(date).append(" ").append(Arrays.toString(mas)).append("\n");
                    writer.write(String.valueOf(stringBuilder));
                    writer.flush();
                    writer.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }
}