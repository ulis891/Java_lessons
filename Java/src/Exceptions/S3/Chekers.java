package Exceptions.S3;

public class Chekers {
    /**
     * Проверяет колличество введённых данных.
     * если в списке больше или меньше 6 сторок - возвращает false
     * @param text String[] - список данных
     * @return true or false
     */
    protected static boolean chekText(String[] text){
        return text.length == 6;
    }


    /**
     * Проверяет даные на ренадлежность ко дню рождения в формате dd.mm.yyyy
     * @param string строка с датой
     * @return true - если данные прошли проверку, иначе - false
     */
    protected static boolean bdayCheker(String string){
        int count = string.length() - string.replace(".", "").length();
        if (count == 2){
            String[] data = string.split("\\.");
            for (int i = 0; i < 3; i++) {
                if ((data[i].length() == 2 && i < 2 ) || (data[i].length() == 4 && i == 2)){
//                    continue;
                }
                else return false;
            }
            return true;
        }
        return false;
    }

    /**
     * Проверяет строку на возможность преобразовать в телефонный номер
     * @param string строка с датой
     * @return true - если строку можно преобразовать в номер и false - если нельзя
     */
    protected static boolean telCheker(String string){
        try {
            int number = Integer.parseInt(string);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }

    /**
     * Проверяет строку на ферность указанного пола
     * @param string - строка с символом обозначающим пол
     * @return true - если в строке m или f. Иначе - false
     */
    protected static boolean sexCheker(String string){
        if (string.equals("f") || string.equals("m")) {
            return true;
        }
        return false;
    }
}
