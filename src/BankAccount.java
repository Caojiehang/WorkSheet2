/**
* @Author: Jiehang CAO
* @Description: This is a BankAccount class including 4 params
* @Date: 6:11 PM 2018/10/13
*/
public class BankAccount {
    private int accountNumber;
    private int balance;
    private int setupFee;
    private int initialDeposite;

    public BankAccount(int accountNumber, int initialDeposite, int setupFee) {
        this.accountNumber = accountNumber;
        this.initialDeposite = initialDeposite;
        this.setupFee = setupFee;
        balance = initialDeposite - setupFee;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getSetupFee() {
        return setupFee;
    }

    public void setSetupFee(int setupFee) {
        this.setupFee = setupFee;
    }
    @Override
    public String toString() {
        return "The account number is: "+getAccountNumber()+"\n"+"The balance is: "+getBalance()+"\n"
                +"Note: Your initial deposite is "+ initialDeposite + " and setup fee is " +getSetupFee();
    }
}
