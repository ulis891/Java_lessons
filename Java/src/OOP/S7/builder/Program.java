package OOP.S7.builder;

public class Program {
    public static void main(String[] args) {
        Order order =  new OrderBuilder()
                                        .setCompanyName("aaa")
                                        .setName("asd")
                                        .setSing(true)
                                        .setProdName("wer")
                                        .build();
    }
}
