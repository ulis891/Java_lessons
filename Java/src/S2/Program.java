package S2;


public class Program {

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>(4);


        String prevValue = hashMap.put("a", "Андрей");
        prevValue = hashMap.put("b", "Андрей");
        prevValue = hashMap.put("c", "Сергей");

    }

}

class Human{
    String name;
    int age;

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj instanceof Human){
            Human human = (Human) obj;
            if (name.equals(human.name) && age == human.age)
                return true;
        }
        return false;
    }
}