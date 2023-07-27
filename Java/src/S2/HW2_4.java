package S2;

import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HW2_4 {
    public static void main(String[] args) {
        print('-', 10, 20);
        
    }
    public static void print(Character op, int a, int b){
    
        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date());

        String path = "log3.txt"; // todo исправить путь
        try {
            StringBuilder stringBuilder = new StringBuilder();
            FileWriter writer = new FileWriter(path);

            stringBuilder.append(date).append(" ").append("User entered the first operand = ").append(a).append("\n");
            stringBuilder.append(date).append(" ").append("User entered the operation = ").append(op).append("\n");
            stringBuilder.append(date).append(" ").append("User entered the second operand = ").append(b).append("\n");
            stringBuilder.append(date).append(" ").append("Result is ").append(calc(op, a, b)).append("\n");

            writer.write(String.valueOf(stringBuilder));
            writer.flush();
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static Integer calc(Character op, int a, int b){
        if (op == '+') {
            return a + b;
        } else if (op == '-') {
            return a - b;
        } else if (op == '*') {
            return a * b;
        } else if (op == '/') {
            return a / b;
        } else {
           return 0;
        }
    }
}
