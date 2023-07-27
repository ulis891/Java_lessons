package S2;


public class HW2_3 {
    public static void main(String[] args) {
        String ELEMENT1 = "Студент ";
        String ELEMENT2 = " получил ";
        String ELEMENT3 = " по предмету ";

        String JSON = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
        "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
        "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        answer(JSON, ELEMENT1, ELEMENT2, ELEMENT3);
    }

    public static void answer(String JSON, String ELEMENT1, String ELEMENT2, String ELEMENT3){
        JSON = JSON.replace("[", "").replace("]", "");
        String[] JSONList = JSON.split("},");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < JSONList.length; i++) {
            
            String[] temp = JSONList[i].split(",");


            stringBuilder.append(ELEMENT1)
                         .append(temp[0].split(":")[1].replace("\"", ""))
                         .append(ELEMENT2)
                         .append(temp[1].split(":")[1].replace("\"", ""))
                         .append(ELEMENT3)
                         .append(temp[2].split(":")[1].replace("\"", "").replace("}", ""))
                         .append("\n");
            
        }
        System.out.println(stringBuilder);
        
    }
}