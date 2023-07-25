package S2;

import org.json.simple.parser.ParseException;

public class HW2_1 {
    public static void main(String[] args) throws ParseException {

        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        } else {
            QUERY = args[0];
            PARAMS = args[1];
        }

        Answer ans = new Answer();
        System.out.println(Answer.answer(QUERY, PARAMS));
    }

    public static class Answer {

        public static StringBuilder answer(String QUERY, String PARAMS) throws ParseException {
            // Напишите свое решение ниже

            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(QUERY);
            PARAMS = PARAMS.replace("{", "")
                    .replace("}", "");
            String[] params = PARAMS.split(",");
            for (int i = 0; i < params.length; i++) {
                String[] temp = params[i].split(":");
                temp[1] = temp[1].trim();

                if (temp[1].trim().equals("\"null\"")) break;
                else {
                    stringBuilder.append(temp[0].trim().replaceAll("\"", ""))
                                 .append("=")
                                 .append(temp[1].replaceAll("\"", "'"))
                                 .append(" and ");
                }
            }
            return stringBuilder.replace(stringBuilder.length() - 5, stringBuilder.length(), "");
        }

    }


    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

}
