package Session8.Classes;

public abstract class BankAccount {
    protected int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public abstract void deposit(int money);
    public abstract void withdraw(int money);

}
