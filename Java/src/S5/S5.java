package S5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class S5 {
    public static void main(String[] args) {
        // task0();
        // System.out.println(task1("bar", "foo"));
        // System.out.println(task2("(a+b)"));
        // System.out.println(task3("(a+b)]"));
        task4("Мороз и солнце день чудесный\n"
                                + "Ещё ты дремлешь друг прелесный\n"
                                + "Пора красавица проснись.");
        
    }
    static void task0 (){
        /*
         * Создать структуру для хранения номеров паспартов и фамилий сотрудников организации.
         */
        Passports passports = new Passports();
        Passports.add("123456", "Иванов");
        Passports.add("789456", "Васильев");
        Passports.add("654987", "Петрова");
        Passports.add("123789", "Иванов");
        Passports.add("987132", "Петрова");
        Passports.add("564789", "Иванов");

        System.out.println(passports.getbyLastname("Иванов"));
        System.out.println(passports.getbyPassnum("654987"));
        System.out.println(passports.getAll());
    }

    static boolean task1(String str1, String str2){
        /*
         * Даны 2 строки, написать иетрд, который вернет true, если эти строки являются изоморфами и false, если нет.
         * 1. повторяющиеся буквы одного слова иеняются на одну и ту же букву с сохранением порядка следования. (add - egg изоморфны)
         * 2. буква может не меняться, а остаться такой же. (note - code)
         */
        if (str1.length() != str2.length()) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            if (map.containsKey(c1[i])) {
                if (c2[i] != map.get(c1[i])) return false;                 
                
            } else {
                map.put(c1[i], c2[i]);
            }
            if (map.containsValue(c2[i])) return false;
        }
        return true;

    }

    static boolean task2(String str){
        /*
         * Написать программу, оределяющую правильность расстановки скобок в выражении.
         */
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') stack.push(chars[i]);
            if (chars[i] == ')') {
                if (stack.isEmpty() || stack.pop() != '(') return false;   
            }
        }
        if (!stack.isEmpty()) return false;

        return true;
    }

    static boolean task3(String str){
        /*
         * Написать программу, оределяющую правильность расстановки скобок в выражении.
         */
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        map.put('<', '>');

        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) stack.push(chars[i]);
            if (map.containsValue(chars[i])) {
                if (stack.isEmpty() || map.get(stack.pop()) != chars[i]) return false;   
            }
        }
        if (!stack.isEmpty()) return false;
        
        return true;
    }

    static void task4(String str){
        /*
         * Взять набор строк, ........
         * Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с одинаковой длиной не должны потеряться.
         */
        str = str.replace(".", " ").replace("\n", " ");
        String[] words = str.split(" ");
        Map<Integer, List<String>> map = new TreeMap<>();
        for (String word : words) {
            int len =  word.length();
            if (map.containsKey(len)) {
                List<String> list = map.get(len);
                list.add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(len, list);
            }
        }
        System.out.println(map);

    }
    
    
}
