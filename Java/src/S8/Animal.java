package S8;

public abstract class Animal {

    public void voice(){
        System.out.println("Подаёт голос");
    }

    public void jump(){
        System.out.println("Прыгает");

    }

    class Cat extends Animal{

    }
    class Dog extends Animal{
        @Override
        public void voice() {
            System.out.println("Лает");
        }
    }
}
