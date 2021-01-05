package Gun06;

import java.util.Scanner;

public class b_Ornek1 {

    public static void main(String[] args) {

        // Kullanıcıdan Adını ve Soyadını alarak ekrana yazdırınız.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı ve Soyadınızı giriniz : ");
        String ad = scanner.nextLine();  // Ekrandan bir satır okuyor.

        System.out.println("Ad Soyad: " + ad);
    }
}
