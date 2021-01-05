package Gun44._4_throwingException;

import java.util.Scanner;

public class _7_UncheckedThrowExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanıcı adı giriniz: ");
        String username = scanner.nextLine();

        try {
            if (username.length() < 6 )
                throw new Exception("6 karakterden az olamaz");
            // throw ile kendimiz hata oluşturuyoruz. böylece kriterlerimize girmeyenler için de catch bloğuna
            // düşürerek, pratik kullanım sağlıyoruz.

            if (username.length() > 10 )
                throw new Exception("10 karakterden fazla olamaz");
        }
        catch (Exception ex)
        {
            System.out.println("ex = " + ex);
        }





    }
}
