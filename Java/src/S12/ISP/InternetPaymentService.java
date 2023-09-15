package S12.ISP;

public class InternetPaymentService extends PaymentsServise implements CreditCardPayable, WebMoneyPayable, PhonePayable{
    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Internet pay by web money %d", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Internet pay by credit card %d", amount);
    }

    @Override
    public void payPhoneNumber(int amount) {
        System.out.printf("Internet pay by phone number %d", amount);
    }
}
