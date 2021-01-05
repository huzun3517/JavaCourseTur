package Gun47.task2;

public class Account {

    int accountNumber; // müşteri hesap no
    private double balance; // bakiye

    private static int Number=1; // otomatik verilecek sayac

    public Account() {

        this.accountNumber = Number++;
    }

    public void deposit(double gelenPara)
    {
        this.balance += gelenPara;
    }

    public void withdraw(double gidenPara)
    {
        if (gidenPara > 5000)
            throw new RuntimeException("Günlük Limiti aştınız");

        if (gidenPara > this.balance)
            throw new RuntimeException("Yetersiz Bakiye..");

        this.balance -= gidenPara;
    }


    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {

        return accountNumber;
    }

}