package S12.SRP2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class SaveToFile {
    protected Order order;

    /**
     * Сохранят файл в заданном формате
     * @param order заказ
     * @param format формат сохранения файла. На даный момент реализаваны форматы json и txt
     */
    public SaveToFile(Order order, String format) {
        if (Objects.equals(format, "json")) {
            toJson(order);
        } else if (Objects.equals(format, "txt")) {
            toTxt(order);
        }
        else {
            toJson(order);
            System.out.println("Неизвестный формат. Сохранили заказ в формате json");
        }
    }

    /**
     * Сохранят файл в формате json
     * @param order заказ
     */
    public SaveToFile(Order order) {
        this.order = order;
        toJson(order);
    }

    /**
     * Создаейт файл формата txt и записывает в него данные
     * @param order заказ
     */
    private void toTxt(Order order){
        String fileName = "src/S12/SRP2/Orders/txt/Order_" + order.getId() + ".txt";
        try (FileWriter writer = new FileWriter(fileName,false)){
            writer.write("ID: " + order.getId() + ",\n");
            writer.write("clientName: " + order.getClientName() + ",\n");
            writer.write("product: " + order.getProduct() + ",\n");
            writer.write("qnt: " + order.getQnt() + ",\n");
            writer.write("price: " + order.getPrice() + "\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Создаейт файл формата json и записывает в него данные
     * @param order заказ
     */
    private void toJson(Order order){
        String fileName = "src/S12/SRP2/Orders/json/Order_" + order.getId() + ".json";
        try (FileWriter writer = new FileWriter(fileName,false)){
            writer.write("{\n");
            writer.write("\"ID\":\"" + order.getId() + "\",\n");
            writer.write("\"clientName\":\"" + order.getClientName() + "\",\n");
            writer.write("\"product\":\"" + order.getProduct() + "\",\n");
            writer.write("\"qnt\":\"" + order.getQnt() + "\",\n");
            writer.write("\"price\":\"" + order.getPrice() + "\"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
