package Day2;

public class CheckingAccount {
    private double balance;
    private int number;
    public CheckingAccount (int number)
    {
        this.number = number;
    }

    public void deposit(double amount)
    {
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException
    {

    }



}
