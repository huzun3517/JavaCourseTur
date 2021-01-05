package Gun08;

import java.util.Scanner;

public class b_Odev2 {

    public static void main(String[] args) {

        // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad ve soyadı 2 ayrı kelimeye ayırınız,
        // ad ayrı soyad ayrı şekilde ekrana yazdırınız.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ad Soyad : ");
        String ad_soyad = scanner.nextLine();

        int bosluknerde = ad_soyad.indexOf(" ");

        String alinan_ad = ad_soyad.substring(0,bosluknerde);
        String alinan_soyad = ad_soyad.substring(bosluknerde + 1);

        System.out.println("Ad = " + alinan_ad);
        System.out.println("Soyad = " + alinan_soyad);



    }
}
