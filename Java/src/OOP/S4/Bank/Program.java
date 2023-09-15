package OOP.S4.Bank;

public class Program {
    public static void main(String[] args) {

        Person person = new Person("FOI1", "20000000001");
        Entity entity = new Entity("GeekBrains", "90000000001");

        CreditAccount<Person> creditAccount1 = new CreditAccount<>(person , 54.22);
        DebetAccount<Entity> debetAccount2 = new DebetAccount<>(entity, 2000000);

        Transaction<Account> transaction = new Transaction<>(debetAccount2, creditAccount1, 25000);
        transaction.execute();
        transaction.execute();


    }
}
