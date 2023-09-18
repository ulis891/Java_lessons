package OOP.S7.builder;

public class OrderBuilder {
    private Order order;

    public OrderBuilder() {
        order =new Order();
    }

    public Order build(){
        if (order.getProdId() <= 1000)
            throw new RuntimeException("Неверный ID товара");
        if (order.getQnt() <= 0)
            throw new RuntimeException("Неверное количество товара");
        if (order.getPrice() <= 0)
            throw new RuntimeException("Неверная цена");
        return order;
    }

    public OrderBuilder setName(String name){
        order.setName(name);
        return this;
    }

    public OrderBuilder setCompanyName(String companyName){
        order.setCompanyName(companyName);
        return this;
    }
    public OrderBuilder  setProdId(int prodId) {
        order.setProdId(prodId);
        return this;
    }

    public OrderBuilder setProdName(String prodName) {
        order.setProdName(prodName);
        return this;
    }

    public OrderBuilder  setQnt(int qnt) {
        order.setQnt(qnt);
        return this;
    }

    public OrderBuilder setPrice(double price) {
        order.setPrice(price);
        return this;
    }

    public OrderBuilder setSing(boolean sing) {
        order.setSing(sing);
        return this;
    }
}
