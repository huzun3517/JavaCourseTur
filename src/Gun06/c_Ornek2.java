package Gun06;

import java.util.Scanner;

public class c_Ornek2 {

    public static void main(String[] args) {
        /* Kullanıcıdan Adını ve soyadını ayrı ayrı okutarak alıp
           birlikte ekrana yazdırınız. */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı giriniz: ");
        String ad = scanner.nextLine();

        System.out.print("Soyadınızı giriniz: ");
        String soyad = scanner.nextLine();

        System.out.println("Ad Soyad: " + ad + " " + soyad);
    }
}
