package S9.task1;

public class Program {

    /*
    Создать классы Собака и кот с наследованием класса животное. Все животные могут бежать и плыть. В качестве параметра
    каждому методу передается длина препятствия. Результатом выполнения действия будет пучать в консоль.
    У каждого животного есть ограничения на действия: бег - кот 200, собака 500; плавание - кот 0, собака 10.
    Добавить подсчет животных
     */
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Barsik"),
                new Cat("Tiger"),
                new Dog("Tuzik", 500, 50),
                new Dog("Sharik", 1500, 350),
                new Dog("Volk", 300, 150),
                new Dog("Dik", 200, 250),

        };
        for (Animal animal : animals){
            System.out.printf("%d - %s\n", animal.getId(), animal.getName());
            animal.swim(200);
            animal.run(600);
        }
        System.out.println("Счетчик ID - " + Animal.getIdCounter());
        System.out.println("Было создано - " + Animal.getCounter() + " животных");
        System.out.println("Было создано - " + Cat.getCounter() + " кошек");
        System.out.println("Было создано - " + Dog.getCounter() + " собак");
    }

}
