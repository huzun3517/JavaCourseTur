package Gun46.Encapsulation3;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
    //TODO
    // 1- filedları id, username, password, active (boolean), signedIn (boolean)
    //    olan User isimli bir class tanımlayınız.
    // 2- bütün fieldları parametre alan bir concructor tanımlayınız.
    // 3- bütün fieldları için getter ve setter metodları oluşturunuz.
    // 4- UserMain isminde main için bir class oluşturunuz.
    // 5- Kullanicidan 2 adet user bilgisi isteyerek bir ArrayList e doldurunuz.
    // 6- id yi sistem otomatik versin.
    // 7- Eğer password 6 dan küçük olursa yeniden useri girsin.Passwordun 6 karakterden küçük olup olmadığını classın içinde
    //    kontrol ediniz.

    public static void main(String[] args) {

        int miktar = 0;
        Scanner scanner = new Scanner(System.in);
        boolean usernameIste = true;
        String username = "";
        String password = "";
        ArrayList<User> userlistesi = new ArrayList<>();

        do {

            if (usernameIste){
                System.out.print((miktar + 1) + ".User Name: ");
                username = scanner.nextLine();
            }

            System.out.print("Pasword giriniz: ");
            password = scanner.nextLine();

            try {
                User yeniUser = new User(username,password);
                userlistesi.add(yeniUser);
                miktar++;
                usernameIste = true; // hata olmadığında bir sonraki kullanıcı için username istenecek
                yeniUser.setId();
            }
            catch (Exception ex) {
                usernameIste = false;
                System.out.println(ex.getMessage()); // hata olduğu durumda tekrar username isteme
            }



        }while (miktar < 5);

        for (User u: userlistesi){
            System.out.println(u);
        }











    }
}
