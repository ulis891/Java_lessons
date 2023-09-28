package Exceptions.S3;

import java.util.Objects;

public class Person {
    private final String surName;
    private final String firstName;
    private final String secName;
    private final String bDay;
    private final String sex;
    private final int tel;

    public Person(String secName, String firstName, String surName,int tel, String bDay, String sex) {
        this.surName = surName;
        this.firstName = firstName;
        this.secName = secName;
        this.tel = tel;
        this.bDay = bDay;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return  secName + ":[" +
                "firstName: " + firstName + ',' +
                " secName: " + surName + ',' +
                " tel: " + tel + ',' +
                " bDay: " + bDay + ',' +
                " sex: " + sex +
                ']';
    }

    public String getSurName() {
        return surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecName() {
        return secName;
    }

    public String getbDay() {
        return bDay;
    }

    public String getSex() {
        return sex;
    }

    public String getTel() {
        return String.valueOf(tel);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(surName, person.surName);
    }
}
