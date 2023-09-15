package OOP.S6.SRP2;

import java.util.concurrent.atomic.AtomicInteger;

public class Order {

    /**
     * Отправляет заказ на запись в файл с заданным форматом
     * @param format формат файла
     */
    public void saveTo(String format){
        new SaveToFile(this, format);
    }

    /**
     * Отправляет файл на запись в формате по умолчанию (json)
     */
    public void saveTo(){
        new SaveToFile(this);
    }


    //region Constriction
    public Order(String clientName, String product, int qnt, int price) {
        this.id = nextId.incrementAndGet();
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;

    }

    public Order() {
        this.id = nextId.incrementAndGet();
    }
    //endregion
    private final int id;
    static AtomicInteger nextId = new AtomicInteger();
    private String clientName;
    private String product;
    private  int qnt;
    private int price;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", clientName='" + clientName + '\'' +
                ", product='" + product + '\'' +
                ", qnt=" + qnt +
                ", price=" + price +
                '}';
    }
    public int getId() {
        return id;
    }
    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }
}
