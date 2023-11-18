package Session8.Classes;

import Session8.Classes.BankAccount;

public class SavingAccount extends BankAccount {


    public SavingAccount(int balance) {
        super(balance);
    }

    @Override
    public void deposit(int money) {
        balance += money;
        System.out.println("deposit: " + balance);
    }

    @Override
    public void withdraw(int money) {
        if(balance - money <= 100){
            System.out.println("can't withdraw");
        }else{
            balance -= money;
            System.out.println("withdraw: " + balance);
        }
    }


}
