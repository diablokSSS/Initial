package account;

public class MbankAccount implements AccountOperations {

    private double balance;

    public MbankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double x) {

    }

    @Override
    public double withdraw(double x) {
        return 0;
    }
}
