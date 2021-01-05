package Gun47.task2;

public class Banka {

    public static void main(String[] args) {

        //TODO
        // 1- bir Account sınıfı oluşturunuz, fieldları accountNumber ve balance (bakiye).
        // 2- bir consructor ekleyiniz.
        // 3- Account sınıfına deposit (ParaEkle) metodu ekleyiniz.
        // 4- Account sınıfına withdraw (ParaÇıkar) metodu ekleyiniz.
        // 5- withdraw de 5000 inin üzerine Günlük limiti aştınız uyarısı verelim
        // 6- main metodunda  account oluşturarak ihtimalleri deneyiniz.

        try {
            Account account1=new Account();
            account1.deposit(2000);
            System.out.println("account1.balance = " + account1.getBalance());
            account1.withdraw(500);
            System.out.println("account1.balance = " + account1.getBalance());

            account1.withdraw(2000); // yetersiz bakiye

            account1.withdraw(6000); // Günlük Limiti aştınız

        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }



    }
}