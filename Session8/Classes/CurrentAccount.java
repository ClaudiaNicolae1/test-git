package Session8.Classes;

import Session8.Classes.BankAccount;

public class CurrentAccount extends BankAccount {
    public CurrentAccount(int balance) {
        super(balance);
    }

    @Override
    public void deposit(int money) {
        balance += money;
        System.out.println("deposit: " + balance);
    }

    @Override
    public void withdraw(int money) {
        balance -= money;
        System.out.println("withdraw:" + balance);
    }
}
