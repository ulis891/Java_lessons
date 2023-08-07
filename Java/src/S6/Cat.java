package S6;

import java.util.List;

public class Cat {
    /*
     * 1. Продумайте структуру класса кот. Какие поля и методы будут актуальны для приложения, которое является:
     *      а) информационной системой вереринарной клиники
     * 
     *      б) архивом выставки котов
     * 
     *      в) информационной системой театра кошек Ю.Д. Куклачёва
     * 
     * 2. Реализуйте один из вариантов класса. Создайте несколько экземпляров
     * 
     * 3. Добейтесь того, чтобы при выводе в консоль объекта, выводилась его кличка, цвет и возраст
     * 
     * 4. Создайте множество, в котором будет храниться экземпляры класса - HashSet<Cat>.
     *  Переместите в него некоторое колличество объектов.
     * 
     * 5. Создайте 2 или более котов с одиноковыми параметрами в полях. Поместите их во множество.
     *  Убедитесь, что все они сохранились во множество.
     */
    private String name;
    private String owner;
    private String breed;
    private Integer age;
    private List<String> healthHistory;

    public Cat (String name, String owner, String breed, int age){
        this.name = name;
        this.owner = owner;
        this.age = age;
        this.breed = breed;
    }
    @Override
    public String toString() {
        return "Имя : " + name + " Порода: " + breed + " Хозяин : " + owner + " Возраст : " + age;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if(!(obj instanceof Cat)) return false;
        Cat cat = (Cat) obj;
        return name.equals(cat.name) && breed.equals(cat.breed) && owner.equals(cat.owner) && age.equals(cat.age);
    }

    @Override
    public int hashCode(){
        return 2 * name.hashCode() + 3 * owner.hashCode() + 4 * breed.hashCode() + 5 * age;
    }


}
