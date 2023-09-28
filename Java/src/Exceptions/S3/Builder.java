package Exceptions.S3;

import java.util.ArrayList;
import java.util.Scanner;

import static Exceptions.S3.Chekers.*;
import static Exceptions.S3.Chekers.sexCheker;

public class Builder {
    /**
     * Запрашивает текст с контактными данными
     * и возвращает данные в виде список строк
     * @return String[] person - список с данными
     */
    protected static String[] inputText() {
        Scanner scanner = new Scanner(System.in);
        String[] person;
        System.out.println("Введите ФИО, дату рождения в формате dd.mm.yyyy, номер телефона, пол f или m");
        person = scanner.nextLine().split(" ");
        if (!chekText(person)) {
            throw new RuntimeException("Неверное количество данных");
        }
        return person;
    }


    /**
     * Проверяет данные из полученного списка.
     * Если данные прошли проверку, возвращает объект Person
     * @param text String[] - список данных
     * @return объект Person
     */
    protected static Person buildPerson(String[] text){
        ArrayList<String> fio = new ArrayList<>();
        String birthday = "";
        int tel = 0;
        String sex = "";
        for (String data: text) {
            if (data.indexOf(".") > 0){
                if (bdayCheker(data)){
                    birthday = data;
                    continue;
                }
                else throw new RuntimeException("Неверный формат даты");
            }
            if (telCheker(data)) {
                tel = Integer.parseInt(data);
                continue;
            }
            if (data.length() == 1){
                if (sexCheker(data)){
                    sex = data;
                    continue;
                }
                else throw new RuntimeException("Неверный формат пола");
            }
            fio.add(data);
        }
        if (fio.size() != 3){
            throw new RuntimeException("Неверные данные в ФИО");
        }
        if (birthday.isEmpty()){
            throw new RuntimeException("Недостаточно данных в дне рождения");
        }
        if (tel == 0){
            throw new RuntimeException("Недостаточно данных о телефоне");
        }
        if (sex.isEmpty()){
            throw new RuntimeException("Недостаточно данных пола");
        }
        return new Person(fio.get(0), fio.get(1), fio.get(2), tel, birthday, sex);
    }
}
