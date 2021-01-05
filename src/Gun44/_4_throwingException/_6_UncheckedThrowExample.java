package Gun44._4_throwingException;

import java.util.Scanner;

public class _6_UncheckedThrowExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanıcı adı giriniz: ");
        String username = scanner.nextLine();

        if (username == null)
            System.out.println("Kullanıcı adı boş geçilemez");

        if (username.length() < 6 )
            System.out.println("Kullanıcı adı 6 karakterden az olamaz");

        if (username.length() > 10)
            System.out.println("Kullanıcı adı 10 karakterden buyuk olamaz");
    }
}
