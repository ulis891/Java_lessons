package S4;

import java.util.*;

public class Program {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();


        hashMap.put(1, "Андрей");
        hashMap.put(2, "Андрей");
        hashMap.put(3, "Сергей");

//        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println("Key: " + key + ", Value: " + value);
//        }

//        Iterator<Map.Entry<Integer, String>> iterator = hashMap.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<Integer, String> entry = iterator.next();
//            Integer key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println("Key: " + key + ", Value: " + value);
//        }

        for (Integer key : hashMap.keySet()) {
            String value = hashMap.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }


    }
}


