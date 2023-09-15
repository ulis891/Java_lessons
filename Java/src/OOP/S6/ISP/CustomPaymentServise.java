package OOP.S6.ISP;

public class CustomPaymentServise extends PaymentsServise implements CreditCardPayable, WebMoneyPayable{
    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Custom pay by web money %d", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Custom pay by credit card %d", amount);
    }

}
