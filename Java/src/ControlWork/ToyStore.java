package ControlWork;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class ToyStore {

    private final ArrayList<Toy> toys;

    public ToyStore() {
        this.toys = new ArrayList<Toy>();
    }

    public ArrayList<Toy> getToys() {
        return toys;
    }

    /**
     * Добавляет игрушку для розыгрыша
     * @param toy игрушка Toy
     */
    protected void addToy(Toy toy){
        toys.add(toy);
    }


    /**
     * Изменяет частоту выпадения игрушки
     * @param toyId id игрушки
     * @param newProbability новая вероятность выпадения
     */
    public void updateFrequency(int toyId, int newProbability) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setProbability(newProbability);
                break;
            }
        }
    }


    /**
     * Выбирает случайным образом игрушку.
     * Создаёт частотный список с игрушками в зависимости от вероятности их выпадения.
     * Случайным образом из этого списка выбирает игрушку
     * @return выйгрышная игрушка
     */
    public Toy choosePrizeToy() {
        ArrayList<Toy> prizeToys = new ArrayList<Toy>();

        for (Toy toy : toys) {
            int totalProbability = (int)(toy.getProbability() * 100);
            for (int i = 0; i < totalProbability; i++) {
                prizeToys.add(toy);
            }
        }

        Random random = new Random();
        int randomIndex = random.nextInt(prizeToys.size());

        Toy prizeToy = prizeToys.get(randomIndex);
        prizeToys.remove(randomIndex);
        savePrizeToyToFile(prizeToy);
        decreaseQuantity(prizeToy);

        return prizeToy;
    }

    /**
     * Ведёт логирование разыграных призов в файле prize_toys.txt
     * @param prizeToy выйгрышная игрушка
     */
    private void savePrizeToyToFile(Toy prizeToy) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("prize_toys.txt", true))) {
            writer.write(prizeToy.getId() + "," + prizeToy.getName());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * Изменяет количество игрушек после розыгрыша
     * @param prizeToy выйгрышная игрушка
     */
    private void decreaseQuantity(Toy prizeToy) {
        for (Toy toy : toys) {
            if (toy.getId() == prizeToy.getId()) {
                toy.setQuantity(toy.getQuantity() - 1);
                break;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder toyString = new StringBuilder();
        for (Toy toy: toys) {
            toyString.append(toy);
        }
        return String.valueOf(toyString);
    }

}
