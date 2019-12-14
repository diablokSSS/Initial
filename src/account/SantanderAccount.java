package account;

public class SantanderAccount implements AccountOperations {

    private double balance;

    private double price1 = 10;
    private double price2 = 11;
    private double price3 = 10;

    public SantanderAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double x) {
        System.out.println("Deposit: " + String.valueOf(x) + " Balance is: " + String.valueOf(balance + x));
       balance += x;
    }

    @Override
    public double withdraw(double x) {
        System.out.println("Withdraw: " + String.valueOf(x) + " Balance is: " + String.valueOf(balance));
        if (balance < x) {
            System.out.println("There is not enough money");
            double temp = balance;
            balance = balance - balance;
            return temp;
        }
         else {
             balance -= x;
             return x;
        }
    }



}
