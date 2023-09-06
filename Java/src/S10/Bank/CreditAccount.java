package S10.Bank;

public class CreditAccount<T extends PersonalData> extends Account<T> {
    public CreditAccount(T data, double amount) {
        super(data, amount);
    }
}
