package Exceptions.S3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import static Exceptions.S3.Builder.buildPerson;
import static Exceptions.S3.Builder.inputText;

/*
Напишите приложение, которое будет запрашивать у пользователя следующие данные
в произвольном порядке, разделенные пробелом:
Фамилия Имя Отчество дата рождения номер телефона пол

Форматы данных:
фамилия, имя, отчество - строки
датарождения - строка формата dd.mm.yyyy
номертелефона - целое беззнаковое число без форматирования
пол - символ латиницей f или m.

Приложение должно проверить введенные данные по количеству.
Если количество не совпадает с требуемым, вернуть код ошибки, обработать его и показать пользователю сообщение,
что он ввел меньше и больше данных, чем требуется.

Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры.
Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы.
Можно использовать встроенные типы java и создать свои.
Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.

Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии,
в него в одну строку должны записаться полученные данные, вида

<Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>

Создать словарь где ключ фамилия, значения Лист строк данных
Если одинаковая фамилия, то записываем под этим же ключем
Иначе, добавляем данные
 */
public class Main_S3_HW {
    public static void main(String[] args) throws IOException {
        Person person = buildPerson(inputText());
        HashMap<String, ArrayList<String>> mapPerson = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(person.getFirstName());
        arrayList.add(person.getSurName());
        arrayList.add(person.getbDay());
        arrayList.add(person.getTel());
        arrayList.add(person.getSex());
        mapPerson.put(person.getSecName(), arrayList);
        System.out.println(mapPerson);
        String fileName ="src/Exceptions/S3/" + person.getSecName() + ".txt";
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            String text = "<" + person.getSecName() + ">" +
                    "<" + person.getFirstName() + ">" +
                    "<" + person.getSurName() + ">" +
                    "<" + person.getbDay() + ">" +
                    "<" + person.getTel() + ">" +
                    "<" + person.getSex() + ">";
            fileWriter.write(text);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
/*
Примеры:

kos 12123123 alex m rudolf 12.12.1212
валидные данные

kos 12123123 alex m rudolf 12.12.1212234
RuntimeException: Неверный формат даты

kos 12123123 alex ж rudolf 12.12.1212
RuntimeException: Неверный формат пола

kos 12123123 alex asdffd rudolf 12.12.1212
RuntimeException: Неверные данные в ФИО

kos 12123123 alex m rudolf 12.12
RuntimeException: Неверный формат даты

kos 12123123 alex m rudolf 234234
RuntimeException: Недостаточно данных в дне рождения

kos f alex m rudolf 12.12.1212
RuntimeException: Недостаточно данных о телефоне

kos 12123123 alex 12312 rudolf 12.12.1212
RuntimeException: Недостаточно данных пола
*/