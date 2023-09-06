package S10.Bank;

public class Transaction<T extends Account> {

    private final T from;
    private final T to;

    private final double amount;

    public Transaction(T from, T to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public void execute(){
        if (from.getAmount() > amount){
            System.out.printf("Средства переведены на сумму %.2f\n" , amount);
            System.out.printf("Счет списания %s: %.2f\n", from.getData(), from.getAmount());
            System.out.printf("Счет зачисления %s: %.2f\n", to.getData(), to.getAmount());
            from.setAmount(from.getAmount() - amount);
            to.setAmount(to.getAmount() + amount);
            System.out.println("Ткущее состояние счетов:");
            System.out.println(from);
            System.out.println(to);
        }
        else {
            System.out.println("Недостаточно средств");
        }
    }
}
