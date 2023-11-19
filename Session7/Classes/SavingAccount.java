package Session7.Classes;

public class SavingAccount extends BankAccount{
    private int withdraw;
    private int balance;


    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    public SavingAccount(int withdraw, int balance) {
        this.withdraw = withdraw;
        this.balance = balance;
    }

    @Override
    public void deposit() {
        System.out.println("deposit: " + balance);
    }

    @Override
    public int withdraw() {
        if(balance < 100){
            System.out.println("can't withdraw");
        }else{
            balance -= withdraw;
            System.out.print("new balance after withdraw: ");
        }
        return balance;
    }
}
