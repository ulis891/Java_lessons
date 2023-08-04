package S5;

import java.util.HashMap;
import java.util.Map;

public class Passports {
    private static Map<String, String> map = new HashMap<>();

    static void add(String passnum, String lastname){
        map.put(passnum, lastname);
    }

    String getbyPassnum (String passnum){
        return passnum + " : " + map.get(passnum);
    }

    String getbyLastname (String lastname){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry: map.entrySet()) {
            if (entry.getValue().equals(lastname)) {
                stringBuilder.append(entry.getKey());
                stringBuilder.append(" : ");
                stringBuilder.append(lastname);
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    String getAll(){
        return map.toString();
    }
    
}